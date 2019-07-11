import java.util.ArrayList;
import java.util.Random;

public class GameManager {
	GameCalculator gameCalculator;
	ArrayList<IMove> moveType = new ArrayList<>();
	public GameManager(GameCalculator gameCalculator) {
		this.gameCalculator = gameCalculator;
		moveType.add(new RockMove());
		moveType.add(new PaperMove());
		moveType.add(new ScissorsMove());
	}
	public void compareTo(IMove computerMove, IMove userMove) {
		
		gameCalculator.updateScore(computerMove.compare(userMove));
	}
	public IMove getComputerMove() {
		Random random = new Random();
		int moveTypeNumber = random.nextInt(3);
		return moveType.get(moveTypeNumber);
	}
}
