public class Cazador { 
	
	//Declare Variables
	private int HP; 
	private int catchPoints; 
	private int status;
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
	
	//Returns current status: 1 = won, 0 = in game, -1 = lost
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
