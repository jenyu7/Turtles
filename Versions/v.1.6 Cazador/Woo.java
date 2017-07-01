import cs1.Keyboard;
import java.io.*;
import java.util.*;
public class Woo{ 

    //Declare Variables
    private Grid g;
    private Cazador kats;
    private InputStreamReader isr;
    private BufferedReader in;
    private int numPrey;
	private boolean exit;
	private String predators = "1. Bonnie the Bear: An unpredictable and cruel creature, she deals a random amount of damage based on how she's feeling.\n2. Zooey the Zebra: Don't be fooled by the fact that she's a vegetarian...she deals -30 damage. \n3. Jen the Jaguar: An angry and vicious beast, this cat deals -30 damage. \n4. Dasha the Dartfrog: Colorful, but also deadly: she deals -5 damage\n5. Masha the Mammoth: Back from extinction, she is here to mess up your life, and to deal -10 damage. \n6. Cody the Crocodile: Known for his strong jaws, with one bite, he deals -20 damage. \n7. Yiling the Yak: She deals -5 damage. 'Nuff said.\nNOTE: These damages are not set in stone! Sometimes, animals may deal more or less damage than specified...just watch out!\n";
	private String prey = "1. Rachel the Rabbit: Kind of an angry rabbit, the polar opposite of the Nesquik dude.\n2. Jessica the Jellyfish: Kind of ugly and faded, but jellyfish are still cool. \n3. Ida the Iguana: Green and scaly and does not belong in a dark, lightless, forest. \n4. Eugene the Egret: A kind of big, kind of small baby bird, but still vulnerable. \n5. Allard the Armadillo: Armadillos are super cool! Who doesn't want to save armadillos?? \n6. Patricia the Pangolin: An Allard knockoff, but still vulnerable to the evils of the forest. \n7. JennK the Jackrabbit: Also an angry rabbit. What's with rabbits and their emotions? Who hurt you??\n";
	private String notifs = "";
	private String rules = " ======================================  SOME BASIC RULES ===================================== \n\n\n1. You will first be prompted to input dimensions for the hunting ground.\n2. Then, once you read these directions, put in your name. Introduce yourself! \n3. You will then be prompted to select x and y coordinates. Upon selecting them, your initial grid will be printed.\n4. When you catch a prey, you gain catch points (CP) and when you catch a predator you lose health points (HP). \n5. When you explore an empty square, coordinates are printed: \n   The positive number signifies the amount of prey around. \n   The negative number signifies the number of predators around. \n6. If you lose all your HP, you lose. If you catch all of the prey (a target number that is printed at various times during the game), you win. \n7. At anytime during the game, you can type in certain commands to see certain stats. In order to view these commands, please type in 'help', when you are asked for an x or y coordinate.\n"; 
	
