/**
 * Combatant - An example interface for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public interface Combatant {

	// For when this creature is attacking a target creature, doing damage to its
	// health
	public abstract void attack(Combatant target, int damage);

	// For when this creature is getting attacked by a target creature, taking
	// damage to its health
	public abstract void getAttacked(Combatant target, int damage);

	public abstract void setCurrentHealth(int i);

	public abstract int getCurrentHealth();

	public abstract void setName(String s);

	public abstract String getName();

	public abstract void setWeapon(Weapon w);

	public abstract Weapon getWeapon();

	public abstract void setArmor(Armor a);

	public abstract Armor getArmor();
	
	public abstract void setTreasureCarried(double d);

	public abstract double getTreasureCarried();
	
	public abstract void setDamageDealt(int i);

	public abstract int getDamageDealt();

	// g1.getName(), g1.getCurrentHealth(), g1.getWeapon(), g1.getArmor(),
	// g1.getTreasureCarried());

	// add each method into superclass

}
