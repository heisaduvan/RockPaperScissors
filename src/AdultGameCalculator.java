
public class AdultGameCalculator extends GameCalculator {

	@Override
	public void upScore() {
		// TODO Auto-generated method stub
		score += 5;
	}

	@Override
	public void downScore() {
		// TODO Auto-generated method stub
		score-=5;
	}

	@Override
	public void youWin() {
		// TODO Auto-generated method stub
		System.out.println("CONGRATS DUDE!! *** YOU WIN ***");
	}

}
