package Personnages;

/** Getter of dmg_bonus :
 * @return Integer of the bonus damage of the spell.*/

public class Stuff {
	private int dmg_bonus;
	private String name;
	
	public Stuff(int dmg_bonus, String name) {
		this.dmg_bonus = dmg_bonus;
		this.name = name;
	}
	
	public int getBonusDmg() {
		return this.dmg_bonus;
	}
	
/** Getter of the spell's name :
 * @return String of the name of the spell.*/
	
	public String getName() {
		return this.name;
	}
	
}
