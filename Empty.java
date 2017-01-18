// Empty Class

public class Empty extends Animal { 

	//Default Constructor (for _usedCors)
	public Empty() { 
		name = "empty"; 
	}
	
	//Overloaded Constructor (for populating Grid)
	public Empty(int xcor, int ycor) { 
		name = "empty"; 
	}
	
	public String toString () { 
		return name; 
	}

}