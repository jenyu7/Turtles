import java.util.ArrayList; 
public class Prey extends Animal {
	
	//Declare Variables
	private int CP;

	//Names and Stories
	ArrayList<String> names = new ArrayList<String>(); {
	names.add("Ida the Iguana"); 
	names.add("Rachel the Rabbit"); 
	names.add("Jessica the Jellyfish"); 
	names.add("Patricia the Pangolin");
	names.add("Eugene the Egret");
	names.add("Allard the Armadillo");
	names.add("JennK the Jackrabbit");
	}
	
	ArrayList<String> susNames = new ArrayList<String>();{
		susNames.add(" Ida "); 
		susNames.add("Rchel"); 
		susNames.add("Jssca"); 
		susNames.add("Ptrca");
		susNames.add("Eugne");
		susNames.add("Allrd");
		susNames.add("JennK");
	}
	
	ArrayList<String> stories = new ArrayList<String>();{
	stories.add("This iguana sure is a slippery one! Wrestling with her, you finally manage to get Ida into your bag. \"Don't worry,\" you tell her, \"We'll get you somewhere safe soon.\" ");
	stories.add("Rachel doesn't seem to like you much. But, like, whatever. She'll thank you later when the jaguars in this forest don't eat her for a midday snack.");
	stories.add("In a small pond, she's bloated and rather dull looking. She also doesn't put a fight when you scoop her up and put her in a bag (with airholes of course), and tie up the mouth of the bag (with sturdy, reliable string).");
	stories.add("This little guy (girl?) looks like a knockoff armadillo. But you've heard that pangolins are considered delicacies in some areas, such as China, and this forest. What a good person you are! She bites your finger innumerable times, but you keep holding on.");
	stories.add("So, maybe Eugene is a little grown for a small bird. But crocodiles live here, and they love nothing more than to hang out and wait for little baby egrets like Eugene to drop into their gaping mouths. And that is NOT okay.");
	stories.add("Armadillos are cool, but a little shy, and kind of fast. Luckily, with your expert animal wrangling skills, you get Allard to roll right into your bag. Success!");
	stories.add("Today is a bad day for you and rabbits, huh? You catching her is like if you blocked her on Instagram, Facebook, Snapchat, AND Reddit. (Really, Reddit?) Like, what the frick?? Little does she know you have just saved her from certain death.");
	}
	
	//Constructor
	public Prey () {
		int randInt = (int) (Math.random()*7); 
		name = names.get(randInt); 
		story = stories.get(randInt);
		CP = 1; 
		susName = susNames.get(randInt);
	} 
	
	//Returns the name of the Prey
	public String toString() {
		return name; 
	}
	
	//ACCESSORS
	//Get catchPoints
	public int getCP () {
		return CP; 
	}
	//Get Story
	public String getStory(){
		return story;
	}
	
	//Gets the sus name
	public String getSusName(){
		return susName;
	}
	 
	public void setSusName(String str){
	}
}