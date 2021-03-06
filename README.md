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
 **Project by TURTLES, period 3** <br>
 **Jennifer Yu, Eugene Thomas, Allard Peng** <br> 
 :turtle::turtle::turtle:
 
**Description:** 
  
El Cazador, spanish for "The Hunter", is a mashup of the two classic games Battleship and Minesweeper. As the hunter, your objective is to "catch" as many prey as possible, and avoid all the predators in the forest who will attack you (unless you're a masochist and into that...to each his'er own!). The game's hunting grounds range from a 9x9 grid to a 16x16 grid (the larger the grid, the harder the game), and at the beginning, the grid is populated with 20% consisting of animals (10% prey, 10% predators). You will be informed on how many prey you need to catch in order to win the game. You also begin the game with 100 HP (Health Points), which decrease every time you are attacked by a predator (the damage per predator varies). Every time you make a catch, you increase your CP (Catch Points) by 1 and the program will update you on how many more prey you need to catch. You roam the hunting grounds by typing in x and y coordinates on the grid; bear in mind, however, that you cannot enter coordinates outside the grid (if you're playing in a 9x9, please don't enter x:10, y:3), and you cannot revisit coordinates you have already entered (if you already went to x:3, y:4, you cannot enter those same coordinates anymore, so sorry). If the coordinate you enter has a prey, great! You made a catch! If the coordinate you enter has a predator...not so great? You get attacked, and hopefully the damage you sustain doesn't kill you. If your coordinate has nothing there, then you will receive an indication of how many predators and prey are near you. This is where the minesweeper element comes into play; if there is nothing around you, then you open up the squares around you as well. With the right coordinate, sometimes you can open up bunches of squares at the same time...leading you ever closer towards success. In the end, you win if you have caught all the prey, or if you have depleted your health. Let's all collectively hope it's the latter--I mean former(what??). At any rate...HAPPY HUNTING!
   
**Features:** 

MEET THE PREDATORS: 
- Jen the Jaguar :leopard:
- Zoey the Zebra:sun_with_face:
- Bonnie the Bear:bear:
- Dasha the Dartfrog:frog:
- Masha the Mammoth:elephant:
- Yiling the Yak:ox:
- Cody the Crocodile:crocodile:

MEET THE PREY: 
- Ida the Iguana:dragon_face:
- Rachel the Rabbit:rabbit:
- Jessica the Jellyfish:information_desk_person:
- Patricia the Pangolin:punch:
- Eugene the Egret:baby_chick:
- Allard the Armadillo:sun_with_face:
- JennK the Jackrabbit:rabbit:

COMMANDS WITHIN THE GAME: 
- help -- displays the list of commands in the game.
- rules -- displays the rules of the game.
- grid -- reprints the current grid in the game.
- catches -- displays the # of catches already made.
- health -- displays the current health.
- left -- displays the # of catches left.
- pred -- displays the descriptions of the predators.
- prey -- displays the descriptions of the prey.
- toggle -- change the current status of notifications.
- exit -- force exits the game.


**Launch Instructions and Gameplay:** 

1. Clone this Repo using the following SSH key by copying the following in your terminal/command prompt: ``git clone git@github.com:jenyu7/Turtles.git``. 
2. Then, enter whatever folder you cloned into and copy: ``cd Turtles``, to enter the folder. 
3. Compile ``Woo.java`` by copying and pasting ``javac Woo.java``. Press Enter. Copy and paste ``java woo`` to run the java file. 
4. You will be greeted with the titlescreen and a storyline, along with instructions on how to play the game, and fact sheets on all the animals. 
5. You will then be prompted to selected at which size you want the grid, between a 9x9 and a 16x16. The larger the grid, the harder the game!
6. Enter your name; introduce yourself! 
7. After that, a labeled grid is printed as well as a message prompting you to select an x-coordinate. After entering the x-coordinate, you are then prompted to select a y-coordinate as well.  
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

