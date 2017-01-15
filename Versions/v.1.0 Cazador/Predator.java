import java.util.ArrayList; 
public class Predator extends Animal { 

	//Declare Variables
	public int damage; 
	
	//Names and Stories
    ArrayList<String> names = new ArrayList<String>(7); { 
	names.add("Jen the Jaguar");
	names.add("Zoey the Zebra");
	names.add("Bonnie the Bear"); 
	names.add("Dasha the Dartfrog");
	names.add("Masha the Mammoth");
	names.add("Yiling the Yak");
	names.add("Cody the Crocodile");
	} 
	
	ArrayList<String> stories = new ArrayList<String>(7);{
	stories.add("Sleep deprived, you have just disturbed this jaguar at the wrong time. One swipe at your face, and a few bites in your abdomen would've killed you. Instead, she just slashes your arm, leaving gaping wounds.");
	stories.add("A majestic beast, and normally very docile, but you have arrived at the wrong time. With one kick to your chest, your heart nearly shatters.");
	stories.add("Bonnie the Bear is a mercurial creature. Is today a good or bad day for Bonnie? Guess we're about to find out, because she's coming right towards you.");
	stories.add("Pretty colors, but this is like one of those nature show you watched as a kid (what a nerd). Stay away from amphibians with bright colors! Maybe a brush of the skin won't kill you.");
	stories.add("Wait, you thought mammoths were extinct? Well, this is my game, er, hunting ground, and if I want to resurrect extinct animals, I WILL. Now, instead of gaping, you should probably dodge Masha's tusks, which could totally spear through you.");
	stories.add("Yes, yaks exist. They're not just part of a name of a satirical anonymous app. I bet you wish they didn't exist. This yak is angry. Haha, guess she's the hunter now.");
	stories.add("Cody the crocodile has his quirks, but they don't include \"forgiving a strange person wandering in my territory\". With his strong jaws, he grabs ahold of your foot.");
	}
	
	//Damages and Spawn Possibilities
	ArrayList<Integer> damages = new ArrayList<Integer>(7);{
	damages.add(30);
	damages.add(30);
	damages.add((int) (Math.random() *50));
	damages.add(5);
	damages.add(10);
	damages.add(5);
	damages.add(20);
	}
	
	ArrayList<Integer> spawnRates = new ArrayList<Integer>(7);{
		
	}
	
	//Default Constructor 
	public Predator() { 
		int randInt = (int) (Math.random()*7); 
		name = names.get(randInt); 
		story = stories.get(randInt);
		damage = damages.get(randInt); 
	}
	
	// Returns name of Predator
	public String toString() { 
		return name; 
	}

	//ACCESSORS
	
	//Gets the story 
	public String getStory(){
		return story;
	}
	
	//Gets the value of damage (Useful post MVP)
	public int getDamage () { 
		return damage; 
	}
} 
