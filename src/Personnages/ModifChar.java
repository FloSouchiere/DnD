package Personnages;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ModifChar {
	private enum modify_input {
		QUIT, NAME, STUFF, DELETE, NONE
	};
	private static final int FIRST_CHOICE = 1;
	private static final int SECOND_CHOICE = 2;	

	public void modification(ArrayList<Character> charList, Scanner scan) {
		if (charList.size() == 0) {
			System.out.println("HA HA ! YOU'RE ALONE !");
		} else {
			int selected_index;
			selected_index = selectIndex(charList, scan);
			NewChar selectStuff = new NewChar();
			modify_input input = modify_input.NONE;
			System.out.println("\nChange : Cancel = 0, Name = 1, Stuff = 2, GTFO = 3");
			input = modify_input.values()[scan.nextInt()];
			scan.nextLine();
			if (input != modify_input.QUIT) {
				switch (input) {
				case NAME:
					changeName(scan, charList.get(selected_index));
					break;
				case STUFF:
					modifyCharacter(scan, selectStuff, charList.get(selected_index));
					break;
				case DELETE:
					charList.remove(charList.get(selected_index));
				default:
				}
			}
		}
	}

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

	private void changeName(Scanner scan, Character character) {
		System.out.println("\nEnter new name");
		String new_name = scan.nextLine();
		character.setName(new_name);
	}

	private void modifyCharacter(Scanner scan, NewChar selectStuff, Character character) {
		int input;
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