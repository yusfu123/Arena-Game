/**
 * Monster - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public abstract class Monster implements Combatant{
	protected int currentHealth;
	protected int damageDealt;
	protected double treasureCarried=1.5;

	public Monster() {
	currentHealth = 0;
	damageDealt = 0;
	treasureCarried = 1.5;
	}

	public Monster(int currentHealth, int damageDealt, double treasureCarried) {
		super();
		this.currentHealth = currentHealth;
		this.damageDealt = damageDealt;
		this.treasureCarried = treasureCarried;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public double getTreasureCarried() {
		return treasureCarried;
	}

	public void setTreasureCarried(double treasureCarried) {
		this.treasureCarried = treasureCarried;
	}
	
	public String toString() {
		return String.format("This monster has %d health, does %d damage, and carries %.2f silver", currentHealth,damageDealt, treasureCarried);
	}

	@Override
	public abstract void attack(Combatant target, int damage);

	@Override
	public abstract void getAttacked(Combatant target, int damage);
	
	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWeapon(Weapon w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Weapon getWeapon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setArmor(Armor a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Armor getArmor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
