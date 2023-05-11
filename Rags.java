/**
 * Rags - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Rags extends Armor {
	private String color;
	private final static double nCost = 1.0;
	private final static int nDamage = 1;

	public Rags(double cost, int damage, String color) {
		super(cost, damage);
		this.color = color;
	}

	public Rags() {
		super(nCost,nDamage);
		color = "dull grey";

	}

	@Override
	public String toString() {
		return String.format("%s Rags: [cost: %.2f Silver, dmg: %d]", color, this.getCost(), this.getDamage());
	}
}
