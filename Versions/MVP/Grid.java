public class Grid{
	
	/*
 -I had the Grid be an Object of a class and the stuff inside of it be the elements of the Object[][] variable called _grid. 
 -The sideLength variable lets us adjust the grid's dimensions (it can only be a square though!)
 -toString() should probably print the Grid itself, not the array, so this may need some work 
	*/

    private Object[][] _grid;
    private int sideLength;

    public Grid (int s){//constructor: s is the side length of grid 
        _grid = new Object[s][s];
        sideLength = s;
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