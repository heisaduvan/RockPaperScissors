
public class RockMove implements IMove {

	String type;

	public RockMove() {
		// TODO Auto-generated constructor stub
		type = "rock";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public int compare(IMove userMove) {
		// TODO Auto-generated method stub
		if (userMove.getType() == "scissors") {
			return 1;
		} else if (userMove.getType() == "paper") {
			return -1;
		}
		return 0;
	}
}
