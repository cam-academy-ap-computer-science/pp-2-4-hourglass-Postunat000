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
		//bottomHourglass(); 
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
			}
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
	
	/*public static void bottomHourglass() {
		for (int line = 1; line <= 4; line++) {
			int colons = -8 * line + 10;
			int spaces = -1 * line + 5;
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j = 1; j <= 1; j++) {
				for (int k = 1; k <= colons; k++) {
					System.out.print(":");
				}
			}
			System.out.print("\\");
			System.out.println();
		}
	} */
}
		
		
		
		