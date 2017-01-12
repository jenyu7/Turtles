// The selector's class. 

public class Cazador { 
	
	public int HP; 
	public int CatchPoints; 
	public int winOrLose; // -1: Lose / 0: In the middle of the game / 1: Win
	// public String name; to personalize player 
	
	public Cazador () { 
		// include name later
		HP = 100; 
		winOrLose = 0; 
		CatchPoints = 0; 
	}
	
	public int getHP() { 
		return HP; 
	}
	
	public void setHP (Predator preddy) { 
		HP -= preddy.damage; 
	}
	
	public int getCP () { 
		return CatchPoints; 
	}
	
	public void SetCP (Prey pray) { 
		CatchPoints += pray.CP; 
	}
	
        
} 
