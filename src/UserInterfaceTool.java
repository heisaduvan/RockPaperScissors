import java.util.ArrayList;
import java.util.Scanner;

public class UserInterfaceTool {
	ArrayList<GameCalculator> gameCalculator = new ArrayList<>();
	ArrayList<IMove> moveType = new ArrayList<>();
	public UserInterfaceTool() {
		System.out.println("***Lets Play With Me***");
		gameCalculator.add(new AdultGameCalculator());
		gameCalculator.add(new ChildGameCalculator());
		moveType.add(new RockMove());
		moveType.add(new PaperMove());
		moveType.add(new ScissorsMove());
	}
	public void showRules() {
		System.out.println("Press 1 for Rock Move");
		System.out.println("Press 2 for Paper Move");
		System.out.println("Press 3 for Scissors Move");
		System.out.println("**************************");
	}
	public void showMoves(IMove computerMove, IMove userMove) {
		System.out.println("Computer Move : " + computerMove.getType().toUpperCase());
		System.out.println("Your Move :"+userMove.getType().toUpperCase());
	}
	public GameCalculator getGamerType() {
		System.out.println("Press 1 for Adult Game, Press 2 for Child Game..");
		System.out.println("");
		System.out.print("Please select your choose : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int gameType = scanner.nextInt() - 1; // arraylist index yapýsýndan dolayý -1 yaptýk.
		return gameCalculator.get(gameType);
	}
	public IMove getUserMove() {
		System.out.print("Your Move :");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int moveTypeNumber = scanner.nextInt()-1; // arraylist index yapýsýndan dolayý -1 yaptýk.
		return moveType.get(moveTypeNumber);
		
	}
}
