# El Cazador by Turtles 

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

1. Clone this Repo using the following SSH key by copying the following in your terminal/command prompt: "git clone git@github.com:jenyu7/Turtles.git". 
2. Then, copy the following command: cd Turtles, to enter the folder. 
3. Compile Woo.java by copying and pasting "javac Woo.java". Then, after pressing enter, copy and paste "java woo" to run the java file. 
4. Upon entering the game, you will be prompted to selected at which difficult you want the grid. The larger the grid, the harder the game!
5. You will be granted by a story of how you ended up on this hunting ground, enconded with directions similar to those you are recieving now. 
6. Then, you must enter your name, the narrator of your story will gladly taunt you with it many a time throughout your journey. 
7. After that, a labeled grid is printed as well as a message prompting you to select an x-coordinate, after entering you are prompted to select a y-coordinate as well. 
8. Then, the grid is reprinted: 
	a. If the square is a predator: 
		i. A message is printed, detailing how you were captured, along with the amount of HP is lost.
		ii. In the square selected, the name of the predator is displayed in the square. 
	b. If the square is a prey: 
		i. A message is printed, detailing how you were captured, along with the amount of Catch Points gained. 
		ii. In the square selected, the name of the prey is displayed in the square.
	c. If the square is empty: 
		i. In the square selected, a string is printed in the form (Number of Prey), (Number of Predators). 
9. If all of the prey are selected, the game is over, and you are declared the supreme hunter!
10. If you lose all of your Health Points, the game is over, and you are declared dead. 

# HAPPY HUNTING!!!
