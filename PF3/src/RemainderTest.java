   import static org.junit.Assert.*;

import org.junit.Test;


public class RemainderTest {
	Remainder r=new Remainder();

	@Test
	public void test() 
	{
		int expected=1;
		assertEquals(expected, r.rem(100,3));
	}
	@Test
	public void test1() 
	{
		int expected=0;
		assertEquals(expected, r.rem(2,1));
	}
	@Test
	public void test2() 
	{
		int expected=2;
		assertEquals(expected, r.rem(2,0));
	}

}
