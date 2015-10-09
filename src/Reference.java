import java.util.Scanner;

/*
$$$$$$$$\ $$$$$$$\  $$$$$$\  $$$$$$\  
$$  _____|$$  __$$\ \_$$  _|$$  __$$\ 
$$ |      $$ |  $$ |  $$ |  $$ /  \__|		Created: 10/9/2015
$$$$$\    $$$$$$$  |  $$ |  $$ |      		Purpose: Java Reference File
$$  __|   $$  __$$<   $$ |  $$ |      
$$ |      $$ |  $$ |  $$ |  $$ |  $$\ 
$$$$$$$$\ $$ |  $$ |$$$$$$\ \$$$$$$  |
\________|\__|  \__|\______| \______/ 
* Code Reference
 */

public class Reference {

	/*
	 * "public static void main(String[] args)"
	 * is the main method, and in this case we will be dumping all of our code inside it's brackets. 
	 * From the '{' open bracket to the '}' close bracket will contain all of our code
	 */
	public static void main(String[] args) {
	
		/*
		 * Declaring Variables:
		 * You should always declare them at the top of your program so that you can see them if you ever need to look back.
		 * When you name a variable it can't have a number at the beginning of it. 
		 * You should always give them some kind of relavence/relation as to what they are. 
		 */
		
		// In java unless the line ends with a '{' or a '}' bracket, you must put a semicolon; 
		
		// In Java, Variables are declared like this:
		// VARIABLE_TYPE variable_name = variable_value;
		// Example: 
		// int aNumber = 5;
		
		Scanner inputListener = new Scanner(System.in);	
		// inputListener is a variable for the scanner which we can use to grab input. 
	
		// Below is a simple program to prompt some one for there name. 
		String name;
		
		// First we prompt the user for their name:
		System.out.println("Hi, what's your name?");
		name = inputListener.nextLine(); // This will read what the user types in.
		
		// Now we welcome them. 
		// Strings in Java can be split by using +
		// For Example:
			// "Hello " + "I'm good" + " today"
		// We can add variales in between strings like this:
			// "Hello " + name + ", how are you today?"
			// Output: Hello Eric, how are you today?
		
		// So let's do that:
		System.out.println("Hello " + name + ", let's add some numbers!");
		
		// Below is a simple program to add and subtract integers.
		
		int firstNumber; // First and Second number are now undefined values that will be numbers.
		int secondNumber;
		int answer; //  The sum of our operation:
		
		System.out.println("Please enter a number you would like to add:"); // Now we ask the user for input.
		firstNumber = inputListener.nextInt(); // Now the InputListener will set FirstNumber to the next integer someone enters that it finds.
		
		// Now we prompt for the second number:
		System.out.println("Please enter another number you would like to add:"); // Now we ask the user for input.
		secondNumber = inputListener.nextInt(); // Now the InputListener will set SecondNumber to the next integer someone enters that it finds.
		
		// Now we do our math operations: 
		answer = firstNumber + secondNumber;
	
		// Now we give the user their answer:
		System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
		
		// Now that the program is done, we close the input listener so it stops listening. 
		inputListener.close();
	}

}
