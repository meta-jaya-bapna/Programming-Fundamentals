import static org.junit.Assert.*;

import org.junit.Test;


public class MergeTest {

	@Test
	public void test() {
		Merge m=new Merge();
		int a[]=new int[]{2,4,6,7};
		int b[]=new int[]{3,5,8,9,11};
		int asize=a.length;
		int bsize=b.length;
		int c[]=new int[asize+bsize];
		int[] mergedSort=new int[]{2,3,4,5,6,7,8,9,11};
		assertArrayEquals(mergedSort, m.join(a,asize,b,bsize,c));
	}
}
