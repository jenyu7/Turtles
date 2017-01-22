import java.util.ArrayList; 
public class Predator extends Animal implements RealAnimals{ 

	//Declare Variables
	public int damage; 
	
	//Names and Stories
    ArrayList<String> names = new ArrayList<String>(7); { 
	names.add("Jen the Jaguar");
	names.add("Zooey the Zebra");
	names.add("Bonnie the Bear"); 
	names.add("Dasha the Dartfrog");
	names.add("Masha the Mammoth");
	names.add("Yiling the Yak");
	names.add("Cody the Crocodile");
	} 
	
	ArrayList<String> susNames = new ArrayList<String>();{
	susNames.add(" Jen "); 
	susNames.add("Zooey"); 
	susNames.add("Bnnie"); 
	susNames.add("Dasha");
	susNames.add("Masha");
	susNames.add("Yilng");
	susNames.add(" Cdy ");
	}
	
	ArrayList<String> stories = new ArrayList<String>(7);{
	stories.add("Sleep deprived and super grumpy, this jaguar has just been disturbed at the wrong time. One swipe at your face, and a few bites in your abdomen would've killed you. Instead, she just slashes your arm, leaving gaping wounds.");
	stories.add("A majestic beast, and normally very docile, but Zooey is not having any of it today. With one kick to your chest, your heart nearly shatters.");
	stories.add("Bonnie the Bear is a mercurial creature. Is today a good or bad day for Bonnie? Guess we're about to find out, because she's coming right towards you.");
	stories.add("Pretty colors, but this is like one of those nature show you watched as a kid (what a nerd). Stay away from amphibians with bright colors! Maybe a brush of the skin won't kill you.");
	stories.add("Wait, you thought mammoths were extinct? Well, this is my game, er, hunting ground, and if I want to resurrect extinct animals, I WILL. Now, instead of gaping, you should probably dodge Masha's tusks, which could totally spear through you.");
	stories.add("Yes, yaks exist. They're not just part of a name of a satirical anonymous app. I bet you wish they didn't exist. This yak is angry. Haha, guess she's the hunter now.");
	stories.add("Cody the crocodile has his quirks, but they don't include \"forgiving a strange person wandering in my territory\". With his strong jaws, he grabs ahold of your foot.");
	}
	
	ArrayList<String> endStories = new ArrayList<String>(7);{
	endStories.add("The last thing you see are the black and brown spots before your eyes are clouded with, now red, spots. Spots of your blood...and then darkness.");
	endStories.add("What's that beating in your chest?? You kneel down, and suddenly the world is spinning. Like in Kill Bill, this zebra just pulled the Five Point Palm Exploding Heart move on you. Your heart, unable to take it any longer, finally bursts.");
	endStories.add("Oof, Bonnie, who hurt you? But the real question here is, was it as bad as how hurt you yourself are right now? Cause, you're kinda, sorta, dying??");
	endStories.add("You should've stayed away. Oh, National Geographic, why hast thou forsaken me?");
	endStories.add("Homegirl just came back from 10,000 years of irrelevance to kick your a$$. Like wine, she's improved with age, and also like wine, is the blood gushing from your extensive wounds.");
	endStories.add("The Hunter is now the hunted (haha get it, hunter). Oh, and BTW, you're dying.");
	endStories.add("Continued: He has taken your foot, and probably is going to eat the rest of you too. Hopefully, the rivers of blood flowing from your leg will end your suffering before Cody's jaw bites into your face.");
	}
	
	//Damages
	ArrayList<Integer> damages = new ArrayList<Integer>(7);{
	damages.add(30);
	damages.add(30);
	damages.add((int) (Math.random() *50));
	damages.add(5);
	damages.add(10);
	damages.add(5);
	damages.add(20);
	}
	
	//Default Constructor 
	public Predator() { 
		int randInt = (int) (Math.random()*7); 
		name = names.get(randInt); 
		story = stories.get(randInt);
		damage = damages.get(randInt); 
		susName = susNames.get(randInt);
		endStory = endStories.get(randInt);
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
	
	//Gets the sus name
	public String getSusName(){
		return susName;
	}
	
	//Gets the personalized ending story
	public String getEnd(){
		return endStory;
	}
	
	public void setSusName(String str){
	}
} 
