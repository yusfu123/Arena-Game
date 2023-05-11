/**
 * Spear - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Spear extends Weapon {

	private String metal;
	private final static double nCost = 4.5;
	private final static int nDamage = 6;

	public Spear(double cost, int damage, String metal) {
		super(cost, damage);
		this.metal = metal;
	}

	public Spear() {
		super(nCost, nDamage);
		metal = "Iron";
	}

	public String getMetal() {
		return metal;
	}

	public void setMetal(String metal) {
		this.metal = metal;
	}

	@Override
	public String toString() {
		return String.format("%s Spear: [cost: %.2f Silver, dmg: %d]", metal, this.getCost(), this.getDamage());
	}
}
