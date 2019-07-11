
public class ChildGameCalculator extends GameCalculator {

	@Override
	public void upScore() {
		// TODO Auto-generated method stub
		score +=10;
	}

	@Override
	public void downScore() {
		// TODO Auto-generated method stub
		score -=10;
	}

	@Override
	public void youWin() {
		// TODO Auto-generated method stub
		System.out.println("HEY DUDE!!! *** HURRA!! YOU WIN ***");
	}

}
