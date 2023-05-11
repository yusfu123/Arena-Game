/**
 * Gladiator - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Gladiator implements Combatant {
	String name;
	int currentHealth;
	Weapon nWeapon;
	Armor nArmor;
	double treasureCarried;

	public Gladiator(String name, int currentHealth, Weapon nWeapon, Armor nArmor, double treasureCarried) {
		super();
		this.name = name;
		this.currentHealth = currentHealth;
		this.nWeapon = nWeapon;
		this.nArmor = nArmor;
		this.treasureCarried = treasureCarried;
	}

	public Gladiator() {
		this.currentHealth = 10;
		this.nWeapon = new Club();
		this.nArmor = new Rags();
		this.treasureCarried = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public Weapon getWeapon() {
		return nWeapon;
	}

	public void setWeapon(Weapon nWeapon) {
		this.nWeapon = nWeapon;
	}

	public Armor getArmor() {
		return nArmor;
	}

	public void setArmor(Armor nArmor) {
		this.nArmor = nArmor;
	}

	public double getTreasureCarried() {
		return treasureCarried;
	}

	public void setTreasureCarried(double treasureCarried) {
		this.treasureCarried = treasureCarried;
	}

	@Override
	public String toString() {
		return String.format("%s the Gladiator [ hp: %d, silver: %.1f]%nWeapon: %s%nArmor: %s", name, currentHealth,
				treasureCarried, nWeapon, nArmor);
	}

	@Override
	public void attack(Combatant target, int damage) {
		System.out.println("Gladiator is attacking the opponent");
		getAttacked(target, damage);
	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		System.out.println("Gladiator is preparing to be attacked");
		this.currentHealth -= damage;
		if (this.currentHealth > 0) {
			System.out.println("Gladiator survived the attack");
		} else {
			System.out.println("Gladiator was killed by opponent");
		}
	}

	@Override
	public void setDamageDealt(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getDamageDealt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
