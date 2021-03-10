public class SnakeAndLadder {

	// Declaring variables
	public static final int initialPosition = 0;
	public static final int finalPosition = 100;

	// Main method to execute program
	public static void main(String args[]) {
		int playerPosition = initialPosition;
		//Generating random number
		int dieNumber = (int) Math.floor(Math.random() * 6) + 1;
		playerPosition += dieNumber;
	}
}
