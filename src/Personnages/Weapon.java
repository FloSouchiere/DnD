package Personnages;

public class Weapon {
	private int dmg_bonus;
	private String name;

	private Weapon(int dmg, String name) {
		this.dmg_bonus = dmg;
		this.name = name;
	}

	public int getBonusDamage() {
		return this.dmg_bonus;
	}
	
	public String getName() {
		return this.name;
	}

	public static Weapon fistmourne = new Weapon(5, "Fistmourne, slayer of Uranus");
	public static Weapon excaliburne = new Weapon(7, "Excaliburne, crotch destroyer");
}