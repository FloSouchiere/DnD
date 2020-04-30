package Personnages;

public class Spell {
	private int dmg_bonus;
	private String name;

	private Spell(int dmg, String name) {
		this.dmg_bonus = dmg;
		this.name = name;
	}

	public int get_bonus_dmg() {
		return this.dmg_bonus;
	}
	
	public String get_name() {
		return this.name;
	}

	public static Spell sputum = new Spell(5, "Sputum, respect score -10");
	public static Spell bukkake = new Spell(7, "Bukkake, ewww it's sticky..");
}