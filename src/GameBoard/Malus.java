package GameBoard;

import java.util.Random;


public class Malus extends Boardcase {
	
	// Attributes
	
	private enum malusType {
		FIGHT, TRAP
	};
	
	private malusType malusType;
	// Constructor
	
	public Malus(int index) {
		super(index);
	}
	
	// Setters ((((((((((((())))))))))))))

	public void setMalus(int randomMalus) {

		if (randomMalus == 0) {
			this.malusType = malusType.FIGHT;
		}

		else {
			this.malusType = malusType.TRAP;
		}

	}
	
	// Getters
	
	public Personnages.Stuff getrdmMalusPotion() {
		return Personnages.Potion.malus_S;
	}
	
	public int getOpponent() {
		Random rdm_int = new Random();
		return rdm_int.nextInt(5);
	}

}
