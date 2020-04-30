package Personnages;

import java.util.Scanner;
import java.util.ArrayList;

/** Define of meaningful constants used to randomly set the life and strength attributes of each character.*/

public class NewChar {
	public static final int MAX_LIFE_WARRIOR = 10;
	public static final int MIN_LIFE_WARRIOR = 5;
	public static final int MIN_STRENGTH_WARRIOR = 5;
	public static final int MAX_STRENGTH_WARRIOR = 10;
	public static final int MAX_LIFE_WIZARD = 6;
	public static final int MIN_LIFE_WIZARD = 3;
	public static final int MIN_STRENGTH_WIZARD = 8;
	public static final int MAX_STRENGTH_WIZARD = 15;

/** Creation and addition of a new character in a list of characters
 * Loops for as long as we need to add either a Warrior or Wizard Character to the game's list of characters
 * by calling createWarrior() or createWizard() after setting the parameters such as name..
 * Once done, ends with the display of all characters' specs by calling display_charlist()*/
	
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
					createWarrior(char_list, scan, char_name);
					
				} else if (input == 1) {
					createWizard(char_list, scan, char_name);
				}
				
			} else if (input == 0) {
				program_end = true;
			}
		}
		
		scan.close();
		displayCharList(char_list);
	}

/** Displays the Characters' list
* Loops in the Characters list to display each element using the Console, and using the parameter:
* @Param char_list		Allows to display all attributes using the toString method for each elements */
	
	private static void displayCharList(ArrayList<Character> char_list) {
		
		System.out.println("\n====== Présentation =======");
		for (Character pignouf : char_list) {
			System.out.println("\n\n" + pignouf.toString());
		}
		
		System.out.println("\n\n====== END =======");
	}

/** Creation of a new Character "Wizard" 
* This new Character is automatically stored in an ArrayList, is set using some user inputs, including:
* @Param char_list		ArrayList where the new Character is added
* @Param scan			input used to choose spell
* @Param char_name		sets the Character's name prior to addition in the list */
	
	private static void createWizard(ArrayList<Character> char_list, Scanner scan, String char_name) {
		
		int input;
		int life_pts_rdm = (MIN_LIFE_WIZARD + (int) (Math.random() * ((MAX_LIFE_WIZARD - MIN_LIFE_WIZARD) + 1)));
		int strength_pts_rdm = (MIN_STRENGTH_WIZARD
				+ (int) (Math.random() * ((MAX_STRENGTH_WIZARD - MIN_STRENGTH_WIZARD) + 1)));
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
		Wizard tmp_wizard = new Wizard(char_name, "ok.zob", life_pts_rdm, strength_pts_rdm, tmp_spell, "beer");
		char_list.add(tmp_wizard);
		System.out.println(tmp_wizard.getName() + " added.\n");
	}
/** Creation of a new Character "Warrior" 
 * This new Character is automatically stored in an ArrayList, is set using some user inputs, including:
 * @Param char_list		ArrayList where the new Character is added
 * @Param scan			input used to choose weapon
 * @Param char_name		sets the Character's name prior to addition in the list */
	
	private static void createWarrior(ArrayList<Character> char_list, Scanner scan, String char_name) {
		
		int input;
		int life_pts_rdm = (MIN_LIFE_WARRIOR + (int) (Math.random() * ((MAX_LIFE_WARRIOR - MIN_LIFE_WARRIOR) + 1)));
		int strength_pts_rdm = (MIN_STRENGTH_WARRIOR
				+ (int) (Math.random() * ((MAX_STRENGTH_WARRIOR - MIN_STRENGTH_WARRIOR) + 1)));
		Weapon tmp_weapon = null;
		
		do {
			System.out.println("\nChoose your stuff, mothafucka' ! \n" + Weapon.excaliburne.getName() + " = 0\n"
					+ Weapon.fistmourne.getName() + " = 1");
			input = scan.nextInt();
			scan.nextLine();
			
			if (input == 0) {
				tmp_weapon = Weapon.excaliburne;
				
			} else if (input == 1) {
				tmp_weapon = Weapon.fistmourne;
			}
			
		} while (tmp_weapon == null);
		Warrior tmp_warrior = new Warrior(char_name, "oui.zob", life_pts_rdm, strength_pts_rdm, tmp_weapon, "boubou");
		char_list.add(tmp_warrior);
		System.out.println(tmp_warrior.getName() + " added.\n");
	}
}