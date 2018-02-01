import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BinaryToOctalTest {

	@Test
	public void test() {
		BinaryToOctal b=new BinaryToOctal();
		assertEquals(65,b.convertBinaryToOctal(110101));
	}
	@Test
	public void test1() {
		BinaryToOctal b=new BinaryToOctal();
		assertEquals(37,b.convertBinaryToOctal(111111));
	}
}
