/**
 * Fork - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Fork extends Weapon {

	private String metal;
	private final static double nCost = 7.0;
	private final static int nDamage = 8;

	public Fork(double cost, int damage, String metal) {
		super(cost, damage);
		this.metal = metal;
	}

	public Fork() {
		super(nCost,nDamage);
		metal = "Gold";
	}

	public String getMetal() {
		return metal;
	}

	public void setMetal(String metal) {
		this.metal = metal;
	}

	@Override
	public String toString() {
		return String.format("%s Fork: [cost: %.2f Silver, dmg: %d]", metal, this.getCost(), this.getDamage());
	}
}
