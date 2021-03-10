public class SnakeAndLadder {

	// Declaring variables
	public static final int initialPosition = 0;
	public static final int finalPosition = 100;

	// Main method to execute program
	public static void main(String args[]) {
		int steps1 = 0, steps2 = 0;
		int dieNumber;
		int currentPosition;
		int playNoPlay;
		int playerPosition1 = initialPosition, playerPosition2 = initialPosition;

		//loop to iterate the code till the winning position
		while ((playerPosition1 != finalPosition) && (playerPosition2 != finalPosition)) {
			//code for player 1
			steps1++;
			playNoPlay = (int) Math.floor(Math.random() * 10) % 3;
			currentPosition = playerPosition1;
			switch (playNoPlay) {
			case 0:
				playerPosition1 = currentPosition;
				break;
			case 1:
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition1 += dieNumber;
				if (playerPosition1 > 100) {
					playerPosition1 = currentPosition;
				}
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition1 += dieNumber;
				if (playerPosition1 > 100) {
					playerPosition1 = currentPosition;
				}
				steps1++;
				break;
			case 2:
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition1 -= dieNumber;
				if (playerPosition1 <= 1) {
					playerPosition1 = 1;
				}
				break;
			}

			//Code for player 2
			steps2++;
			playNoPlay = (int) Math.floor(Math.random() * 10) % 3;
			currentPosition = playerPosition2;
			switch (playNoPlay) {
			case 0:
				playerPosition2 = currentPosition;
				break;
			case 1:
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition2 += dieNumber;
				if (playerPosition2 > 100) {
					playerPosition2 = currentPosition;
				}
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition2 += dieNumber;
				if (playerPosition2 > 100) {
					playerPosition2 = currentPosition;
				}
				steps2++;
				break;
			case 2:
				dieNumber = (int) Math.floor(Math.random() * 6) + 1;
				playerPosition2 -= dieNumber;
				if (playerPosition2 <= 1) {
					playerPosition2 = 1;
				}
				break;
			}
		}
		if (playerPosition1 == finalPosition)
			System.out.println("Player 1 won the game.\nNumber of steps to won the game is " + steps1);
		else
			System.out.println("Player 2 won the game.\nNumber of steps to won the game is " + steps2);
	}
}

