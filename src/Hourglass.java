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
		//topHourglass();
		System.out.println("    ||");
		//bottomHourglass();
		topBottom();
	}
	
	public static void topBottom() {
		System.out.print("|");
		for (int i = 1; i <= 10; i++) {
			System.out.print("\"");
		}
		System.out.print("|");
	}

	public static void topHourglass() {
		for (int i = 1; i <= 4; i++) {
			System.out.print(" ");
		}
		System.out.print("\\");
		for (int j = i; j <= 4; j++) {
			for (int k = 8; k >= 2; k--) {
			System.out.print(":");
			}
			System.out.print("/");
		}	
	}

	/* public static void bottomHourglass() {
		for (int i = 1; i <= 4; i++);
			for (int  Sj = 1; j <= 4 - 1; j++);
			System.out.println("\\" + j + "/");
	}
	*/
}
