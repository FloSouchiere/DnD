package Personnages;

public class Spell {
	private int dmg_bonus;

	private Spell(int dmg) {
		this.dmg_bonus = dmg;
	}

	public int get_bonus_dmg() {
		return this.dmg_bonus;
	}

	public static Spell sputum = new Spell(5);
	public static Spell bukkake = new Spell(7);
}