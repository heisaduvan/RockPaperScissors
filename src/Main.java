
public class Main {

	public static void main(String[] args) {

		GameCalculator gameCalculator;
		IMove computerMove;
		IMove userMove;
		UserInterfaceTool userInterfaceTool = new UserInterfaceTool();
		gameCalculator = userInterfaceTool.getGamerType();
		GameManager gameManager = new GameManager(gameCalculator);
		userInterfaceTool.showRules();
		int counter = 0;
		while (gameCalculator.checkedScore()) {
			computerMove = gameManager.getComputerMove();
			userMove = userInterfaceTool.getUserMove();
			//userMove = gameManager.getComputerMove();
			userInterfaceTool.showMoves(computerMove, userMove);
			gameManager.compareTo(computerMove, userMove);
			counter++;
		}
		System.out.println("Total Move : " + counter);
	}
}
