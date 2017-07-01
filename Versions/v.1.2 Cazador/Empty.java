// Empty Class

public class Empty extends Animal { 

	//Default Constructor (for _usedCors)
	public Empty() { 
		name = "empty"; 
	}
	
	//Overloaded Constructor (for populating Grid)
	public Empty(int xcor, int ycor) { 
		name = "     "; 
	}
	
	public String toString () { 
		return name; 
	}
	
	public String getSusName(){
		return susName;
	}
	
	public void setSusName(String str){
		susName = str;
	}

}