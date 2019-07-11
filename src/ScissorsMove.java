
public class ScissorsMove implements IMove {

	String type;
	public ScissorsMove() {
		// TODO Auto-generated constructor stub
		type = "scissors";
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	@Override
	public int compare(IMove userMove) {
		// TODO Auto-generated method stub
		if(userMove.getType() == "rock") {
			return -1;
		}else if (userMove.getType()=="paper") {
			return 1;
		}
		return 0;
	}

}
