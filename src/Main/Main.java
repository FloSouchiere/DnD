package Main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import GameBoard.Boardcase;

public class Main {
	private enum main_input {
		QUIT, CREATION, MODIFY, DISPLAY, SHOW_BOARD, NONE
	};

	public static void main(String[] args) {
		ArrayList<Personnages.Character> charList = new ArrayList<>();
		ArrayList <GameBoard.Boardcase> board = new ArrayList<Boardcase>();
		GameBoard.Board.initBoard(board);
		Personnages.NewChar charCreation = new Personnages.NewChar();
		Personnages.ModifChar pimpMyChar = new Personnages.ModifChar();
		Boolean program_end = false;
		Scanner scan = new Scanner(System.in);
		while (!program_end) {
			main_input input = main_input.NONE;
			try {
				System.out.println("\nChoose action : Quit = 0, Add = 1, Pimp your character = 2, Display characters = 3, Show board = 4");
				input = main_input.values()[scan.nextInt()];
				scan.nextLine();
			} catch (InputMismatchException err) {
				System.out.println("\nWE SAID 1, 2 OR 3 !");
				scan.next();
			} catch (ArrayIndexOutOfBoundsException err) {
				System.out.println("\nAGAIN, HE DISAPPOINT US...");
			}
			switch (input) {
			case CREATION:
				charCreation.create(charList, scan);
				break;
			case QUIT:
				program_end = true;
				break;
			case MODIFY:
				pimpMyChar.modification(charList, scan);
				break;
			case DISPLAY:
				displaycharList(charList);
				break;
			case SHOW_BOARD:
				GameBoard.Displayboard.display(board);
			default:
			}
		}
		scan.close();
		displaycharList(charList);
	}

	/**
	 * Displays the Characters' list Loops in the Characters list to display each
	 * element using the Console, and using the parameter:
	 * 
	 * @Param char_list Allows to display all attributes using the toString method
	 *        for each elements
	 */

	static void displaycharList(ArrayList<Personnages.Character> charList) {
		System.out.println("\n====== PRESENTATION =======");
		for (Personnages.Character character : charList) {
			System.out.println("\n\n" + character.toString());
		}
		System.out.println("\n\n====== END =======");
	}
}
