import static org.junit.Assert.*;

import org.junit.Test;


public class DuplicateTest {

	@Test
	public void test() {
		DuplicateElements d=new DuplicateElements();
		int[] array=new int[]{2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int[] newArray=new int[]{2,5,4,6,3,8,9,0};
		assertArrayEquals(newArray,d.removeDuplicate(array));
	}
	@Test
	public void test1() {
		DuplicateElements d=new DuplicateElements();
		int[] array=new int[]{4,4,4,4};
		int[] newArray=new int[]{4};
		assertArrayEquals(newArray,d.removeDuplicate(array));
	}

}
