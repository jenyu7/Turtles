import cs1.Keyboard;
import java.io.*;
import java.util.*;
public class Woo{ 

	//Declare Variables
	private Grid g;
	private Cazador kats;
	private InputStreamReader isr;
    private BufferedReader in;
	int numPrey;
	
	//Constructor
	public Woo(){
		g = new Grid(9);
		numPrey = Grid.populate(g);
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
				System.out.println("Coordinates: " + xcor + "," + ycor);
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
	/*====
	Three options: 
	1. Hit a Prey (+1 CP)
	2. Hit a Predator (-10 HP)
	3. Hit nothing (an empty)
		a. There are predators and prey near you (Display how many predators, and how many prey)
		b. There is nothing near you. (Display this sad, sad fact. Maybe it's because you smell.)
	====*/
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
			//Special Cases: On the Corners (3 neighbors) or On the Edges (5 neighbors)
			if (specialCaseBoo(xcor, ycor)){
				//Coordinates: 0,0 [USER: 1,1]
				if ((xcor == 0 ) && (ycor == 0)){
					int[] p = {xcor, xcor+1};
					int[] q = {ycor, ycor+1};
					checkSurround(p, q);
				}
				//Coordinates: 0,8 [USER: 1,9]
				else if ((xcor == 0 ) && (ycor == g.getSideLength()-1)){
					int p[] = {xcor, xcor+1};
					int q[] = {ycor-1, ycor};
					checkSurround(p, q);
				}
				//Coordinates: 8,0 [USER: 9,1]
				else if ((xcor == g.getSideLength()-1 ) && (ycor == 0)){
					int p[] = {xcor-1, xcor};
					int q[] = {ycor+1, ycor};
					checkSurround(p, q);
				}
				//Coordinates: 8,8 [USER: 9,9]
				else if ((xcor == g.getSideLength()-1) && (ycor == g.getSideLength()-1)){
					int p[] = {xcor-1, xcor};
					int q[] = {ycor-1, ycor};
					checkSurround(p, q);
				}
				//Coordinates: Anything on x = 0 [USER: x = 1] excluding the corners 
				else if (xcor == 0 ){
					int p[] = {xcor+1, xcor};
					int q[] = {ycor-1, ycor, ycor+1};
					checkSurround(p, q);
				}
				//Coordinates: Anything on x = 8 [USER: x = 9] excluding the corners
				else if (xcor == g.getSideLength()-1){
					int p[] = {xcor-1, xcor};
					int q[] = {ycor-1, ycor, ycor +1};
					checkSurround(p, q);
				}
				//Coordinates: Anything on y = 0 [USER: y = 1] excluding the corners
				else if (ycor == 0){
					int p[] = {xcor-1, xcor, xcor+1};
					int q[] = {ycor+1, ycor};
					checkSurround(p, q);
				}
				//Coordinates: Anything on y = 8 [USER: y = 9] excluding the corners
				else if (ycor == g.getSideLength()-1){
					int p[] = {xcor-1, xcor, xcor+1};
					int q[] = {ycor-1, ycor};
					checkSurround(p, q);
				}
				else{}
			}
			//Regular Case: 8 neighbors
			else{
				int[] p = {xcor-1, xcor, xcor +1};
				int[] q = {ycor-1, ycor, ycor +1};
				checkSurround(p, q);
				
			}
		}
	}
	
	//Checks the current status of the game
	//Two ways to exit the game: 
	//1. Win!: When you catch all the prey
	//2. Lose...: When you lose all your health
	public int checkStatus(){
		if (kats.getCP() == numPrey){
			return 1;
		}
		else if (kats.getHP() == 0){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	//HELPER FUNCTIONS:
	
	//specialCaseBoo: Returns boolean on whether or not the square is a special case (has less than 8 neighbors)
	//Helps improve readability of code 
	public boolean specialCaseBoo(int xcor, int ycor){
		if (((xcor == 0) || (ycor == 0)) || ((xcor == g.getSideLength()-1) || (ycor == g.getSideLength()-1))){
			return true;
		}
		else{
			return false;
		}
	}
	
	//checkBox: Checks the specific box based on coordinates
	//Helps when the function is called specifically on the coordinates of surrounding boxes
	public int checkBox(int xcor, int ycor){
		Object a = g.getArray()[ycor][xcor];
		if (a instanceof Prey){
			//System.out.println(a);
			return 1;
		}
		else if (a instanceof Predator){
			//System.out.println(a);
			return -1;
		}
		else{
			//System.out.println(a);
			return 0;
		}
	}
	
	//checkSurround: The Big Sister of checkBox. Robustification is not writing the same code more than once. 
	//Takes in two arrays with possible x and y cors, and then runs through it with a nested for loop for all possible combinations. Prints out the number of Predators and Prey around you. 
	public void checkSurround(int[] p, int[] q){
		int numPrey = 0;
		int numPred = 0;
		for (int i: p){
			for (int j:q){
				if (checkBox(i, j) == 1){
					numPrey ++;
				}
				else if (checkBox(i, j) == -1){
					numPred ++;
				}
				else{
				}
			}
		}
		if ((numPrey == 0) && (numPred == 0)){
					System.out.println("There are no predators or prey around you.");
			}
		else{
			System.out.println("Number of Prey around: " + numPrey);
			System.out.println("Number of Predators around: " + numPred);
		}
	}
	
	//Where the magic haPPENS
	public static void main(String[] args){
		Woo w = new Woo();
		while (w.checkStatus() == 0){
			w.ask();
		}
		if (w.checkStatus() == 1){
			System.out.println("You won!");
		}
		else{
			System.out.println("You lost!");
		}
		
	}
} 