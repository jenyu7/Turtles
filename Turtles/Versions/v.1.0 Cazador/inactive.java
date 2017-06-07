import java.util.ArrayList;
public class Grid{
	
	/*
	updated with new features that were talked about in class:
	-ArrayLists that store the cords of the animals that were generated
	-means of generating the numbers in the boxes (like the numbers in minesweeper telling how many mines are around) is set
	-made numPrey and numPredators vars that's for altering numbers of each type of animal-- not really in MVP, just had it there cuz why not 
	*/

    private Object[][] _grid;
    private int sideLength;
    private ArrayList<String> preyCords; //stores the cords of preys 
    private ArrayList<String> predatorCords; //stores the cords of predators
    private int numPrey = 20; //these numbers should be adjusted later
    private int numPredators = 10; //these numbers should be adjusted later

    public Grid (int s){//constructor: s is the side length of grid 
        _grid = new Object[s][s];
        sideLength = s;
	populate(_grid);
    }

    public void populate(Object[][] arr){
	for(int a = 0; a < sideLength; a++){//fill every square with and integer that says "0,0" this is the string that'll be updated and is used to store # of animals around it 
	    for(int i = 0; i < sideLength; i++){
		arr[a][i] = "0,0"; 
	    }
	}
	for(int c = 0; c < numPrey; c++){//fill rand cords with prey and store it in preyCords 
	    int row = (int)(Math.random() * sideLength);
	    int column = (int)(Math.random() * sideLength);
	    arr[row][column] = "some prey";//this is like this for now, we still need it to be the object that is either a prey or predator 
	    preyCords.add( Integer.toString(row) + "," + Integer.toString(column) );
	}
	for(int d = 0; d < numPredators; d++){//fill rand cords with predators and store in predatorCords
	    int row = (int)(Math.random() * sideLength);
	    int column = (int)(Math.random() * sideLength);
	    arr[row][column] = "some predator";//this is like this for now, so we still need it to be an object that is either a prey or predator 
	    predatorCords.add( Integer.toString(row) + "," + Integer.toString(column) );
	}
	//i know that there can be some prey that are removed for predators-- its not gonna be exact, but i dont think we need to worry about that yet

	
	//The following is for updating all those "0,0" boxes-- they must be altered to reflect the right # of predators and preys around it:

	//Divide this into 3 different parts:
	//1. for the animals not on the sides of the grid or the corners: these have eight neihbors
	//2. for the animals on the sides, not on the corners: they have 5 neighbors
	//3. corners! they have 3 neighbors
    }
    
    public String toString(){//this is gonna need work...
	return "";
    }

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

    public Object setCor (int xcor, int ycor, Object o){//sets the element at (x,y) on the grid to be o, and returns the original element
	Object temp = getCor(xcor, ycor);
	//_grid[sideLength - ycor][xcor - 1] = o;
	_grid[ycor - 1][xcor - 1] = o;    
	return temp;
    }
			    
}
