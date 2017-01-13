import java.util.ArrayList; 
public class Prey extends Animal { 

	//Names and Stories
	public int CP; 
	ArrayList<String> names = new ArrayList<String>(); {
	names.add("Eugene the Iguana"); 
	names.add("Rachel the Rabbit"); 
	names.add("Sarah the Squirrel"); 
	}
	
	//Constructor
	public Prey () {
		int randInt = (int) (Math.random()*3); 
		name = names.get(randInt); 
		CP = 1; 
	} 
	
	//Returns the name of the Prey
	public String toString() {
		return name; 
	}
	
	//ACCESSORS
	//Get catchPoints
	public int getCP () {
		return CP; 
	}
	 
}