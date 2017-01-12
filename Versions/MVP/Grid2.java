import java.util.ArrayList;

public class Grid2 {
	
	/*
	updated with new features that were talked about in class:
	-ArrayLists that store the cords of the animals that were generated
	-means of generating the numbers in the boxes (like the numbers in minesweeper telling how many mines are around) is set
	-made numPrey and numPredators vars that's for altering numbers of each type of animal-- not really in MVP, just had it there cuz why not 
	*/

    private Character[][] _grid;
    public int sideLength;
	private int[] coords; 
    //private int numPrey = 20; //these numbers should be adjusted later
    //private int numPredators = 10; //these numbers should be adjusted later

    public Grid2 (int s){//constructor: s is the side length of grid 
		sideLength = s; 
        _grid = new Character[sideLength][sideLength];
	    coords = new int[s*s];
    }
	
	// Algo for Coords: sideLength(i) + j

    public static void populate(Grid2 s){
		for (int i = 0; i < s.sideLength; i++) { 
			for (int j = 0; j < s.sideLength; j++) { 
				int rand = (int) (Math.random()*3); 
				if (rand == 0) {
					Character a = new Empty(); 
					s._grid[i][j] = a; 
					System.out.println(a);
				}
				else if (rand == 1) { 
					Character b = new Predator();
					s._grid[i][j] = b; 
					System.out.println(b);
				}
				else { 
					Character c = new Prey(); 
					s._grid [i][j] = c; 
					System.out.println(c);
				}
				s.coords[s.sideLength*i + j] = s.sideLength*i + j; 
		}
	}} 
	
	//i know that there can be some prey that are removed for predators-- its not gonna be exact, but i dont think we need to worry about that yet

	
	//The following is for updating all those "0,0" boxes-- they must be altered to reflect the right # of predators and preys around it:

	//Divide this into 3 different parts:
	//1. for the animals not on the sides of the grid or the corners: these have eight neihbors
	//2. for the animals on the sides, not on the corners: they have 5 neighbors
	//3. corners! they have 3 neighbors
    
    
  /* ====================================================
  
	Don't need this for now 

	public String toString(){//this is gonna need work...
	return "";
    }

	================================================== */ 
	
    public int getSideLength(){
	return sideLength;
    }

    public Object[][] getArray(){
	return _grid;
    }
    
    public Object getCor (int xcor, int ycor){//returns the element at (x,y)
	//return _grid[sideLength - ycor][xcor - 1];
	return _grid[ycor - 1][xcor - 1];    
    } 

	/* =============================================================================================================================
    public Object setCor (int xcor, int ycor, Object o){//sets the element at (x,y) on the grid to be o, and returns the original element
	Object temp = getCor(xcor, ycor);
	//_grid[sideLength - ycor][xcor - 1] = o;
	_grid[ycor - 1][xcor - 1] = o;    
	return temp;
    }
	==============================================================================================================================*/
			   

	public static void main (String[] args) {
		
		Grid2 TBM = new Grid2(4); 
		populate(TBM); 
		
	}
				
				
				
				
				
				
				
				
				
				
								
				
				
				
				
				
				
				
				
				
				
				
} 
