package Personnages;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class NewChar {
	public static void main(String[] args) {
		Boolean program_end = false;

		List<Character> char_list = new LinkedList<>();

		int listIndex = 0;
		Scanner scan = new Scanner(System.in);
		while (!program_end) {
			int input = 0;
			System.out.println("Choose action : Add = 1, Quit = 0");
			input = scan.nextInt();
			scan.nextLine();

			if (input == 1) {
				int classChoice = 0;
				System.out.println("Choose spec : Wawa = 0, Mago = 1");
				input = scan.nextInt();
				scan.nextLine();
				System.out.println("Insert name");
				String char_name = scan.nextLine();
				if (classChoice == 0) {
					int life_pts_rdm = (int) Math.floor((Math.random() * 10) + 5);
					int strength_pts_rdm = (int) Math.floor((Math.random() * 10) + 5);
					System.out.println("Choose your stuff, mothafucka' ! \n" + Weapon.excaliburne.get_name() + " = 1\n"
							+ Weapon.fistmourne.get_name() + " = 2\n");
					input = scan.nextInt();
					scan.nextLine();
					Weapon tmp_weapon;
					if (input == 1) {
						tmp_weapon = Weapon.excaliburne;
					} else {
						tmp_weapon = Weapon.fistmourne;

					}
					Warrior tmp_warrior = new Warrior(char_name, "oui.zob", life_pts_rdm, strength_pts_rdm, tmp_weapon,
							"boubou");
					char_list.add(tmp_warrior);
				}
			} else if (input == 0) {
				program_end = true;
			}

		}
		scan.close();
		System.out.println("Présentation : "+char_list.get(0).toString());
	}

}