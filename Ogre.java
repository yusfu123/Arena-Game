/**
 * Ogre - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Ogre extends Monster {

	private String tribeName;
	private static final int HEALTH = 12;
	private static final int DAMAGE = 5;
	private static final double TREASURE_CARRIED = 1.5;

	public Ogre(int currentHealth, int damageDealt, double treasureCarried, String tribeName) {
		super(currentHealth, damageDealt, treasureCarried);
		this.tribeName = tribeName;
	}

	public Ogre() {
		super(HEALTH, DAMAGE, TREASURE_CARRIED);
		tribeName = "Unknown";
	}

	public String getTribeName() {
		return tribeName;
	}

	public void setTribeName(String tribeName) {
		this.tribeName = tribeName;
	}

	@Override
	public String toString() {
		return String.format("Ogre [ Monster [currentHealth=%d, damageDealt=%d, treasureCarrried=%.1f], ogreTribe= %s]",
				this.getCurrentHealth(), this.getDamageDealt(),this.getTreasureCarried(), tribeName);
	}

	@Override
	public void attack(Combatant target, int damage) {
		System.out.println("Ogre is attacking the Gladiator");
		getAttacked(target, damage);
	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		System.out.println("Ogre is preparing to be attacked");
		this.currentHealth -= damage;
		if (this.currentHealth > 0) {
			System.out.println("Ogre survived the attack");
		} else {
			System.out.println("Ogre was killed by the Gladiator");
		}
	}

}
