// Predator: A Subclass for Character

public class Predator implements Character () { 

	// Instance Variables: 
    String[] names = new String[3];
	public int damage; 
	
	// Name Array: 
	names = ["Bonnie the Bear", "Jen the Jaguar", "Allard the Alpaca"];
	
	// Default Constructor 
	public Predator() { 
		int randInt = (int) (Math.random()*3); 
		name = names[randInt]; 
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