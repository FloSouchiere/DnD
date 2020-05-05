package Personnages;

/**
 * Creation of the SuperClass "Character" and the common attributes and get/set
 * methods.
 */

abstract class Character {
	private String name;
	private String img_url;
	private int life;
	private int strength;

	public Character(String name, String url, int life, int strength) {
		this.name = name;
		this.img_url = url;
		this.life = life;
		this.strength = strength;
	}

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
	
//	public String getName() {
//		return this.name;
//	}
	
	public void setName(String new_name) {
		this.name = new_name;
	}
	/**
	 * Intended to ease the console display of the characters' list elements and
	 * appear as nice and complete as possible.
	 */
	
	public void setLife(int new_life) {
		this.life = new_life;
	}
	
	public String getSimpleName() {
		return this.name;
	}
	
	public String toString() {
		return ("\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : " + this.getStrength());
	}
}
