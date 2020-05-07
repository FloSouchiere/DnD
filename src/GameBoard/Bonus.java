package GameBoard;

public class Bonus extends Boardcase {

	// Attributes

	private enum bonusType {
		POTION, EQUIPMENT
	}

	private bonusType bonusType;

	// Constructor

	/**
	 * 
	 */

	public Bonus(int index) {
		super(index);
	}

	// Setters

	public void setBonus(int randomBonus) {

		if (randomBonus == 0) {
			this.bonusType = bonusType.POTION;
		}

		else {
			this.bonusType = bonusType.EQUIPMENT;
		}

	}

	// Getters
	
	public Personnages.Stuff getBonus() {
		Personnages.Stuff tmp_stuff = null;
		
		if (this.bonusType == bonusType.POTION) {
			tmp_stuff = getRandomPotion();
		}
		else if (this.bonusType == bonusType.EQUIPMENT) {
			tmp_stuff = getRandomEquipment();
		}
		return tmp_stuff;
	}

	private Personnages.Stuff getRandomPotion() {
		return Personnages.Potion.bonus_S;
		
	}
	
	private Personnages.Stuff getRandomEquipment() {
		return Personnages.Weapon.excalibur;
	}
	
}
