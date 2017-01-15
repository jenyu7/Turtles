import java.util.ArrayList; 
public class Predator extends Animal { 

	//Declare Variables
	public int damage; 
	
	//Names and Stories
    ArrayList<String> names = new ArrayList<String>(); { 
	names.add("Jen the Jaguar");
	names.add("Zoey the Zebra");
	names.add("Bonnie the Bear"); 
	names.add("Dasha the Dartfrog");
	names.add("Masha the Mammoth");
	names.add("Yiling the Yak");
	names.add("Cody the Crocodile");
	} 
	
	ArrayList<String> stories = new ArrayList<String>();{
		
	}
	
	//Default Constructor 
	public Predator() { 
		int randInt = (int) (Math.random()*3); 
		name = names.get(randInt); 
		damage = 10; 
	}
	
	// Returns name of Predator
	public String toString() { 
		return name; 
	}

	//ACCESSORS
	//Gets the value of damage (Useful post MVP)
	public int getDamage () { 
		return damage; 
	}
} 
