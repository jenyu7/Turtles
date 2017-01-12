// The Prey Class that implements Animal as well 


import java.util.ArrayList; 

public class Prey extends Animal { 

	// Instances: 
	public int CP; 
	ArrayList<String> names = new ArrayList<String>(); {
	names.add("Eugene the Iguana"); 
	names.add("Rachel the Rabbit"); 
	names.add("Sarah the Squirrel"); 
	}
	
	public Prey () {
		int randInt = (int) (Math.random()*3); 
		name = names.get(randInt); 
		CP = 1; 
	} 
	
	public int getCP () {
		return CP; 
	}
	
	// Rewrite this later to reveal info about numPreds and numPrey. 
	public String toString() {
		return name; 
	}
}