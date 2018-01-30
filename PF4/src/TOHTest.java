import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TOHTest {
	TowerOfHanoi tower=new TowerOfHanoi();
	

	@Test
	public void test() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B");
		assertEquals(expected, tower.towerOfHanoi("A", "B", "C", 1));
	}
	@Test
	public void test1() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to C"); 
		expected.add("Move Disk 2 from A to B");
	    expected.add("Move Disk 1 from C to B");
		assertEquals(expected, tower.towerOfHanoi("A", "B", "C", 2));
	}
	@Test
	public void test2() {
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Move Disk 1 from A to B"); 
		expected.add("Move Disk 2 from A to C"); 
		expected.add("Move Disk 1 from B to C");
		expected.add("Move Disk 3 from A to B");
		expected.add("Move Disk 1 from C to A"); 
		expected.add("Move Disk 2 from C to B");
		expected.add("Move Disk 1 from A to B");
		assertEquals(expected, tower.towerOfHanoi("A", "B", "C", 3));
	}

}
