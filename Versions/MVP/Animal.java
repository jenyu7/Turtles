// Abstract Animal Class 

public abstract class Animal { 

	// Instance Variables: 
	protected int numPreds; 
	protected int numPreys; 
	protected double spawn; 
	protected String displayStr = ""; 
	protected String retStr; 
	
	// MVP Stuff: 
	protected String name; 
	
	
	// Methods: 

	// Actual Version: 
    //	public abstract void editStr(); 
	
	// MVP Version: 
	public abstract String toString(); 
	
}
