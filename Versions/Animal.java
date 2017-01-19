public abstract class Animal { 

	//Declare Variables
	protected int numPreds; 
	protected int numPreys; 
	protected double spawn; 
	protected String name; 
	protected String story;
	protected String susName;
	
	// MVP Version: 
	public abstract String toString(); 
	
	public abstract String getSusName();
	
	public abstract void setSusName(String str);
	
}
