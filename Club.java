/**
 * Club - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Club extends Weapon {

	private String woodType;
	private final static double nCost = 1.0;
	private final static int nDamage = 2;

	public Club(double cost, int damage, String woodType) {
		super(cost, damage);
		this.woodType = woodType;
	}

	public Club() {
		super(nCost, nDamage);
		woodType = "Oak";
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	@Override
	public String toString() {
		return String.format("%s Club [cost: %.2f Silver, dmg: %d]", woodType, this.getCost(),
				this.getDamage());
	}
}
