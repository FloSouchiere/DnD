package Personnages;

public class Weapon {
	private int dmg_bonus;
	private String name;

	private Weapon(int dmg, String name) {
		this.dmg_bonus = dmg;
		this.name = name;
	}

	public int get_bonus_dmg() {
		return this.dmg_bonus;
	}
	
	public String get_name() {
		return this.name;
	}

	public static Weapon fistmourne = new Weapon(5, "Fistmourne slayer of Uranus");
	public static Weapon excaliburne = new Weapon(7, "Excaliburne, Balls destructor");
}