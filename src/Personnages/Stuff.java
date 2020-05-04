package Personnages;


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
	
	public String getName() {
		return this.name;
	}
}
