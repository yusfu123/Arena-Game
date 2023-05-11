/**
 * Leather - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Leather extends Armor {
	private double thickness;
	private final static double nCost = 2.5;
	private final static int nDamage = 3;

	public Leather(double cost, int damage, double thickness) {
		super(cost, damage);
		this.thickness = thickness;
	}

	public Leather() {
		super(nCost, nDamage);
		thickness = 5;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return String.format("%.1f mm thick Leather: [cost: %.2f Silver, dmg: %d]", thickness,cost, damage);
	}
}
