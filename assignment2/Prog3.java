package test2;

public class Main { //Q.3
	static int board[] = new int[30];
	public static void main(String[] args) {
		for(int i = 0 ; i < board.length ; i++)
			board[i] = i;
		//ladder
		board[3] = 22;
		board[5] = 8;
		board[11] = 26;
		board[20] = 29;
		elements(); //elements in board
		shortPath(board); //shortest path
		shortPathSnake(board); //shortest path bitten by snake once
	}
	public static void elements() {
		System.out.println("Size of board : "+board.length+"\nLadders : "+4+"\nSnakes : "+4);
	}
	public static void shortPath(int[] board) {
		int count = 0, i = 0;
		while(i < board.length-1) {
			int max = 0;
			for(int j = i+1 ; j <= (i+6) && j < board.length ; j++)	{
				if(board[j] > max)
					max = board[j];
			}
			count++;
			i = max;
		}
		System.out.println("shortest path : "+count);
	}
	public static void shortPathSnake(int[] board) {
		int count = 0, counter = 0, i = 0;
		while(i < board.length-1) {
			int max = 0;
			for(int j = i+1 ; j <= (i+6) && j < board.length ; j++)	{
				if(board[j] > max)
					max = board[j];
				if(counter == 0 && (j == 17 || j == 21 || j == 19 || j == 27)) {
					//snake
					board[17] = 4;
					board[21] = 9;
					board[19] = 7;
					board[27] = 1;
					max = board[j];
				    counter++;	
				    break;
				}
			}
			count++;
			i = max;
		}
		System.out.println("shortest path : "+count);
	}
}