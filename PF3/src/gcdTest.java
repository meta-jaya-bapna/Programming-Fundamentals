import static org.junit.Assert.*;

import org.junit.Test;


public class gcdTest {
	Gcd g=new Gcd();
	@Test
	public void test() 
	{
		int expected=6;
		assertEquals(expected, g.gcd(12, 18));
	}
	@Test
	public void test1() 
	{
		int expected=1;
		assertEquals(expected, g.gcd(2, 1));
	}
	@Test
	public void test2() 
	{
		int expected=1;
		assertEquals(expected, g.gcd(100, 3));
	}
}
