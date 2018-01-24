import static org.junit.Assert.*;

import org.junit.Test;


public class SubsequenceTest {
	Subsequence s=new Subsequence();

	@Test
	public void test() 
	{
		int[] input=new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] result=new int[]{1,2,4,5,6,7,8,9};
		assertArrayEquals(result, s.longestSequence(input));
	}
	@Test
	public void test1()
	{
		int[] input=new int[]{2,3,4,4,4,5,6,2,1};
		int[] result=new int[]{4,5,6};
		assertArrayEquals(result,s.longestSequence(input));
	}

}
