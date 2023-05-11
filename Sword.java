/**
 * Sword - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Sword extends Weapon {

	private String isEngraved;
	private final static double nCost = 2.5;
	private final static int nDamage = 4;

	public Sword(double cost, int damage, String isEngraved) {
		super(cost, damage);
		this.isEngraved = isEngraved;
	}

	public Sword() {
		super(nCost, nDamage);
		isEngraved = "false";
	}

	public String getIsEngraved() {
		return isEngraved;
	}

	public void setIsEngraved(String isEngraved) {
		this.isEngraved = isEngraved;
	}

	@Override
	public String toString() {
		return String.format("Sword: [cost: %.2f Silver, dmg: %d,engraved status: %b]", this.getCost(),
				this.getDamage(), isEngraved);
	}
}
