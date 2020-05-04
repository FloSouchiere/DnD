package Personnages;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Character> charList = new ArrayList<>();
		Boolean program_end = false;
		Scanner scan = new Scanner(System.in);
		while (!program_end) {
			int input = 0;
			try {
				System.out.println("Choose action : Quit = 1, Add = 2");
				input = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException err) {
				System.out.println("WE SAID 1 OR 2 !");
				scan.next();
			}
			if (input == 2) {
				charList = NewChar.create(charList, scan);
			} else if (input == 1) {
				program_end = true;
			}
		}
		scan.close();
		displayChar_list(charList);
	}

	static void displayChar_list(ArrayList<Character> charList) {
		System.out.println("\n====== PRESENTATION =======");
		for (Character pignouf : charList) {
			System.out.println("\n\n" + pignouf.toString());
		}
		System.out.println("\n\n====== END =======");
	}
}