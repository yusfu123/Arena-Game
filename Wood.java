/**
 * Wood - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Wood extends Armor {
	private String tree;
	private final static double nCost = 4.5;
	private final static int nDamage = 5;

	public Wood(double cost, int damage, String tree) {
		super(cost, damage);
		this.tree = tree;
	}

	public Wood() {
		super(nCost,nDamage);
		tree = "oak";
	}

	public String getTree() {
		return tree;
	}

	public void setTree(String tree) {
		this.tree = tree;
	}

	@Override
	public String toString() {
		return String.format("%s Wood armor: [cost: %.2f Silver, dmg: %d]", tree, this.getCost(),
				this.getDamage());
	}
}
