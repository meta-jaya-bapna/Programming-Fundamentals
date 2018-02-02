import static org.junit.Assert.*;

import org.junit.Test;


public class QueensTest {
	QueensProblem queen=new QueensProblem();
	int col=0;
	
	@Test
	public void test() {
		int size=4;
		int board[][]=new int[size][size];
		int resultantOutput[][] = new int[size][size];
		int expectedBoard[][]=new int[][]{{0,0,1,0},
				                         {1,0,0,0},
				                         {0,0,0,1},
				                         {0,1,0,0}};
		if(queen.boardSolver(board, col, size)){
			resultantOutput=board;
			assertArrayEquals(expectedBoard, resultantOutput);
	}
	}
}
