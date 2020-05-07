package Personnages;

public class Potion extends Stuff{

	// Attributes
	
	private int power;
	
	// Constructor
	
	/**
	 * 
	 * 
	 */
	
	public Potion (int power) {
		this.power = power;
		
	}
	
	public int getPower() {
		return this.power;
	}
	
	public static Potion bonus_S = new Potion(1);
	public static Potion bonus_M = new Potion(2);
	public static Potion bonus_L = new Potion(3);
	public static Potion malus_S = new Potion(-1);
	public static Potion malus_M = new Potion(-2);
	public static Potion malus_L = new Potion(-3);
	
}
