/**
 * Diamond - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
public class Diamond extends Armor {
	private int karat;
	private final static double nCost = 7.0;
	private final static int nDamage = 8;

	public Diamond(double cost, int damage, int karat) {
		super(cost, damage);
		this.karat = karat;
	}

	public Diamond() {
		super(nCost,nDamage);
		karat = 0;
	}

	public int getKarat() {
		return karat;
	}

	public void setKarat(int karat) {
		this.karat = karat;
	}

	@Override
	public String toString() {
		return String.format("%d karat Diamond Armor: [cost: %.2f Silver, dmg: %d]", karat, this.getCost(), this.getDamage(),
				karat);
	}
}
