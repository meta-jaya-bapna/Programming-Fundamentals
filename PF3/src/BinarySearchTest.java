import static org.junit.Assert.*;

import org.junit.Test;


public class BinarySearchTest {
	BinarySearch b=new BinarySearch();

	@Test
	public void test() {
		int expected=1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, b.binarySearch(input, 77,0,input.length-1));
	}
	@Test
	public void test1() {
		int expected=-1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, b.binarySearch(input,88,0,input.length-1));
	}

}
