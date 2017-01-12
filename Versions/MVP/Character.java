// Abstract Character Class 

public abstract class Character { 

	// Instance Variables: 
	
	// The stuff thats currently commented is for the actual version: 
	protected int numPreds; 
	protected int numPreys; 
	protected double spawn; 
	protected String displayStr = ""; 
	protected String retStr; 
	
	// MVP Stuff: 
	protected String name; 
	
	
	// Methods: 

	// Actual Version: 
	// public abstract void editStr(); 
	
	// MVP Version: 
	public abstract String toString(); 
	
}