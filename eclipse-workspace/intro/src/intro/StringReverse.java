package intro;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		ReverseString();
	}
	
	private static void ReverseString () {
		//Detect input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string: ");
		
		char[] letters = scanner.nextLine().toCharArray();
		System.out.println("Reversed String: ");
		
		//Reversing handled here
		for(int i = letters.length - 1; i >= 0; i--)
		{
			System.out.println(letters[i]);
		}
		
		System.out.println("\n");
		
		Retry();
	}

	private static void Retry () {
		System.out.println("Try again? ");
		
		Scanner scanner = new Scanner(System.in);
		String reply = scanner.next();
		char[] letters = scanner.nextLine().toCharArray();

		System.out.println("You replied: " + reply + " This feature is being worked on.. ):");
	}
}
