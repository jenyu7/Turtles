//Abstract Class Animal 
//This is the superclass of Predator, Prey, and Empty
public abstract class Animal { 

	//Declare Variables
	protected int numPreds; 
	protected int numPreys; 
	protected String name; 
	protected String story;
	protected String susName;
	protected String endStory;
	
	//Methods
	public abstract String toString(); 
	
	public abstract String getSusName();
	
	public abstract void setSusName(String str);
	
}
