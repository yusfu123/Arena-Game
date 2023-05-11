import java.util.ArrayList;

public class PolyTest {
	final static int HIGH_LETHALITY = 5;
	public static void main(String[] args) {
		
		ArrayList<Combatant> monsters = new ArrayList<Combatant>();
		Combatant go1 = new Goblin(3,3,0.0,5);
		Combatant o1 = new Ogre(12,5,10.0,"Kaylon");
		Combatant gi1 = new Giant(20,8,20.0);
		Combatant d1 = new Dragon(40,13,40.0);
		monsters.add(go1);
		monsters.add(o1);
		monsters.add(gi1);
		monsters.add(d1);
		System.out.println(go1);
		for(Combatant temp: monsters) {
			System.out.println(temp);
		}
		//displays all
		
		System.out.println("\nUpdating the health and treasure:\n");
		for(Combatant temp: monsters) {
		temp.setCurrentHealth(35);
		temp.setTreasureCarried(88.8);
		}
		//sets health to 35 and treasure to 88.8 of all 4
		
		for(Combatant temp: monsters) {
			System.out.println(temp);
		}
		//dipslays all
		
		System.out.println("\nFind and display the Monsters that inflict more than 5 hp in damage per engagement:\n");
		
		for(Combatant temp: monsters) {
			if(temp.getDamageDealt()>HIGH_LETHALITY)
				System.out.println(temp);
		}
		
	}

}
