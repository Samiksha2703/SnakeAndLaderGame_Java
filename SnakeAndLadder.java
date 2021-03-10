public class SnakeAndLadder {

	// Declaring variables
	public static final int initialPosition = 0;
	public static final int finalPosition = 100;

	// Main method to execute program
	public static void main(String args[]) {
		int steps = 0;
		int dieNumber;
		int currentPosition;
		int playerPosition = initialPosition;

		//loop to iterate the code till the winning position
		while (playerPosition != finalPosition) {
			steps++;
			//Generating random number
			int playNoPlay = (int) Math.floor(Math.random() * 10) % 3;
			currentPosition = playerPosition;
			switch (playNoPlay) {
			case 0:
				playerPosition = currentPosition;
				break;
			case 1:
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition += dieNumber;
				if (playerPosition > 100) {
					playerPosition = currentPosition;
				}
				break;
			case 2:
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition -= dieNumber;
				if (playerPosition <= 1) {
					playerPosition = 1;
				}
				break;
			}
		}
	}
}

