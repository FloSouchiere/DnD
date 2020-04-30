package Personnages;

/** Class whose purpose is to list every available weapon and related specs for super methods/classes.
 * Specs so far are : name, damage.*/

public class Weapon {
	private int dmg_bonus;
	private String name;

	private Weapon(int dmg, String name) {
		this.dmg_bonus = dmg;
		this.name = name;
	}

/** Getter of dmg_bonus :
 * @return Integer of the bonus damage of the weapon.*/
	
	public int getBonusDamage() {
		return this.dmg_bonus;
	}
	
/** Getter of the weapon's name :
 * @return String of the name of the weapon.*/
	
	public String getName() {
		return this.name;
	}
// Single instances of each and every available weapon

	public static Weapon fistmourne = new Weapon(5, "Fistmourne, slayer of Uranus");
	public static Weapon excaliburne = new Weapon(7, "Excaliburne, crotch destroyer");
}