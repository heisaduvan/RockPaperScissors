
public class PaperMove implements IMove{
	String type;
	public PaperMove() {
		// TODO Auto-generated constructor stub
		type = "paper";
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
			return 1;
		}else if (userMove.getType()=="scissors") {
			return -1;
		}
		return 0;
	}
}
