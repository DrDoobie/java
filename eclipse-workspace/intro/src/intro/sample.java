package intro;

public class sample {
//Complete beginner to Java, this is mainly for playing around/note taking

	public static void main(String[] args) {
		CalculateAll(10, 4);
	}
	
	private static void HelloWorld () {
		//This is how you print code to the console.
		System.out.println("Hello World");
	}
	
	//Some simple mathmatic functions
	private static void CalcSum (float val1, float val2) {
		float sum;
		sum = val1 + val2;
		System.out.println("The sum is: " + sum);
	}
	
	private static void CalcDifference (float val1, float val2) {
		float difference;
		difference = val1 - val2;
		System.out.println("The difference is: " + difference);
	}
	
	private static void CalcProduct (float val1, float val2) {
		float product;
		product = val1 * val2;
		System.out.println("The product is: " + product);
	}
	
	private static void CalcQuotient (int val1, int val2) {
		float quotient;
		quotient = val1 / val2;
		System.out.println("The quotient is: " + quotient);
	}
	
	private static void CalculateAll (int val1, int val2) {
		float sum, difference, product, quotient;
		sum = val1 + val2;
		difference = val1 - val2;
		product = val1 * val2;
		quotient = val1 / val2;
		
		System.out.println(" Sum: " + sum +
							"\n Difference: " + difference +
							"\n Product: " + product +
							"\n Quotient: " + quotient);
	}
}
