package Main;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Personnages.Character> charList = new ArrayList<>();
		Personnages.NewChar charCreation = new Personnages.NewChar();
		Personnages.ModifChar pimpMyChar = new Personnages.ModifChar();
		Boolean program_end = false;
		Scanner scan = new Scanner(System.in);
		while (!program_end) {
			int input = 0;
			try {
				System.out.println("\nChoose action : Quit = 1, Add = 2, Pimp your character = 3");
				input = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException err) {
				System.out.println("\nWE SAID 1, 2 OR 3 !");
				scan.next();
			}
			if (input == 2) {
				charCreation.create(charList, scan);
			} else if (input == 1) {
				program_end = true;
			} else if (input == 3) {
				pimpMyChar.modification(charList, scan);
			}
		}
		scan.close();
		displaycharList(charList);
	}

/** Displays the Characters' list
* Loops in the Characters list to display each element using the Console, and using the parameter:
* @Param char_list		Allows to display all attributes using the toString method for each elements */
	
	static void displaycharList(ArrayList<Personnages.Character> charList) {
		System.out.println("\n====== PRESENTATION =======");
		for (Personnages.Character character : charList) {
			System.out.println("\n\n" + character.toString());
		}
		System.out.println("\n\n====== END =======");
	}
}
