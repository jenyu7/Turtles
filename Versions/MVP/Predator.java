// Predator: A Subclass for Character

import java.util.ArrayList; 

public class Predator extends Animal { 

	// Instance Variables: 
    ArrayList<String> names = new ArrayList<String>(); { 
	names.add("Jen the Jaguar");
	names.add("Zoey the Zebra");
	names.add("Bonnie the Bear"); 
} 

	public int damage; 
	
	// Default Constructor 
	public Predator() { 
		int randInt = (int) (Math.random()*3); 
		name = names.get(randInt); 
		damage = 10; 
	}

	public int getDamage () { 
		return damage; 
	}
	
		
	// Rewrite this later to reveal info about numPreds and numPrey.
	public String toString() { 
		return name; 
	}
} 
