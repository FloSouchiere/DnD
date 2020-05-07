package GameBoard;

import java.util.ArrayList;
import java.util.Random;

public class Board {

	public enum eventType {
		NONE, BONUS, MALUS
	}
	

	public static void initBoard(ArrayList <Boardcase> board) {
		eventType randomEvent = eventType.NONE;
		
		for (int i = 0; i<64; i++) {
			randomEvent = eventType.values()[new Random().nextInt(eventType.values().length)];
			switch (randomEvent) {
			case BONUS :
				Bonus bonus_case = new Bonus(i);
				bonus_case.setBonus(0);
				board.add(bonus_case);
				break;
			case MALUS :
				Malus malus_case = new Malus(i);
				malus_case.setMalus(0);
				board.add(malus_case);
				break;
			case NONE :
				Empty empty_case = new Empty(i);
				board.add(empty_case);
			}
		}
}
}