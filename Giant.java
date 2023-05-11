/**
 * Giant - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Giant extends Monster {
	private static final int HEALTH = 20;
	private static final int DAMAGE = 8;
	private static final double TREASURE_CARRIED = 1.5;

	public Giant(int currentHealth, int damageDealt, double treasureCarried) {
		super(currentHealth, damageDealt, treasureCarried);
	}

	public Giant() {
		super(HEALTH, DAMAGE, TREASURE_CARRIED);
	}

	public String toString() {
		return String.format("Giant [ Monster [currentHealth=%d, damageDealt=%d, treasureCarrried=%.1f]]", this.getCurrentHealth(),
				this.getDamageDealt(), this.getTreasureCarried());
	}

	@Override
	public void attack(Combatant target, int damage) {
		System.out.println("Giant is attacking the Gladiator");
		getAttacked(target, damage);
	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		System.out.println("Giant is preparing to be attacked");
		this.currentHealth -= damage;
		if (this.currentHealth > 0) {
			System.out.println("Giant survived the attack");
		} else {
			System.out.println("Giant was killed by the Gladiator");
		}
	}

}
