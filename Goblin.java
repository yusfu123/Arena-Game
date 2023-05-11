/**
 * Goblin - An example class for assignment: Final Project Copyright 2021 Howard
 * Community College
 * 
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Goblin extends Monster {

	private int annoyanceLevel;
	private static final int HEALTH = 3;
	private static final int DAMAGE = 3;
	private static final double TREASURE_CARRIED = 1.5;

	public Goblin() {
		super(HEALTH, DAMAGE, TREASURE_CARRIED);
		annoyanceLevel = 5;
	}

	public Goblin(int currentHealth, int damageDealt, double treasureCarried, int annoyanceLevel) {
		super(currentHealth, damageDealt, treasureCarried);
		this.annoyanceLevel = annoyanceLevel;
	}

	public int getAnnoyanceLevel() {
		return annoyanceLevel;
	}

	public void setAnnoyanceLevel(int aL) {
		annoyanceLevel = aL;
	}

	public String toString() {
		return String.format(
				"Goblin [ Monster [currentHealth=%d, damageDealt=%d, treasureCarrried=%.1f], annoyanceLevel= %d]",
				this.getCurrentHealth(), this.getDamageDealt(), this.getTreasureCarried(), annoyanceLevel);
	}

	@Override
	public void attack(Combatant target, int damage) {
		System.out.println("Goblin is attacking the Gladiator");
		getAttacked(target, damage);
	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		System.out.println("Goblin is preparing to be attacked");
		this.currentHealth -= damage;
		if (this.currentHealth > 0) {
			System.out.println("Goblin survived the attack");
		} else {
			System.out.println("Goblin was killed by the Gladiator");
		}
	}

}
