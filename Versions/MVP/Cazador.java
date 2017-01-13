// The selector's class. 

public class Cazador { 
	
	private int HP; 
	private int catchPoints; 
	private int status; // -1: Lost / 0: In the middle of the game / 1: Won
	private String nombre; 
	
	//Constructor
	public Cazador (String name) { 
		nombre = name;
		HP = 100; 
		status = 0; 
		catchPoints = 0; 
	}
	
	//ACCESSORS
	//Returns current HP value
	public int getHP() { 
		return HP; 
	}
	
	//Returns current number of catches
	public int getCP () { 
		return catchPoints; 
	}
	
	public int getStatus(){
		return status;
	}
	
	//MUTATORS
	//Updates the HP (When a predator attacks)
	public void setHP (int p) { 
		HP -= p; 
	}
	
	//Updates the catch points
	public void setCP (int p) { 
		catchPoints += p; 
	}

	
        
} 
