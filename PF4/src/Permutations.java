 import java.util.ArrayList;
 /**
  * Class name-Permutations
  * 
  * @version 1.0
  * @author Jaya Bapna
  */

public class Permutations {
	ArrayList<String> permutate = new ArrayList<String>();               //List to store all permutations of string.
	/**
	 * Below function swaps characters at position
	 * @param x
	 * @param i
	 * @param j
	 * @return swapped string.
	 */
	public String swap(String x, int i, int j){
		char temp;
		char [] charArray = x.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	/**
	 * Below function returns all the permutations of the string using backtracking.
	 * Assuming each character is unique.
	 * @param str
	 * @param start
	 * @param end
	 * @return all permutations of string 
	 */
	public ArrayList<String> generatePermutations(String str, int start, int end){
		
		if(start == end){									//Checks if starting and ending index are same. If the are equal
															//then no characters to be permuted.
			permutate.add(str);
		}
		else{
			for(int i = start; i <= end; i++){
				str = swap(str,start,i);
				generatePermutations(str, start+1, end);
				str = swap(str,start,i);					
			}
		}
		return permutate;
	}

}
