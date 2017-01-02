package Powers;
import java.lang.Math;
import java.util.Scanner;

/* This is a simple program intended to take the user inputs of a base
 * and an exponent, and output the result as the base multiplied by itself 
 * exponent times. Aka it is raising base to the power of exponent.
 */

// import declarations and packages
class Powers {

	public static void main(String[] arguments) {
		
		// create scanner to take user input
		Scanner power = new Scanner(System.in);
		
		System.out.println("What is the base of your expression?: ");
		int base = power.nextInt();
		int steady = base;
		/* created steady to hold an unchanging value of base.
		since steady is outside of the scope of the for loop,
		it allows for a constant for base to multiply in each iteration
		*/
		
		System.out.println("What is the exponent of your expression?: ");
		int expo = power.nextInt();
		
		for (int i = 0; i < expo-1; i++){
			base = steady * base;
		}
		
		System.out.println(base);
		power.close();
		
	}
}
