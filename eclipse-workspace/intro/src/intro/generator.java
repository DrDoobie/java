package intro;
import java.util.*;

public class generator {

	public static void main(String[] args) {
		GenerateSentence(10);
	}
	
	//Generate a random number
	private static void GenerateRandom (float max) {
		System.out.println(Math.floor((Math.random() * max) + 1));
	}
	
	//Generate a random sentence.
	private static void GenerateSentence (int x) {
		//Print x sentences
		for(int n = 0; n < x; n++)
		{
			//All words usable by generator
			Random rand = new Random();
			
			String Nouns[] = {"John", "George", "Paul", "Ringo", "Mary Jane"};
			String Verbs[] = {"sing", "frolic", "hop", "walk", "skip"};
			String Adjectives[] = {"gladly", "sadly"};
			
			//Assign "n" values
			int n1 = rand.nextInt(Nouns.length);
			int n2 = rand.nextInt(Verbs.length);
			int n3 = rand.nextInt(Adjectives.length);
			
			//If verb requires s
			if(n1 >= 2)
			{
				System.out.println(Nouns[n1] + " " + Verbs[n2] + "s " + Adjectives[n3] + ".");
				
			} else {
				System.out.println(Nouns[n1] + " " + Verbs[n2] + " " + Adjectives[n3] + ".");
			}
		}
	}
}
