import static org.junit.Assert.*;

import org.junit.Test;


public class LinearSearchTest {
	Linearsearch l=new Linearsearch();

	@Test
	public void test() {
		int expected=1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, l.linearSearch(input, 77,0));
	}
	@Test
	public void test1() {
		int expected=-1;
		int input[]=new int[]{2,5,8,9,10,77,55,11};
		assertEquals(expected, l.linearSearch(input,88,0));
	}


}
