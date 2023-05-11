/**
 * Armor - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public abstract class Armor {
	protected double cost;
	protected int damage;

	public Armor() {
		cost = 0;
		damage = 0;
	}

	public Armor(double cost, int damage) {
		this.cost = cost;
		this.damage = damage;

	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String toString() {
		return String.format("This armor costs %.2f Silver and prevent %d Damage", cost, damage);
	}

}
