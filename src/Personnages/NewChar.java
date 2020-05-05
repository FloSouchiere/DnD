package Personnages;

import java.util.Scanner;
import java.util.ArrayList;

public class NewChar {
	private static final int MAX_LIFE_WARRIOR = 10;
	private static final int MIN_LIFE_WARRIOR = 5;
	private static final int MIN_STRENGTH_WARRIOR = 5;
	private static final int MAX_STRENGTH_WARRIOR = 10;
	private static final int MAX_LIFE_WIZARD = 6;
	private static final int MIN_LIFE_WIZARD = 3;
	private static final int MIN_STRENGTH_WIZARD = 8;
	private static final int MAX_STRENGTH_WIZARD = 15;

	public void create(ArrayList<Character> charList, Scanner scan) {
		int input = 0;
		System.out.println("\nChoose spec : Wawa = 0, Mago = 1");
		input = scan.nextInt();
		scan.nextLine();
		System.out.println("\nInsert name");
		String char_name = scan.nextLine();
		if (input == 0) {
			createWarrior(charList, scan, char_name);
		} else if (input == 1) {
			createWizard(charList, scan, char_name);
		}
	}

	private void createWizard(ArrayList<Character> charList, Scanner scan, String char_name) {
		int life_pts_rdm = (MIN_LIFE_WIZARD + (int) (Math.random() * ((MAX_LIFE_WIZARD - MIN_LIFE_WIZARD) + 1)));
		int strength_pts_rdm = (MIN_STRENGTH_WIZARD
				+ (int) (Math.random() * ((MAX_STRENGTH_WIZARD - MIN_STRENGTH_WIZARD) + 1)));
		Spell tmp_spell = selectSpell(scan);
		Character tmp_wizard = new Wizard(char_name, "ok.zob", life_pts_rdm, strength_pts_rdm, tmp_spell, "beer");
		charList.add(tmp_wizard);
		System.out.println(tmp_wizard.getSimpleName() + " added.\n");
	}

	private void createWarrior(ArrayList<Character> charList, Scanner scan, String char_name) {
		int life_pts_rdm = (MIN_LIFE_WARRIOR + (int) (Math.random() * ((MAX_LIFE_WARRIOR - MIN_LIFE_WARRIOR) + 1)));
		int strength_pts_rdm = (MIN_STRENGTH_WARRIOR
				+ (int) (Math.random() * ((MAX_STRENGTH_WARRIOR - MIN_STRENGTH_WARRIOR) + 1)));
		Weapon tmp_weapon = selectWeapon(scan);
		Character tmp_warrior = new Warrior(char_name, "oui.zob", life_pts_rdm, strength_pts_rdm, tmp_weapon, "boubou");
		charList.add(tmp_warrior);
		System.out.println(tmp_warrior.getSimpleName() + " added.\n");
	}

	public Weapon selectWeapon(Scanner scan) {
		int input;
		Weapon tmp_weapon = null;
		do {
			System.out.println("\nChoose your stuff, mothafucka' ! \n" + Weapon.excalibur.getName() + " = 0\n"
					+ Weapon.frostmourne.getName() + " = 1");
			input = scan.nextInt();
			scan.nextLine();
			if (input == 0) {
				tmp_weapon = Weapon.excalibur;
			} else if (input == 1) {
				tmp_weapon = Weapon.frostmourne;
			}
		} while (tmp_weapon == null);
		return tmp_weapon;
	}

	public Spell selectSpell(Scanner scan) {
		int input;
		Spell tmp_spell = null;
		do {
			System.out.println(
					"\nChoose a spell :\n" + Spell.sputum.getName() + " = 0\n" + Spell.bukkake.getName() + " = 1");
			input = scan.nextInt();
			scan.nextLine();
			if (input == 0) {
				tmp_spell = Spell.sputum;
			} else if (input == 1) {
				tmp_spell = Spell.bukkake;
			}
		} while (tmp_spell == null);
		return tmp_spell;
	}
}