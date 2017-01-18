import java.util.ArrayList;

public class Grid {
	
	//Variable Declaration
    private Animal[][] _grid;
    private int sideLength;
	private int[] coords; 
	private Object[][] _usedCors;
    //private int numPrey = 0; 
    // private int numPredators = 0; 

	//Constructor
	/*==============
	Creates a grid with Animals (Empty squares hold "Empty", a subclass of Animal)
	Creates a 2D Array to store used coordinates
	[No idea what coords does.]
	===============*/
    public Grid (int s){
		sideLength = s; 
        _grid = new Animal[sideLength][sideLength];
		_usedCors = new Object[sideLength][sideLength];
	    coords = new int[s*s];
		initPopulateUsed();
    }
	
	//toString() method
	public String toString(){
		String retStr = "    1     2     3     4     5     6     7     8     9\n";
		int count = 1;
		for (Animal[] a : _grid){
			retStr += count + "|";
			for (Animal b: a){
				if ((b instanceof Prey) || (b instanceof Predator)){retStr += b.getSusName() + "|";}
				else{retStr += b + "|";}
			}
			retStr += "\n";
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
	
	// Algo for Coords: sideLength(i) + j
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
					//System.out.println(a);
				}
				else if (rand == 1) { 
					Animal b = new Predator();
					s._grid[i][j] = b; 
					//System.out.println(b);
				}
				else { 
					Animal c = new Empty(i, j); 
					s._grid [i][j] = c; 
					//System.out.println(c);
				}
				s.coords[s.sideLength*i + j] = s.sideLength*i + j; 
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
