import java.util.ArrayList; 
public class Prey extends Animal implements RealAnimals{
	
	//Declare Variables
	private int CP;

	//Names and Stories
	ArrayList<String> names = new ArrayList<String>(); {
	names.add("Ida the Iguana"); 
	names.add("Rachel the Rabbit"); 
	names.add("Jessica the Jellyfish"); 
	names.add("Pat the Pangolin");
	names.add("Eugene the Egret");
	names.add("Allard the Armadillo");
	names.add("JennK the Jackrabbit");
	}
	
	ArrayList<String> susNames = new ArrayList<String>();{
		susNames.add(" Ida "); 
		susNames.add("Rchel"); 
		susNames.add("Jssca"); 
		susNames.add(" Pat ");
		susNames.add("Eugne");
		susNames.add("Allrd");
		susNames.add("JennK");
	}
	
	ArrayList<String> stories = new ArrayList<String>();{
	stories.add("This iguana sure is a slippery one! Wrestling with her, you finally manage to get Ida into your bag. \"Don't worry,\" you tell her, \"We'll get you somewhere safe soon.\" ");
	stories.add("Rachel doesn't seem to like you much. But, like, whatever. She'll thank you later when the jaguars in this forest don't eat her for a midday snack.");
	stories.add("In a small pond, she is intimidating. But in the face of this vast forest, she wouldn't stand a chance. Your philanthropic actions will not go unpunished.");
	stories.add("He is a something akin to an armadillo. And even though you usually don't care about pangolins (or armadillos), you realize that they are a delicacy in some areas, such as China, and this forest. What a good person you are!");
	stories.add("So, maybe Eugene is a little grown for a small bird. But crocodiles live here, and they love nothing more than to hang out and wait for little baby egrets like Eugene to drop into their gaping mouths. And that is NOT okay.");
	stories.add("Armadillos are cool, but a little shy, and kind of fast. Luckily, with your expert animal wrangling skills, you get Allard to roll right into your bag. Success!");
	stories.add("Today is a bad day for you and rabbits, huh? You catching her is like if you blocked her on Instagram, Facebook, Snapchat, AND Reddit. (Really, Reddit?) Like, what the frick?? Little does she know you have just saved her from certain death.");
	}
	
	//Personalized ending stories!
	ArrayList<String> endStories = new ArrayList<String>(7);{
		endStories.add("A bright clearing opens before you, as you clutch Ida in your arms. Her scaly head peeks out of the bag, and even she knows, that now both of you are safe.");
		endStories.add("Rachel's eyes brighten as the forest begins to shake, and the trees part to reveal a road out. Looking at her, your eyes shoot \"I told you so!\" looks. It will be good. You will be safe. ");
		endStories.add("The pond collapses into a tunnel, and through it, you see a light...and a way out of this godforsaken forest. You hug the plastic bag with Jessica in it. \"We did it!\" you exclaim, as she swims around in glee.");
		endStories.add("You're just about to let Pat go when a void opens in the forest. It's full of light, and deep down, you know that it is the way out.");
		endStories.add("As you scoop up Eugene in your arms, suddenly, the ground shakes. The trees begin to part, revealing a path out of the forest. Whooping, you hug Eugene, who looks a little bewildered. \"We made it!\"");
		endStories.add("Suddenly, Allard scoots out of the bag. \"Hey!\" you yell, \"I'm just trying to help you here!\" The ground begins to shake, and you see Allard rolling into the path opening up in the forest. It's the way out. Overwhelmed with joy, you run after him, ready to go home.");
		endStories.add("JennK's eyes widen and her whiskers twitch as the forest shakes, and a path opens. She stares at you with dark brown eyes, and it takes you a minute to shake yourself from her gaze. \"Let's go,\" you say simply, as you walk down the path out of the forest, her in your arms.");
	}
	
	//Constructor
	public Prey () {
		int randInt = (int) (Math.random()*7); 
		name = names.get(randInt); 
		story = stories.get(randInt);
		CP = 1; 
		susName = susNames.get(randInt);
		endStory = endStories.get(randInt);
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
	
	//Gets the personalized ending story
	public String getEnd(){
		return endStory;
	}
	
	//Does nothing, but needs to be here 
	public void setSusName(String str){
	}
}
