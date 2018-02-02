/**
 * Class name-QueensProblem
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
public class QueensProblem {
	/**
	 * Below function returns the final board after placing queens on the board.
	 * @param board
	 * @return board
	 */
	public int[][] printBoard(int board[][]){
		return board;
	}
	/**
	 * Below function checks if a queen can be placed on board or not.
	 * This function checks only left side of attacking queen.
	 * @param board
	 * @param row
	 * @param col
	 * @param size
	 * @return true if queen can be placed on board and false otherwise.
	 */
	public boolean placeOrNot(int board[][], int row, int col,int size){
		int i,j;
		for(i=0;i<col;i++)							//Checks same row in left side.
		{
			if(board[row][i]==1)
				return false;
		}
		for(i=row,j=col;i>=0&&j>=0;i--,j--)		    //Checks top left diagonal in left side.
		{
			if(board[i][j]==1)
				return false;
		}
		for(i=row,j=col;i<size&&j>=0;i++,j--)	   //Checks bottom left diagonal in left side.
		{
			if(board[i][j]==1)
				return false;
		}
		return true;
	}
	/**
	 * This function solves N Queen problem using Backtracking.
	 * @param board
	 * @param col
	 * @param size
	 * @return false if queens can not be placed otherwise returns true.
	 */
	public boolean boardSolver(int board[][],int col,int size){
		if(col>=size)									//If all queens are placed returns true.
			return true;
		for(int i=0;i<size;i++)						   //Try all rows in the same column to place the queen.
		{
			if(placeOrNot(board, i, col, size)){
				board[i][col]=1;
				if(boardSolver(board, col+1, size))
					return true;
			}
		}
		return false;
	}
}
