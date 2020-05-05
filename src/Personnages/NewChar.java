package Personnages;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Define of meaningful constants used to randomly set the life and strength
 * attributes of each character.
 */

public class NewChar {
	private static final int MAX_LIFE_WARRIOR = 10;
	private static final int MIN_LIFE_WARRIOR = 5;
	private static final int MIN_STRENGTH_WARRIOR = 5;
	private static final int MAX_STRENGTH_WARRIOR = 10;
	private static final int MAX_LIFE_WIZARD = 6;
	private static final int MIN_LIFE_WIZARD = 3;
	private static final int MIN_STRENGTH_WIZARD = 8;
	private static final int MAX_STRENGTH_WIZARD = 15;
	private static final int FIRST_CHOICE = 0;
	private static final int SECOND_CHOICE = 1;

	/**
	 * Creation and addition of a new character in a list of characters Loops for as
	 * long as we need to add either a Warrior or Wizard Character to the game's
	 * list of characters by calling createWarrior() or createWizard() after setting
	 * the parameters such as name.. Once done, ends with the display of all
	 * characters' specs by calling display_charlist()
	 */

	public void create(ArrayList<Character> charList, Scanner scan) {
		int input = 0;
		System.out.println("\nChoose spec : Wawa = 0, Mago = 1");
		input = scan.nextInt();
		scan.nextLine();
		System.out.println("\nInsert name");
		String char_name = scan.nextLine();
		if (input == FIRST_CHOICE) {
			createWarrior(charList, scan, char_name);
		} else if (input == SECOND_CHOICE) {
			createWizard(charList, scan, char_name);
		}
	}

	/**
	 * Creation of a new Character "Wizard" This new Character is automatically
	 * stored in an ArrayList, is set using some user inputs, including:
	 * 
	 * @Param char_list ArrayList where the new Character is added
	 * @Param scan input used to choose spell
	 * @Param char_name sets the Character's name prior to addition in the list
	 */

	private void createWizard(ArrayList<Character> charList, Scanner scan, String char_name) {
		int life_pts_rdm = (MIN_LIFE_WIZARD + (int) (Math.random() * ((MAX_LIFE_WIZARD - MIN_LIFE_WIZARD) + 1)));
		int strength_pts_rdm = (MIN_STRENGTH_WIZARD
				+ (int) (Math.random() * ((MAX_STRENGTH_WIZARD - MIN_STRENGTH_WIZARD) + 1)));
		Character tmp_wizard = new Wizard(char_name, "ok.zob", life_pts_rdm, strength_pts_rdm);
		selectStuff(tmp_wizard, scan);
		charList.add(tmp_wizard);
		System.out.println(tmp_wizard.getSimpleName() + " added.\n");
	}

	/**
	 * Creation of a new Character "Warrior" This new Character is automatically
	 * stored in an ArrayList, is set using some user inputs, including:
	 * 
	 * @Param char_list ArrayList where the new Character is added
	 * @Param scan input used to choose weapon
	 * @Param char_name sets the Character's name prior to addition in the list
	 */

	private void createWarrior(ArrayList<Character> charList, Scanner scan, String char_name) {
		int life_pts_rdm = (MIN_LIFE_WARRIOR + (int) (Math.random() * ((MAX_LIFE_WARRIOR - MIN_LIFE_WARRIOR) + 1)));
		int strength_pts_rdm = (MIN_STRENGTH_WARRIOR
				+ (int) (Math.random() * ((MAX_STRENGTH_WARRIOR - MIN_STRENGTH_WARRIOR) + 1)));
		Character tmp_warrior = new Warrior(char_name, "oui.zob", life_pts_rdm, strength_pts_rdm);
		selectStuff(tmp_warrior, scan);
		charList.add(tmp_warrior);
		System.out.println(tmp_warrior.getSimpleName() + " added.\n");
	}

	public void selectStuff(Character character, Scanner scan) {
		Stuff selected_primary = selectPrimary(character, scan);
		character.setPrimary(selected_primary);
		System.out.println("\nType a accessory");
		String new_accessory = scan.nextLine();
		character.setAccessory(new_accessory);
	}

	public Stuff selectPrimary(Character character, Scanner scan) {
		Stuff tmp_stuff = null;
		do {
			if (character.getClass() == Warrior.class) {
				tmp_stuff = selectWeapon(scan);
			}
			if (character.getClass() == Wizard.class) {
				tmp_stuff = selectSpell(scan);
			}
		} while (tmp_stuff == null);
		return tmp_stuff;
	}

	public Weapon selectWeapon(Scanner scan) {
		int input;
		Weapon tmp_weapon = null;
		System.out.println("\nChoose your stuff, mothafucka' ! \n" + Weapon.excalibur.getName() + " = 0\n"
				+ Weapon.frostmourne.getName() + " = 1");
		input = scan.nextInt();
		scan.nextLine();
		if (input == FIRST_CHOICE) {
			tmp_weapon = Weapon.excalibur;
		} else if (input == SECOND_CHOICE) {
			tmp_weapon = Weapon.frostmourne;
		}
		return tmp_weapon;
	}

	public Spell selectSpell(Scanner scan) {
		int input;
		Spell tmp_spell = null;
		System.out
				.println("\nChoose a spell :\n" + Spell.sputum.getName() + " = 0\n" + Spell.bukkake.getName() + " = 1");
		input = scan.nextInt();
		scan.nextLine();
		if (input == FIRST_CHOICE) {
			tmp_spell = Spell.sputum;
		} else if (input == SECOND_CHOICE) {
			tmp_spell = Spell.bukkake;
		}
		return tmp_spell;
	}
}
