package logical.program;

  public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("welcome to tic tac toe game:");
		createBoard();
	}
	public static void createBoard() {
	char createboard [] = new char[10];
	for(int i = 1; i<createboard.length; i++) {
		createboard[i] = ' ';
	}
	}
}

