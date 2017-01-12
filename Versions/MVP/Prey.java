// The Prey Class that implements character as well 

public class Prey implements Character () { 

	// Instances: 
	public int CP; 
	String names = new String[3];
	
	// Name Array: 
	names = ["Eugene the Iguana", "Rachel the Rabbit", "Sarah the Squirrel"];
	
	public Prey () {
		int randInt = (int) (Math.random()*3); 
		name = names[randInt]; 
		CP = 2; 
	} 
	
	public int getCP () {
		return CP; 
	}
	
	// Rewrite this later to reveal info about numPreds and numPrey. 
	public String toString() {
		return name; 
	}
}