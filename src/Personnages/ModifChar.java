package Personnages;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author WorldChampions Here is the function used to Modify or Delete
 *         Characters. Characters are stocked in an ArrayList, using an index,
 *         as to be found and modified or deleted. Modifications can be done on
 *         the Name, Stuff and the Primary.
 * 
 */

public class ModifChar {
	private enum modify_input {
		QUIT, NAME, STUFF, DELETE, SHOW, NONE
	};

	private static final int FIRST_CHOICE = 1;
	private static final int SECOND_CHOICE = 2;

	/**
	 * This method verifies if the Characters's list is empty, and if not, purposes
	 * to modify Character's attributes, shows stats of the selected Character, or
	 * allow to delete the Character.
	 * 
	 * It uses an "enum" to increase the code's clearness.
	 * 
	 * @param charList
	 * @param scan
	 */

	public void modification(ArrayList<Character> charList, Scanner scan) {
		if (charList.size() == 0) {
			System.out.println("HA HA ! YOU'RE ALONE !");
		} else {
			int selected_index;
			modify_input input = modify_input.NONE;

			selected_index = selectIndex(charList, scan);
			Character selected_char = charList.get(selected_index);

			System.out.println("\nChange : Cancel = 0, Name = 1, Stuff = 2, GTFO = 3, Show Stats = 4");
			input = modify_input.values()[scan.nextInt()];
			scan.nextLine();

			if (input != modify_input.QUIT) {
				switch (input) {
				case NAME:
					changeName(scan, selected_char);
					break;
				case STUFF:
					modifyCharacter(scan, selected_char);
					break;
				case DELETE:
					charList.remove(selected_char);
					break;
				case SHOW:
					System.out.println(selected_char.toString());
					break;
				default:
				}
			}
		}
	}

	/**
	 * This method simply allows player to select the required character's index, as
	 * to use it to modifiy or delete it.
	 * 
	 * @param charList
	 * @param scan
	 * @return
	 */
	private int selectIndex(ArrayList<Character> charList, Scanner scan) {
		System.out.println("\n====== CHARACTER LIST =======");
		int i;
		for (i = 0; i < charList.size(); i++) {
			System.out.println("\n" + i + " : " + charList.get(i).getSimpleName());
		}
		System.out.println("\n====== END =======");
		Boolean input_validity = false;
		int input = 0;
		do {
			try {
				System.out.println("\nChoose number to modify");
				input = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException err) {
				System.out.println("WRONG CHOICE BITCH");
				scan.next();
			}
			if (input < charList.size() && input >= 0) {
				input_validity = true;
			} else {
				System.out.println("\nNOPE.");
			}
		} while (!input_validity);
		return input;
	}

	/**
	 * Here is where player can access and modify his character's name.
	 * 
	 * @param scan      : used to avoid renewing a user connection, as to use the
	 *                  one set previously.
	 * @param character : used to access the character's name setter of the chosen
	 *                  one.
	 */

	private void changeName(Scanner scan, Character character) {
		System.out.println("\nEnter new name");
		String new_name = scan.nextLine();
		character.setName(new_name);
	}

	/**
	 * 
	 * Here is where player can access and modify his character's primary. New
	 * character is here instantiated, to call one of it's methods, and then, to
	 * create a new stuff using it's character's method, depending on it's type
	 * (Warrior or Wizard).
	 * 
	 * The final goal is to allow user select one primary item into the library,
	 * linked to the param character. And to set the accessory attribute via a
	 * String as it is just a String. No try and catch used for this one, yet to
	 * come.
	 * 
	 * @param scan      : same than changeName method.
	 * @param character : same than chanName method.
	 */

	private void modifyCharacter(Scanner scan, Character character) {
		int input;
		NewChar selectStuff = new NewChar();
		System.out.println("\nChange : Primary = 1, Accessory = 2");
		input = scan.nextInt();
		scan.nextLine();
		if (input == FIRST_CHOICE) {
			Stuff selected_primary = selectStuff.selectPrimary(character, scan);
			character.setPrimary(selected_primary);
		}
		if (input == SECOND_CHOICE) {
			System.out.println("\nType a accessory");
			String new_accessory = scan.nextLine();
			character.setAccessory(new_accessory);
		}
	}

}