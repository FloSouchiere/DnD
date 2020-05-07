package GameBoard;

import java.util.ArrayList;

public class Displayboard {
	
	public static void display(ArrayList<Boardcase> Board) {
		for (int i=0; i< Board.size(); i++) {
			System.out.println("Case n° "+Board.get(i).getIndex()+" - Type :"+Board.get(i).getClass());
		}
	}
}
