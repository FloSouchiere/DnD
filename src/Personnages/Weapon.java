package Personnages;

/** Class whose purpose is to list every available weapon and related specs for super methods/classes.
 * Specs so far are : name, damage.*/

public class Weapon  extends Stuff {

	private Weapon(int dmg, String name) {
		super(dmg, name);
	}

	public static Weapon frostmourne = new Weapon(5, "Fistmourne, slayer of Uranus");
	public static Weapon excalibur = new Weapon(7, "Excaliburne, crotch destroyer");
}
