import cs1.Keyboard;
import java.io.*;
import java.util.*;
public class Woo{ 

	//Declare Variables
	private Grid g;
	private Cazador kats;
	private InputStreamReader isr;
    private BufferedReader in;
	
	//Constructor
	public Woo(){
		g = new Grid(9);
		Grid.populate(g);
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		newGame();
	}
	
	//Starts a new game
	//instantiates the player and sets his/her name
	public void newGame(){
		String s = "";
		String name = "";
		s += "EL CAZADOR\n";
		s += "blah blah blah some storyline";
		System.out.println(s);
		s = "What is your name?";
		System.out.println(s);
		try {
	    name = in.readLine();
		}
		catch ( IOException e ) { }
		kats = new Cazador( name );
    }//end newGame()
	
	//When asking for coordinates from USER
	public void ask(){
		int xcor = 0; 
		int ycor = 0;
		System.out.println("Please choose an x-coordinate (1-9)");
		xcor = Keyboard.readInt();
		System.out.println("Please choose a y-coordinate (1-9)");
		ycor = Keyboard.readInt();
		//if the coordinates exist
		if (((xcor < 10) && (xcor > 0)) && ((ycor < 10) && (ycor > 0))){
			//if the coordinate has already been used
			if (!(g.getUsedCors()[ycor-1][xcor-1] instanceof Empty)){
				System.out.println("Sorry, those coordinates have been used already.");
				System.out.println("Please enter in a different set of coordinates.");
				ask();
				}
			//if the coordinate is original, and exists. 
			else{
				//System.out.println("in");
				g.setUsedCors(xcor-1, ycor-1, 0);
				/* ***IMPORTANT***: BELOW, THE MODIFICATION TO INDICES HAS ALREADY BEEN MADE, SO CHECKGRID() DOES NOT NEED TO SUBTRACT ONE TO STAY WITHIN BOUNDS*/
				checkGrid(xcor-1, ycor-1);
			}
		}
		//if the coordinates do not exist
		else{
			System.out.println("Sorry, your coordinates don't correspond to a point on the grid.");
			System.out.println("Please enter another coordinate that adheres to the guidelines.");
			ask();
		}
		
	}
	
	//The next step after asking
	//Looks into the coordinates USER has chosen on the grid
	/*
	
	*/
	public void checkGrid(int xcor, int ycor){
		Object a = g.getArray()[ycor][xcor];
		if (a instanceof Prey){
			System.out.println("You have encountered " + a + ".");
			kats.setCP(1);
			System.out.println("You made a catch!");
			System.out.println("Current Catches: " + kats.getCP());
			System.out.println("Current Health: " + kats.getHP());
		}
		else if (a instanceof Predator){
			System.out.println("You have encountered " + a + ".");
			kats.setHP(10);
			System.out.println("You were attacked!");
			System.out.println("Current Catches: " + kats.getCP());
			System.out.println("Current Health: " + kats.getHP());
		}
		else{
			if (specialCaseBoo)
		}
	}
	
	//HELPER FUNCTIONS:
	
	//checkBox: Checks the specific box based on coordinates
	//Helps when the function is called on the coordinates of surrounding boxes
	public int checkBox(int xcor, int ycor){
		Object a = g.getArray()[ycor][xcor];
		if (a instanceof Prey){
			return 1;
		}
		else if (a instanceof Predator){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	//specialCaseBoo: Returns boolean on whether or not the square is a special case (has less than 8 neighbors)
	//Helps improve readability of code 
	public boolean specialCaseBoo()
	
	public static void main(String[] args){
		Woo w = new Woo();
		while (true){
			w.ask();
		}
		
	}
} 