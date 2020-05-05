package Personnages;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Character> charList = new ArrayList<>();
		NewChar charCreation = new NewChar();
		ModifChar pimpMyChar = new ModifChar();
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
	
	static void displaycharList(ArrayList<Character> charList) {
		System.out.println("\n====== PRESENTATION =======");
		for (Character character : charList) {
			System.out.println("\n\n" + character.toString());
		}
		System.out.println("\n\n====== END =======");
	}
}
