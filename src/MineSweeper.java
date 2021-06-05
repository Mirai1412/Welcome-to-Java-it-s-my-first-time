
public class MineSweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				if (Math.random() < 0.3)
					board[i][j] = true;

			for (int i1 = 0; i1 < 10; i1++) {
				for (int j = 0; j < 10; j++) {
					if (board[i1][j])
						System.out.print("# ");
					else
						System.out.print(". ");
				}
				System.out.println();
			}
		}
	}
}
