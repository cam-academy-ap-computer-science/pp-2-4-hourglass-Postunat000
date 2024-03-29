/* Grading - Sarah Gilliam

10 pts - Correct Output (must compile and run)
3 pts - Proper Use of Static Methods
3 pts - Proper Use of for loops
3 pts - Pseudocode
2 pts - Comments
2 pts - Consistent Layout and Style following Style Guidelines
2 pts - Proper Use of at least one Class Constant
The idea behind the constant is that you can change the value in one place and impact the size of your hourglass :-), 
you ended up using it so your comment no longer applies. But I'd recommend naming it something a little more helpful in the future.
0/2 pts Extra Credit 

25/25 total points
#goodGrade!

*/
/*
write main method
	The main method should include:
	A method for the top and bottom of the hourglass
	A method for the top of the hourglass
	A println statement for the middle two lines
	A method for the bottom of the hourglass
	Call the method for the top and bottom of the hourglass
write method for topBottom
	A print statement for the start line |
	A for loop to make ten quotation marks
	A print statement for the end line |
write method for top half
	Write a for loop for the number of lines there are
	Declare the variables for the colons and spaces
	Write a for loop for the spaces
	Write a print statement with a space
	End that segment with a curly brace
	Next write a print statement with \\
	Write nested for loops for the number of colons each line gets
	End segment with a curly brace
	Write a print statement with /
	Write a println statement so it goes to the next line
write method for bottom half
	Write a for loop for the number of lines there are
	Declare new variables for colons and spaces
	Write a for loop for the number of spaces
	Write a print statement with a space
	End that segment with a curly brace
	Next write a print statement with /
	Write nested for loops for the number of colons each line gets
	End segment with a curly brace
	Write a print statement with \\
	Write a println statement so it goes to the next line
*/

public class Hourglass {
	//really sorry this constant is unnecessary 
	//but apparently I must include it
	//#badGrade
	public static final int TOO = 2;
	public static void main(String[] args) {
		//basic layout of hour glass
		topBottom();
		topHourglass();
		System.out.println("     ||");
		bottomHourglass(); 
		topBottom(); 
	}
	
	public static void topBottom() {
		//prints the line at the top and bottom
		System.out.print("|");
		for (int i = 1; i <= 10; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
		System.out.println();
	}

	public static void topHourglass() {
		//First come up with a loop for the spaces before the body
		//This loop determines how many lines there are
		for (int line = 1; line <= 4; line++) {
			int colons = -TOO * line + 10;
			int spaces = 1 * line + 0;
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			//this loop sets up the number of colons
			System.out.print("\\");
			for (int j = 1; j <= 1; j++) {
				for (int k = 1; k <= colons; k++) {
					System.out.print(":");
				}
				System.out.print("/");
				System.out.println();
			}
		} 
	} 
	
	public static void bottomHourglass() {
		//this loop tells how many lines there are
		for (int line = 1; line <= 4; line++) {
			int colons = line * TOO;
			int spaces = -1 * line + 5;
			//this loop is for the spaces before
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			//this loop is for the body
			for (int j = 1; j <= 1; j++) {
				for (int k = 1; k <= colons; k++) {
					System.out.print(":");
				}
			}
			System.out.print("\\");
			System.out.println();
		}
	} 
}
		
		
		
		
