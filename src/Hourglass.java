/*
write main method
write method for topBottom
write method for top half
statement with two straight lines
write method for bottom half
call method for topBottom

*/

public class Hourglass {
	public static void main(String[] args) {
		//basic layout of hour glass
		
		topBottom();
		topHourglass();
		System.out.println("     ||");
		bottomHourglass();
		topBottom();
	}
	
	public static void topBottom() {
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
			int colons = -2 * line + 10;
			int spaces = 1 * line + 0;
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
				//This loop defines the loop for spaces before the body
			}
			
			for (int j = 1; j <= i; j++) {
				
			}
		}
	}
	
	public static void bottomHourglass() {
		//This for loop determines how many lines there are
		for (int i = 4; i >= 1; i--) {
			//This loop describes the number of spaces before the body
			for (int j = 4; j >= 1; j--) { //straight line if j <= 4 or j >= 1
				System.out.print(" ");
			}
			System.out.print("/");
			System.out.println();
		}
	}
	
	public static void topInside() {
		int colons = -2 * line + 10;
		for (int i = 1; i <= 8; i++) { //The i <= determines the number of colons
			for (int j = 8; j >= 2; j--);
			System.out.print(":");
		}
		System.out.println("/");
	}
}

/*	public static void topInside() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= 2; j--);
			System.out.print(":");
		}
		System.out.println("/");
	}
	
Result is
 \::::::::/
  \::::::::/
   \::::::::/
    \::::::::/
	 */
		
		
		
		