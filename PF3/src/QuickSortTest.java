import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSortTest {

	QuickSort q = new QuickSort();

	@Test
	public void test() 
	{
		int expected[] = new int[]{2,5,8,9,10,11,55,77};
		int input[] = new int[]{2,5,8,9,10, 77, 55, 11};
		assertArrayEquals(expected, q.sort(input,0,input.length-1));
	}

}
