import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PermutationTest {

	Permutations p = new Permutations();
	@Test
	public void test1() {
		String inputString = "ABC";
		ArrayList<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("ABC");
		expectedOutput.add("ACB");
		expectedOutput.add("BAC");
		expectedOutput.add("BCA");
		expectedOutput.add("CBA");
		expectedOutput.add("CAB");
		
		ArrayList<String> resultantOutput = p.generatePermutations(inputString, 0, 2);
		assertEquals(expectedOutput,resultantOutput);
	}
	@Test
	public void test2() {
		String inputString = "ABCD";
		ArrayList<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("ABCD");
		expectedOutput.add("ABDC");
		expectedOutput.add("ACBD");
		expectedOutput.add("ACDB");
		expectedOutput.add("ADCB");
		expectedOutput.add("ADBC");
		
		expectedOutput.add("BACD");
		expectedOutput.add("BADC");
		expectedOutput.add("BCAD");
		expectedOutput.add("BCDA");
		expectedOutput.add("BDCA");
		expectedOutput.add("BDAC");
		
		expectedOutput.add("CBAD");
		expectedOutput.add("CBDA");
		expectedOutput.add("CABD");
		expectedOutput.add("CADB");
		expectedOutput.add("CDAB");
		expectedOutput.add("CDBA");
		
		expectedOutput.add("DBCA");
		expectedOutput.add("DBAC");
		expectedOutput.add("DCBA");
		expectedOutput.add("DCAB");
		expectedOutput.add("DACB");
		expectedOutput.add("DABC");
		
		ArrayList<String> resultantOutput = p.generatePermutations(inputString, 0, 3);
		assertEquals(expectedOutput,resultantOutput);
	}
}
