import static org.junit.Assert.*;

import org.junit.Test;


public class SortingTest {
	Sorting s=new Sorting();

	@Test
	public void test() {
		int[] inputArray=new int[]{10,20,30,40};
		assertEquals(1, s.order(inputArray));
	}
	@Test
	public void test1()
	{
		int[] inputArray=new int[]{40,30,20,10};
		assertEquals(2, s.order(inputArray));
	}
	@Test
	public void test2()
	{
		int[] inputArray=new int[]{10,5,15};
		assertEquals(0 ,s.order(inputArray));
	}

}
