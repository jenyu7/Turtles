<pre>
   ('-.                              ('-.       .-') _  ('-.     _ .-') _               _  .-')   
 _(  OO)                            ( OO ).-.  (  OO) )( OO ).-.( (  OO) )             ( \( -O )  
(,------.,--.              .-----.  / . --. /,(_)----. / . --. / \     .'_  .-'),-----. ,------.  
 |  .---'|  |.-')         '  .--./  | \-.  \ |       | | \-.  \  ,`'--..._)( OO'  .-.  '|   /`. ' 
 |  |    |  | OO )        |  |('-..-'-'  |  |'--.   /.-'-'  |  | |  |  \  '/   |  | |  ||  /  | | 
(|  '--. |  |`-' |       /_) |OO  )\| |_.'  |(_/   /  \| |_.'  | |  |   ' |\_) |  |\|  ||  |_.' | 
 |  .--'(|  '---.'       ||  |`-'|  |  .-.  | /   /___ |  .-.  | |  |   / :  \ |  | |  ||  .  '.' 
 |  `---.|      |       (_'  '--'\  |  | |  ||        ||  | |  | |  '--'  /   `'  '-'  '|  |\  \  
 `------'`------'          `-----'  `--' `--'`--------'`--' `--' `-------'      `-----' `--' '--' 
 </pre>
 
 ## El Cazador

Description: 

El Cazador is a game that consists of a 9x9 grid (in default mode) and animals randomly spread about the grid. The animals are either predators or prey, and the player uses numbers that are revealed in boxes bordering the animals to achieve the goal. The object of this game is to catch all the prey before getting killed by the predators. The game is a lot like Minesweeper in that patches of unoccupied "squares" on the grid open up, and reveal the numbers that provide the hints at where animals are located. Furthermore, "choosing" a square with a predator (bad!) on it will reduce the life of the player. Likewise, choosing a square with a prey on it will increment the player's catch points by 1.
   
   
Features: 

    MEET THE PREDATORS: 
      - Jen the Jaguar
      - Zoey the Zebra
      - Bonnie the Bear
      - Dasha the Dartfrog
      - Masha the Mammoth
      - Yiling the Yak
      - Cody the Crocodile
    
    THE PREY: 
      - Ida the Iguana
      - Rachel the Rabbit
      - Jessica the Jellyfish
      - Patricia the Pangolin
      - Eugene the Egret
      - Allard the Armadillo
      - Jenn the Jackrabbit


Gameplay:

1. Clone this Repo using the following SSH key by copying the following in your terminal/command prompt: ``git clone git@github.com:jenyu7/Turtles.git``. 
2. Then, copy the following command: ``cd Turtles``, to enter the folder. 
3. Compile Woo.java by copying and pasting ``javac Woo.java``. Press Enter. Copy and paste ``java woo`` to run the java file. 
4. You will be greeted with the titlescreen and a storyline, along with instructions on how to play the game, and fact sheets on all the aniamsl. 
5. You will then be prompted to selected at which size you want the grid, between a 9x9 and a 16x16. The larger the grid, the harder the game!
6. Enter your name; introduce yourself! 
7. After that, a labeled grid is printed as well as a message prompting you to select an x-coordinate, after entering you are prompted to select a y-coordinate as well. <b> NOTE: </b> In the larger levels, your terminal may not have the width to sustain the amount of columns that are printed (for example, git bash defaults the amount of columns at 80, but you can right-click and go to "Options" and place a larger number). 
8. Then, the grid is reprinted: 
	- If you met a predator: 
		- A message is printed, detailing how you were attacked, along with the amount of HP you lost, your current health, your current catch points, and how many prey you still need to catch.
		- The name of the predator is displayed in the coordinate you just visited. 
	- If you found a prey: 
		- A message is printed, detailing how you found and caught the prey, along with your updated catch points, your current health, and how many prey you still need to catch. 
		- The name of the prey is displayed in the coordinate you just visited.
	-  If you found nothing: 
		- The number of predators and prey in the coordinates around you is displayed in the coordinate you just visited, and in this format ``+<number of prey>,-<number of predators>``. 
9. If you catch all the prey, you have won the game! You release the prey in a safe(r) forest and all is well. 
10. If you are attacked to the point where you have depleted all your health points, you are dead (and a loser...sorry). 

## HAPPY HUNTING!!!
