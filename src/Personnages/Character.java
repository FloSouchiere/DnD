package Personnages;

import java.lang.*;

/**
 * Creation of the SuperClass "Character" and the common attributes and get/set
 * methods.
 */
public class Character {

	String name;
	String img_url;
	int life;
	int strength;

	public int getLife() {
		return this.life;
	}

	public int getStrength() {
		return this.strength;
	}

	/**
	 * Allows the display of the Character's name plus a fancy description, not
	 * touching the toString method.
	 */

	public String getName() {
		String myClass = this.getClass().getSimpleName();
		switch (myClass) {
		case "Warrior":
			return this.name + " the SocialJusticeWarrior";
		case "Wizard":
			return this.name + " the Jizzhard";
		default:
			return myClass;
		}
	}
	/**
	 * Intended to ease the console display of the characters' list elements and
	 * appear as nice and complete as possible.
	 */

//	public String toString() {
	// return "I'm " + this.getName()+"\ni can use " + weapon.getName() + " and a "
	// + this.shield
	// + "\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : "
	// + this.getStrength();
//	}

//}

}
