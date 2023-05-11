
/**
 * Arena - An example class for assignment: Final Project
 * Copyright 2021 Howard Community College
 * @author Yusuf Khalid
 * @version 2.0
 *
 */
import java.util.Scanner;

public class Arena {
	final static int GOBLIN = 1;
	final static int OGRE = 2;
	final static int GIANT = 3;
	final static int DRAGON = 4;
	final static int ENTER_ARENA = 1;
	final static int REST = 2;
	final static int SHOP = 3;
	final static int STATUS = 4;
	final static int QUIT = 5;
	final static int GOBLIN_DAMAGE = 2;
	final static int OGRE_DAMAGE = 4;
	final static int GIANT_DAMAGE = 6;
	final static int DRAGON_DAMAGE = 10;
	final static int CLUB = 1;
	final static int SWORD = 2;
	final static int SPEAR = 3;
	final static int FORK = 4;
	final static int RAGS = 5;
	final static int LEATHER = 6;
	final static int WOOD = 7;
	final static int DIAMOND = 8;
	final static int NOTHING = 9;

	public static void main(String[] args) {
		System.out.println("Copyright 2021 Howard Community College\r\n");
		Scanner sc = new Scanner(System.in);
		Combatant g1 = new Gladiator();
		System.out.println("Welcome to the Arena of Doom!\nWhat is your name gladiator?");
		g1.setName(sc.nextLine());
		int usersMenuChoice;
		int usersOpponentChoice;
		// loops entire program until user enters a 5
		do {

			if (g1.getCurrentHealth() > 0) {
				usersMenuChoice = Arena.getValidMenuChoice(sc);
			} else {
				usersMenuChoice = REST;
			}
			switch (usersMenuChoice) {
			case ENTER_ARENA:
				usersOpponentChoice = Arena.getValidMonsterChoice(sc);

				// switch statement for 4 monsters
				switch (usersOpponentChoice) {
				case GOBLIN:
					Combatant goblin1 = new Goblin();
					arenaFight(g1, goblin1);
					/*
					 * g1.setCurrentHealth(g1.getCurrentHealth() - goblin1.getDamageDealt());
					 * g1.setTreasureCarried(g1.getTreasureCarried() +
					 * goblin1.getTreasureCarried());
					 * System.out.printf("%s the gladiator defeats the Goblin!%n", g1.getName());
					 */
					break;
				case OGRE:
					Combatant ogre1 = new Ogre();
					arenaFight(g1, ogre1);
					break;
				case GIANT:
					Combatant giant1 = new Giant();
					arenaFight(g1, giant1);
					break;
				case DRAGON:
					Combatant dragon1 = new Dragon();
					arenaFight(g1, dragon1);
					break;

				}
				break;
			case REST:
				g1.setCurrentHealth((g1.getCurrentHealth() + 2));
				g1.setTreasureCarried(g1.getTreasureCarried() - 1.0);
				System.out.printf(
						"%n%s the gladiator rests, gaining 2 hit points and paying 1 silver.%nTotal hit points: %d%nTotal silver: %.1f%n",
						g1.getName(), g1.getCurrentHealth(), g1.getTreasureCarried());
				break;

			case SHOP:
				Arena.shopping(sc, g1);
				break;
			case STATUS:
				System.out.println(g1);
				break;
			case QUIT:
				System.out.printf("%s the Gladiator has left the building.\nGoodbye, %s. Thanks for playing",
						g1.getName(), g1.getName());

				break;
			}
		} while (usersMenuChoice != QUIT);
	}

//gets users menu choice
	public static int getValidMenuChoice(Scanner sc) {
		int x;
		do {

			System.out.println(
					"\n1. Enter the Arena\n2. Rest at the Healer's Tent\n3. Buy Equipment at the Bazaar\n4. Display status\n5. Quit\n\nWhat would you like to do Gladiator(enter a number)?\n");
			x = sc.nextInt();
			if (x > QUIT || x < ENTER_ARENA) {
				System.out.println("Invalid input, try again");
			}
		} while (x > QUIT || x < ENTER_ARENA);
		return x;
	}

//gets users monster choice
	public static int getValidMonsterChoice(Scanner sc) {
		int x;
		do {
			System.out.println("Choose an opponent:\n1. Goblin\n2. Ogre\n3. Giant\n4. Dragon");
			x = sc.nextInt();
			if (x > DRAGON || x < GOBLIN) {
				System.out.println("Invalid input, try again");
			}
		} while (x > DRAGON || x < GOBLIN);
		return x;
	}