    //Constructor
    public Woo(int s){
	g = new Grid(s);
	numPrey = Grid.populate(g);
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
	
    //Starts a new game
    //instantiates the player and sets his/her name
    public void newGame(){
	//begin storyline
	String s = "";
	String name = "\n";
	System.out.println("EL CAZADOR\n");
	System.out.println(rules);
	System.out.println("Press enter to continue to the storyline.");
	try{
		in.readLine();
	}
	catch (IOException e){}
	s += "Borel Forest is one of the most fearsome forests in the world. It is home to many a dangerous creature.\n";
	s += "As a hunter, your name is a little misleading. You don't hunt for sport; rather, you are hoping to go into Borel forest and save certain animals from being eaten and wiped out by the predators in the forest.\n\n";
	s += "Press enter to continue.";
	System.out.println(s);
	try{
		in.readLine();
	}
	catch (IOException e){}
	s = "You step into the Borel Forest, and suddenly, it becomes dark. Even though it's 9am in the morning, you suddenly find yourself groping around in your knapsack for a dim flashlight, which you shine upon the ground, covered with sparse patches of grass and mushrooms.\n";
	s += "Where is the road out? Well, looks like you're stuck here until you find all the animals you need.";
	s += "Unrolling your map, you try to decide where to go next.\n \n";
	//end storyline
	//Asks if the USER wants notifications on the roaming they do when there are no predators or prey near them. 
	s += "Do you want notifications if you decide to roam further than your selected coordinate? (yes/no)";
	System.out.println(s);
	boolean between = false;
	while (between == false){
		try {
			notifs = in.readLine();
			if (notifs.equals("yes") || notifs.equals("no")){
				between = true;
				if (notifs.equals("yes")){
					System.out.println();
					System.out.println("Notifs turned on.\n");
				}
				else{
					System.out.println();
					System.out.println("Notifs turned off.\n");
				}
			}
			else{
				System.out.println("Sorry, I didn't catch that. Do you want notifications if you decide to roam further than your selected coordinate? (yes/no)");
			}
		}
		catch ( IOException e ) { 
			System.out.println("Sorry, I didn't catch that. Do you want notifications if you decide to roam further than your selected coordinate? (yes/no)");
		}
	}
	//asks for the Cazador's name
	s = "What is your name?\n";
	System.out.println(s);
	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	System.out.println("Hey Cazador " + name + "! You need to find " + numPrey + " prey to bring to safety. Go!\n");
	//KATS
	kats = new Cazador( name );
	System.out.println("Just an FYI: type in help, to receive commands for this game!\n");
    }//end newGame()
	
    //When asking for coordinates from USER
    public int[] ask(){
	int xcor = 0; 
	int ycor = 0;
	System.out.println("Please choose an x-coordinate between 1 and " +  g.getSideLength() + ".");
	//HOLMES
	String holmes = "";
	try {
	    holmes = in.readLine();
	}
	catch ( IOException e ) { }
	//Checks to see if the input was an integer
	try{
		//this needs to be trimmed because if there is a space afterwards, the coordinate doesn't work. 
		xcor = Integer.parseInt(holmes.trim());
	}
	catch (Exception e){
		//If it isn't an integer, check to see if it is a command
		checkCommands(holmes);
		//If the user didn't choose to exit
		if (exit == false){
			ask();
			//Useless return statement to satisfy the compiling denizens
			int[] i = {0,0};
			return i;
		}
		//If the user chose to exit, just end the function.
		else{
			int[] i = {0,0};
			return i;
		}
	}
	boolean cont = false;
	while (cont == false){
		System.out.println("Please choose a y-coordinate between 1 and " + g.getSideLength() + ".");
		//GENKINA
		String genkina = "";
		try {
			genkina = in.readLine();
		}
		catch ( IOException e ) { }
		try{
			ycor = Integer.parseInt(genkina.trim());
			cont = true;
		}
		catch (Exception e){
			checkCommands(genkina);
		}
	}
	//if the coordinates exist
	if (((xcor <= g.getSideLength()) && (xcor > 0)) && ((ycor <= g.getSideLength()) && (ycor > 0))){
	    //if the coordinate has already been used
	    if (!(g.getUsedCors()[ycor-1][xcor-1] instanceof Empty)){
		System.out.println("Sorry, those coordinates have been used already.");
		System.out.println("Please enter in a different set of coordinates.");
		ask();
		//Useless return statement to satisfy the compiling denizens
		int[] i = {0,0};
		return i;
	    }
	    //if the coordinate is original, and exists. 
	    else{
		g.setUsedCors(xcor-1, ycor-1, 0);
		/* ***IMPORTANT***: BELOW, THE MODIFICATION TO INDICES HAS ALREADY BEEN MADE, SO CHECKGRID() DOES NOT NEED TO SUBTRACT ONE TO STAY WITHIN BOUNDS*/
		System.out.println("Coordinates: " + xcor + "," + ycor);
		checkGrid(xcor-1, ycor-1);
		int[] i = {xcor -1, ycor -1};
		return i;
	    }
	}
	//if the coordinates do not exist
	else{
	    System.out.println("Sorry, your coordinates don't correspond to a point on the grid.");
	    System.out.println("Please enter another coordinate that adheres to the guidelines.");
	    ask();
		//Useless return statement to satisfy the compiling denizens
		int[] i = {0,0};
		return i;
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
	Animal a = g.getArray()[ycor][xcor];
	if (a instanceof Prey){
	    System.out.println("You have encountered " + a + ".");
	    kats.setCP(1);
		numPrey -= 1;
	    System.out.println(((Prey)a).getStory());
	    System.out.println("Current Catches: " + kats.getCP());
		System.out.println("Catches left to make: " + numPrey);
	    System.out.println("Current Health: " + kats.getHP());
	}
	else if (a instanceof Predator){
	    System.out.println("You have encountered " + a + ".");
	    kats.setHP(((Predator)a).getDamage());
	    System.out.println(((Predator)a).getStory());
	    System.out.println("You sustained -" + ((Predator)a).getDamage() + " damage.");
	    System.out.println("Current Catches: " + kats.getCP());
		System.out.println("Catches left to make: " + numPrey);
	    System.out.println("Current Health: " + kats.getHP());
	}
	else{
	    //Special Cases: On the Corners (3 neighbors) or On the Edges (5 neighbors)
	    if (specialCaseBoo(xcor, ycor)){
		//Coordinates: 0,0 [USER: 1,1]
		if ((xcor == 0 ) && (ycor == 0)){
		    int[] p = {xcor+1, xcor};
		    int[] q = {ycor+1, ycor};
		    checkSurround(p, q);
		}
		//Coordinates: 0,8 [USER: 1,9]
		else if ((xcor == 0 ) && (ycor == g.getSideLength()-1)){
		    int p[] = {xcor+1,xcor};
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
	if (numPrey == 0){
	    return 1;
	}
	else if (kats.getHP() <= 0){
	    return -1;
	}
	else if (exit == true){
		return 2;
	}
	else{
	    return 0;
	}
    }

    //HELPER FUNCTIONS:
	
	//checkCommands: If the user enters a command, the program will check on what it is. 
	public void checkCommands(String holmes){
		if (holmes.equals("help")){
			//COCOROS
			String coco = "Commands in 'El Cazador'\n";
			coco += "help -- displays the list of commands in the game.\n";
			coco += "rules -- displays the rules of the game.\n";
			coco += "grid -- reprints the current grid in the game.\n";
			coco += "catches -- displays the # of catches already made.\n";
			coco += "health -- displays the current health.\n";
			coco += "left -- displays the # of catches left. \n";
			coco += "pred -- displays the descriptions of the predators. \n";
			coco += "prey -- displays the descriptions of the prey. \n";
			coco += "toggle -- change the current status of notifications. \n";
			coco += "exit -- force exits the game. \n";
			System.out.println(coco);
		}
		else if (holmes.equals("catches")){
			String coco = "Current Catches: " + kats.getCP() + "\n";
			System.out.println(coco);
		}
		else if (holmes.equals("health")){
			String coco = "Current Health: " + kats.getHP() + "\n";
			System.out.println(coco);
		}
		else if (holmes.equals("left")){
			String coco = "Catches left: " + numPrey + "\n";
			System.out.println(coco);
		}
		else if (holmes.equals("pred")){
			System.out.println(predators);
		}
		else if (holmes.equals("prey")){
			System.out.println(prey);
		}
		else if(holmes.equals("exit")){
			System.out.println("You have exited the game.");
			exit = true;
		}
		else if (holmes.equals("grid")){
			System.out.println(g);
		}
		else if (holmes.equals("rules")){
			System.out.println(rules);
		}
		else if (holmes.equals("toggle")){
			if (notifs.equals("yes")){
				notifs = "no";
				System.out.println("Notifs turned off.");
			}
			else{
				notifs = "yes";
				System.out.println("Notifs turned on.");
			}
		}
		else{
			System.out.println("Command not recognized.\n");
			System.out.println("TYPE 'help' FOR LIST OF COMMANDS.\n");
		}
	}
	
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
	    return 1;
	}
	else if (a instanceof Predator){
	    return -1;
	}
	else{
	    return 0;
	}
    }
	
    //checkSurround: The Big Sister of checkBox. Robustification is not writing the same code more than once. 
    //Takes in two arrays with possible x and y cors, and then runs through it with a nested for loop for all possible combinations. Prints out the number of Predators and Prey around you. 
    public void checkSurround(int[] p, int[] q){
	int numPrey = 0;
	int numPred = 0;
	for (int i:p){
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
	//If there are no prey or predators in the surrounding squares. 
	if ((numPrey == 0) && (numPred == 0)){
	    for (int w:p){
		for (int l:q){
		    //if the loop runs through the original coordinates
		    if ((w == p[1]) && (l == q[1])){}
		    else{
			//if the coordinates have been used already (prevents forever rechecking)
			if (!(g.getUsedCors()[l][w] instanceof Empty)){}
			else{
			    g.setUsedCors(w, l, 0);
			    checkGrid(w, l);
				}
		    }
		}
	    }
	    (g.getArray()[q[1]][p[1]]).setSusName("+"+ numPrey + "," + "-" + numPred);
		if (notifs.equals("yes")){
			System.out.println("At " +(p[1]+1) + "," + (q[1]+1) + ":");
			System.out.println("There was nothing near you, but you looked around.");
		}
	}
	else{
	    (g.getArray()[q[1]][p[1]]).setSusName("+"+ numPrey + "," + "-" + numPred);
	}
    }
	
	//Checks if the player exited
	public boolean noExit(){
		if (exit == false){
			return true;
		}
		else{
			return false;
		}
	}
   	
    //Where the magic haPPENS
    public static void main(String[] args){
	String str = "\n\n\n";
	str += "   ('-.                              ('-.       .-') _  ('-.     _ .-') _               _  .-')\n";   
	str += " _(  OO)                            ( OO ).-.  (  OO) )( OO ).-.( (  OO) )             ( \\( -O )\n";
	str +="(,------.,--.              .-----.  / . --. /,(_)----. / . --. / \\     .'_  .-'),-----. ,------.\n"  ;
	str +=" |  .---'|  |.-')         '  .--./  | \\-.  \\ |       | | \\-.  \\  ,`'--..._)( OO'  .-.  '|   /`. '\n" ;
	str +=" |  |    |  | OO )        |  |('-..-'-'  |  |'--.   /.-'-'  |  | |  |  \\  '/   |  | |  ||  /  | |\n";
	str +="(|  '--. |  |`-' |       /_) |OO  )\\| |_.'  |(_/   /  \\| |_.'  | |  |   ' |\\_) |  |\\|  ||  |_.' |\n" ;
	str +=" |  .--'(|  '---.'       ||  |`-'|  |  .-.  | /   /___ |  .-.  | |  |   / :  \\ |  | |  ||  .  '.'\n";
	str +=" |  `---.|      |       (_'  '--'\\  |  | |  ||        ||  | |  | |  '--'  /   `'  '-'  '|  |\\  \\ \n " ;
	str +="`------'`------'          `-----'  `--' `--'`--------'`--' `--' `-------'      `-----' `--' '--'\n" ;
	System.out.println(str);
	str = "                       Project by Jennifer Yu, Eugene Thomas, Allard Peng\n";
	System.out.println(str);
	boolean wannaPlay = true;
	//Mechanism for the USER to choose if he/she wants to play again after the game has ended.
	while (wannaPlay){
	int sideLength = 0;
	boolean between = false;
	while (between == false){
		System.out.println("How big do you want your hunting ground to be? Choose a side length for your map, from 9 to 16.");
		sideLength = Keyboard.readInt();
		if(sideLength > 16 || sideLength < 9){
			System.out.println("Sorry, that number is not between 9 and 16. Please choose again.");
		}
		else{
			between = true;
		}
	}
	//BROWN 
	Woo brown = new Woo(sideLength);
	int[] i = new int[2];
	//while the USER is still playing
	while (brown.checkStatus() == 0){
	    i = brown.ask();
		if (brown.noExit()){
			System.out.println(brown.g);
			}
		}
	//if the USER won
	if (brown.checkStatus() == 1){
		System.out.println(((RealAnimals)(brown.g.getArray()[i[1]][i[0]])).getEnd());
		System.out.println();
	    System.out.println("You won!");
		System.out.println("Press 1 to play again. Press 2 to escape while you still can.\n"); 
	    boolean applies = false; 
	    while (!applies) { 
	    int t; 
	    t = Keyboard.readInt(); 
	    if (t != 1 && t != 2) { 
		System.out.println("Please pick 1 or 2...."); 
		}
	    else { if (t == 2) {wannaPlay = false; applies = true;}
		else if (t == 1) {applies = true; System.out.println("\nPlaying again...\n\n");}
			}
			}
		}
	//if the USER forced exited the game
	else if (brown.checkStatus() == 2){
		System.out.println("Laying on the ground, you close your eyes, turn off your flashlight, and wait for the darkness to consume you.");
		wannaPlay = false;
		}
	//if the USER lost
	else{
		System.out.println(((RealAnimals)(brown.g.getArray()[i[1]][i[0]])).getEnd());
		System.out.println();
	    System.out.println("You lost!");
		System.out.println("Press 1 to play again. Press 2 to cowardly wince away in terror.\n"); 
	    boolean appliez = false; 
		//Eugene WYD
	    while (!appliez) { 
	    int s; 
	    s = Keyboard.readInt(); 
	    if (s != 1 && s != 2) { 
		System.out.println("Please pick 1 or 2...."); 
		}
	    else { if (s == 2) {wannaPlay = false; appliez = true;}
		else if (s == 1) {appliez = true; System.out.println("\nPlaying again...\n\n");}}}
	}}
		
    }
} 
