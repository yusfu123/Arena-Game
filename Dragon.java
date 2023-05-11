/**
 * Dragon - An example class for assignment: Final Project Copyright 2021 Howard
 * Community College
 * 
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Dragon extends Monster {
	private static final int HEALTH = 40;
	private static final int DAMAGE = 13;
	private static final double TREASURE_CARRIED = 1.5;

	public Dragon(int currentHealth, int damageDealt, double treasureCarried) {
		super(currentHealth, damageDealt, treasureCarried);
	}

	public Dragon() {
		super(HEALTH, DAMAGE, TREASURE_CARRIED);
	}

	public String toString() {
		return String.format("Dragon [ Monster [currentHealth=%d, damageDealt=%d, treasureCarrried=%.1f]",
				this.getCurrentHealth(), this.getDamageDealt(), this.getTreasureCarried());
	}

	@Override
	public void attack(Combatant target, int damage) {
		System.out.println("Dragon is attacking the Gladiator");
		getAttacked(target, damage);
	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		System.out.println("Dragon is preparing to be attacked");
		this.currentHealth -= damage;
		if (this.currentHealth > 0) {
			System.out.println("Dragon survived the attack");
		} else {
			System.out.println("Dragon was killed by the Gladiator");
		}
	}

}
