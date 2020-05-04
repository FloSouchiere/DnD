package Personnages;

public class Weapon  extends Stuff {

	private Weapon(int dmg, String name) {
		super(dmg, name);
	}

	public static Weapon frostmourne = new Weapon(5, "Fistmourne, slayer of Uranus");
	public static Weapon excalibur = new Weapon(7, "Excaliburne, crotch destroyer");
}