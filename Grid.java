public class Grid{

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
	return _grid[sideLength - ycor][xcor - 1];
    } 

    public Object setCor (int xcor, int ycor, Object o){//sets the element at (x,y) on the grid to be o, and returns the original element
	Object temp = getCor(xcor, ycor);
	_grid[sideLength - ycor][xcor - 1] = o;
	return temp;
    }
    
    public static void main(String[] args){//tests
	Grid foo = new Grid(5);
	System.out.println(foo.getSideLength());
	System.out.println(foo.getArray());
        System.out.print(foo.getCor(2,3));	
    }
			    
}
