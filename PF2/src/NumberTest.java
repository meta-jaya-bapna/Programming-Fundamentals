
import static org.junit.Assert.*;

import org.junit.Test;


public class NumberTest {
	NumberPattern n=new NumberPattern();
	@Test
	public void test() {
		String expected[]={"12345",
				           " 1234",
				           "  123",
				           "   12",
				           "    1"};
				String actual[]=n.print(5);
				assertArrayEquals(expected, actual);
		
	}
	@Test
	public void test1()
	{
		String expected="  ";
		String actual=n.spaces(3,5);
		assertEquals(expected, actual);
	}
	@Test
	public void test2()
	{
		String expected="12";
		String actual=n.numbers(2,5);
		assertEquals(expected, actual);
	}

}
