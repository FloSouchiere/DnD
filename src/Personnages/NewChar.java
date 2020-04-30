package Personnages;

import java.util.Scanner;
import java.util.ArrayList;

public class NewChar {
	public static final int MAX_LIFE_WARRIOR = 10;
	public static final int MIN_LIFE_WARRIOR = 5;
	public static final int MIN_STRENGTH_WARRIOR = 5;
	public static final int MAX_STRENGTH_WARRIOR = 10;
	public static final int MAX_LIFE_WIZARD = 6;
	public static final int MIN_LIFE_WIZARD = 3;
	public static final int MIN_STRENGTH_WIZARD = 8;
	public static final int MAX_STRENGTH_WIZARD = 15;

	public static void main(String[] args) {
		Boolean program_end = false;

		ArrayList<Character> char_list = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		while (!program_end) {
			int input = 0;
			System.out.println("Choose action : Quit = 0, Add = 1");
			input = scan.nextInt();
			scan.nextLine();

			if (input == 1) {
				System.out.println("\nChoose spec : Wawa = 0, Mago = 1");
				input = scan.nextInt();
				scan.nextLine();
				System.out.println("\nInsert name");
				String char_name = scan.nextLine();
				if (input == 0) {
					int life_pts_rdm = (MIN_LIFE_WARRIOR
							+ (int) (Math.random() * ((MAX_LIFE_WARRIOR - MIN_LIFE_WARRIOR) + 1)));
					int strength_pts_rdm = (MIN_STRENGTH_WARRIOR
							+ (int) (Math.random() * ((MAX_STRENGTH_WARRIOR - MIN_STRENGTH_WARRIOR) + 1)));
					Weapon tmp_weapon = null;
					do {
						System.out.println("\nChoose your stuff, mothafucka' ! \n" + Weapon.excaliburne.get_name()
								+ " = 0\n" + Weapon.fistmourne.get_name() + " = 1");
						input = scan.nextInt();
						scan.nextLine();
						if (input == 0) {
							tmp_weapon = Weapon.excaliburne;
						} else if (input == 1) {
							tmp_weapon = Weapon.fistmourne;
						}
					} while (tmp_weapon == null);
					Warrior tmp_warrior = new Warrior(char_name, "oui.zob", life_pts_rdm, strength_pts_rdm, tmp_weapon,
							"boubou");
					char_list.add(tmp_warrior);
					System.out.println(tmp_warrior.get_name() + " added.\n");

				} else if (input == 1) {
					int life_pts_rdm = (MIN_LIFE_WIZARD
							+ (int) (Math.random() * ((MAX_LIFE_WIZARD - MIN_LIFE_WIZARD) + 1)));
					int strength_pts_rdm = (MIN_STRENGTH_WIZARD
							+ (int) (Math.random() * ((MAX_STRENGTH_WIZARD - MIN_STRENGTH_WIZARD) + 1)));
					Spell tmp_spell = null;
					do {
						System.out.println("\nChoose a spell :\n" + Spell.sputum.get_name() + " = 0\n"
								+ Spell.bukkake.get_name() + " = 1");
						input = scan.nextInt();
						scan.nextLine();
						if (input == 0) {
							tmp_spell = Spell.sputum;
						} else if (input == 1) {
							tmp_spell = Spell.bukkake;
						}
					} while (tmp_spell == null);
					Wizard tmp_wizard = new Wizard(char_name, "ok.zob", life_pts_rdm, strength_pts_rdm, tmp_spell,
							"beer");
					char_list.add(tmp_wizard);
					System.out.println(tmp_wizard.get_name() + " added.\n");
				}
			} else if (input == 0) {
				program_end = true;
			}

		}
		scan.close();
		System.out.println("\n====== Présentation =======");
		for (Character pignouf : char_list) {
			System.out.println("\n\n" + pignouf.toString());
		}
		System.out.println("\n\n====== END =======");

	}

}