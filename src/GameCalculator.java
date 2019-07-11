
public abstract class GameCalculator {

	int score;
	public abstract void upScore();
	public abstract void downScore();
	public abstract void youWin();
	public  final void updateScore(int status){
		if(status < 0) {
			System.out.println("**YOU WIN**");
			upScore();
		}else if (status >0) {
			System.out.println("**YOU LOSE**");
			downScore();
		}else {
			System.out.println("SCORELESS");
			
		}
		System.out.println("New Score : " + score);
	}
	public final boolean checkedScore() {
		if (score >= 50) {
			youWin();
			return false;
		}else if(score<=-50) {
			gameOver();
			return false;
		}else {
			return true;
		}
		
	}
	public final void gameOver() {
		System.out.println("GAME OVER!!");
	}
}
