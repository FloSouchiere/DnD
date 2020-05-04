package Personnages;

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
	
	public String getName() {
		return this.name;
	}
	
	public void setLife(int new_life) {
		this.life = new_life;
	}
	
	public String toString() {
		return ("\nhere's my BIG attributes...\nLIFE : " + this.getLife() + "\nSTRENGTH : " + this.getStrength());
	}
}