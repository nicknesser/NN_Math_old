package GravityCalculator;

import java.util.Scanner;
import java.math.*;

/*This program calculates your position on the y axis, using the mathematical 
 * equation for the position of a falling object rounded to 3 decimal places. 
 */
class GravityCalculator {
	public static void main(String[] arguments) {
		Scanner gc= new Scanner(System.in);
		
		System.out.println("Enter a value for gravity (Generally -9.81): ");
		double gravity = gc.nextDouble(); // Earth's gravity in m/s^2
		
		System.out.println("Enter a starting position: ");
		double initialPosition = gc.nextDouble();
		
		System.out.println("Enter a starting velocity: ");
		double initialVelocity = gc.nextDouble();
		
		System.out.println("Enter the time of falling: ");
		double fallingTime = gc.nextDouble();
		
		double finalPosition = (0.5 * (gravity * fallingTime * fallingTime) + (initialVelocity * fallingTime) + (initialPosition));
		
		System.out.println("The object's position after " + fallingTime + " seconds is " + (finalPosition) + " m.");
  }
}
