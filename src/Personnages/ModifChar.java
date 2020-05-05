package Personnages;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ModifChar {

	public void modification(ArrayList<Character> charList, Scanner scan) {
		if (charList.size() == 0) {
			System.out.println("HA HA ! YOU'RE ALONE !");
		} else {
			int selected_index;
			selected_index = selectIndex(charList, scan);
			NewChar selectStuff = new NewChar();
			int input;
			System.out.println("\nChange : Cancel = 0, Name = 1, Stuff = 2, GTFO = 3");
			input = scan.nextInt();
			scan.nextLine();
			if (input != 0) {
				if (input == 1) {
					changeName(scan, charList.get(selected_index));
				}
				if (input == 2) {
					if (charList.get(selected_index).getClass() == Warrior.class) {
						modifyWarrior(scan, selectStuff, charList.get(selected_index));
					} else if (charList.get(selected_index).getClass() == Wizard.class) {
						modifyWizard(scan, selectStuff, charList.get(selected_index));
					}
				}
				if (input == 3) {
					charList.remove(charList.get(selected_index));
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

	private void modifyWizard(Scanner scan, NewChar selectStuff, Character character) {
		int input;
		System.out.println("\nChange : Spell = 1, Philter = 2");
		input = scan.nextInt();
		scan.nextLine();
		if (input == 1) {
			Spell selected_spell = selectStuff.selectSpell(scan);
			((Wizard) character).setSpell(selected_spell);
		}
		if (input == 2) {
			System.out.println("\nType a philter");
			String new_philter = scan.nextLine();
			((Wizard) character).setPhilter(new_philter);
		}
	}

	private void modifyWarrior(Scanner scan, NewChar selectStuff, Character character) {
		int input;
		System.out.println("\nChange : Weapon = 1, Shield = 2");
		input = scan.nextInt();
		scan.nextLine();
		if (input == 1) {
			Weapon selected_weap = selectStuff.selectWeapon(scan);
			((Warrior) character).setWeapon(selected_weap);
		}
		if (input == 2) {
			System.out.println("\nType a shield");
			String new_shield = scan.nextLine();
			((Warrior) character).setShield(new_shield);
		}
	}

}