	public static void arenaFight(Combatant gladiator, Combatant monster) {
		int gladiatorDamage = gladiator.getWeapon().getDamage();
		int monsterDamage = monster.getDamageDealt() - gladiator.getArmor().getDamage();
		System.out.println("damage :" + monsterDamage);
		if (monsterDamage < 1) {
			monster.setCurrentHealth(0);
			System.out.println("The monster was no match for you and gave up instantly!");

		} else {
			do {
				gladiator.attack(monster, gladiatorDamage);
				// gladiator attack

				// checks if monster is able to do any damage, if not, gives up
				if (monster.getCurrentHealth() > 0) {
					monster.attack(gladiator, monsterDamage);
				}
				// if monsters health is greater than 0, it attacks

			} while (gladiator.getCurrentHealth() > 0 && monster.getCurrentHealth() > 0);
		}
		// if neither gladiator or monster health is 0, it continues looping
		if (monster.getCurrentHealth() < 1) {
			System.out.printf("%nYou defeated the monster and collected %.1f silver%n", monster.getTreasureCarried());
			gladiator.setTreasureCarried(gladiator.getTreasureCarried() + monster.getTreasureCarried());
		} else if (gladiator.getCurrentHealth() <= 0) {
			System.out.println("You were defeated, you rush to the temple to rest");
		}
	}

	public static void shopping(Scanner sc, Combatant g1) {
		int x = 0;
		do {
			if (x < CLUB || x > NOTHING) {
				System.out.println("Welcome to the shop!");
				System.out.println(
						"What would you like to purchase?:\n1. Club\n2. Sword\n3. Spear\n4. Fork\n5. Rags\n6. Leather\n7. Wood\n8. Diamond\n9. Nothing");

			}
			x = sc.nextInt();
		} while (x < CLUB || x > NOTHING);
		switch (x) {
		case CLUB:
			Club C1 = new Club();
			if (g1.getTreasureCarried() >= C1.getCost()) {
				g1.setWeapon(C1);
				System.out.println("You purchased a new club and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - C1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case SWORD:
			Sword Sw1 = new Sword();
			if (g1.getTreasureCarried() >= Sw1.getCost()) {
				g1.setWeapon(Sw1);
				System.out.println("You purchased a new sword and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - Sw1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case SPEAR:
			Spear Sp1 = new Spear();
			if (g1.getTreasureCarried() >= Sp1.getCost()) {
				g1.setWeapon(Sp1);
				System.out.println("You purchased a new spear and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - Sp1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case FORK:
			Fork F1 = new Fork();
			if (g1.getTreasureCarried() >= F1.getCost()) {
				g1.setWeapon(F1);
				System.out.println("You purchased a new fork and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - F1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case RAGS:
			Rags R1 = new Rags();
			if (g1.getTreasureCarried() >= R1.getCost()) {
				g1.setArmor(R1);
				System.out.println("You purchased new rags and equipped them!");
				g1.setTreasureCarried(g1.getTreasureCarried() - R1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case LEATHER:
			Leather L1 = new Leather();
			if (g1.getTreasureCarried() >= L1.getCost()) {
				g1.setArmor(L1);
				System.out.println("You purchased a leather armor and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - L1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case WOOD:
			Wood W1 = new Wood();
			if (g1.getTreasureCarried() >= W1.getCost()) {
				g1.setArmor(W1);
				System.out.println("You purchased new wooden armor and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - W1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case DIAMOND:
			Diamond D1 = new Diamond();
			if (g1.getTreasureCarried() >= D1.getCost()) {
				g1.setArmor(D1);
				System.out.println("You purchased new diamond armor and equipped it!");
				g1.setTreasureCarried(g1.getTreasureCarried() - D1.getCost());
			} else {
				System.out.println("You do not have enough silver!");
			}
			break;

		case NOTHING:
			System.out.println("You purchased nothing and left");
		}

	}

}
