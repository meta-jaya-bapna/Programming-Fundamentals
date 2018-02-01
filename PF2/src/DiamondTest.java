import static org.junit.Assert.*;

import org.junit.Test;


public class DiamondTest {
	Diamond d=new Diamond();

	@Test
	public void test() 
	{
		String expected[]={        "   1   ",
								   "  121  ",
								   " 12321 ",
								   "1234321",
								   " 12321 ",
								   "  121  ",
								   "   1   "};
		String actual[]=d.print(4);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void test1()
	{
		String expected="  ";
		String actual=d.spaces(3,5);
		assertEquals(expected, actual);
	}
	@Test
	public void test2()
	{
		String expected="1234321";
		String actual=d.numbers(4,5);
		assertEquals(expected, actual);
	}
}