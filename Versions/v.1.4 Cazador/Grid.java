import java.util.ArrayList;

public class Grid {
	
    //Variable Declaration
    private Animal[][] _grid;
    private int sideLength;
    private int[] coords; 
    private Object[][] _usedCors;
	
    //Constructor
    /*==============
      Creates a grid with Animals (Empty squares hold "Empty", a subclass of Animal)
      Creates a 2D Array to store used coordinates
      ===============*/
    public Grid (int s){
	sideLength = s; 
        _grid = new Animal[sideLength][sideLength];
	_usedCors = new Object[sideLength][sideLength];
	initPopulateUsed();
    }

	//Adjustable Grid: maxes out at 16x16 grid
    public String toString(){ 
		String retStr =  "      ";
		//Sets the x-axis
		for(int x = 1; x <= sideLength; x++){
			if( x == sideLength){
			retStr += Integer.toString(x) + "\n"; 
			}
			else{
			if( x >= 10 ) {
				retStr += Integer.toString(x) + "    "; 
			}
			else{
				retStr += Integer.toString(x) + "     ";
			}
			}
			
		}
	String horizontal = "   -";
	//Sets the horizontal grid lines
	for(int x = 0; x < sideLength; x++){
	    if( x == sideLength - 1){
		horizontal += "------\n";
	    }
	    else{
		horizontal += "------";
	    } 
	}
        retStr += horizontal;//?? 
	int count = 1;
	for (int l = 0; l < _grid.length; l ++){
		//if a double digit number
	    if (count > 9){
		retStr += " " + count + "|";
	    }
		//else: a single digit number
	    else{
		retStr += "  " + count + "|";
	    }
	    for (int w = 0; w < _grid[l].length; w++){
		//if the coordinates haven't been accessed yet
		if (!(this.getUsedCors()[l][w] instanceof Empty)){
		    if ((_grid[l][w] instanceof Prey) || (_grid[l][w] instanceof Predator)){
			retStr += _grid[l][w].getSusName() + "|";
		    }
		    else{retStr += _grid[l][w].getSusName() + "|";}
		}
		else{
		    retStr += "     |";
		}
	    }
	    retStr += "\n";
	    retStr += horizontal;
	    count ++;
	}   	
	return retStr;
    }
	
    //Overloaded toString() method in order to diagnose errors
    public String toString(String diag){
	String retStr = "    1     2     3     4     5     6     7     8     9\n";
	retStr += "  -------------------------------------------------------\n";
	int count = 1;
	for (Animal[] a : _grid){
	    retStr += " " + count + "|";
	    for (Animal b: a){
		if ((b instanceof Prey) || (b instanceof Predator)){retStr += b.getSusName() + "|";}
		else{retStr += b + "|";}
	    }
	    retStr += "\n";
	    retStr += "  -------------------------------------------------------\n";
	    count ++;
	}
	return retStr;
    }
	
    //ACCESSORS
    //Returns sidelength of hunting grounds
    public int getSideLength(){
	return sideLength;
    }
	
    //Returns the grid
    public Animal[][] getArray(){
	return _grid;
    }
    
    //Returns the element at (xcor, ycor)
    public Object getCor (int xcor, int ycor){
	return _grid[ycor - 1][xcor - 1];    
    } 
	
    //Returns the 2D array of used coordinates
    public Object[][] getUsedCors(){
	return _usedCors;
    }
	
    //MUTATORS
    //Updates the used coordinates 2D array
    public Object setUsedCors(Integer xcor, Integer ycor, Integer a){
	Object temp = _usedCors[ycor][xcor];
	_usedCors[ycor][xcor] = a;
	return temp;
    }
	
    /*====
      Populate
      Using nested for loops, populates a 2D Array with Animals in it. 
      For MVP, the spawn probability for each Animal is as shown below: 
      Predator: 1/5
      Prey: 1/5
      Empty: 3/5
      [Eugene, please explain what coords does.]
      ====*/
    public static int populate(Grid s){
	int numPrey = 0;
	for (int i = 0; i < s.sideLength; i++) { 
	    for (int j = 0; j < s.sideLength; j++) { 
		int rand = (int) (Math.random()*10); 
		if (rand == 0) {
		    Animal a = new Prey();					
		    s._grid[i][j] = a; 
		    numPrey ++;
		}
		else if (rand == 1) { 
		    Animal b = new Predator();
		    s._grid[i][j] = b; 
		}
		else { 
		    Animal c = new Empty(i, j); 
		    s._grid [i][j] = c; 
		}
	    }
	}
	return numPrey;
    }
	
    //Populates the 2D Array with Used Coordinates with Empties
    public void initPopulateUsed(){
	for (int i = 0; i < _usedCors.length; i ++){
	    for (int j = 0; j < _usedCors.length; j ++){
		Animal a = new Empty();
		_usedCors[i][j] = a;
	    }
	}
    }
    public static void main(String[] args){
	Grid a = new Grid(5);
	populate(a);
	System.out.println(a);
    }
} 
