
/**
 * Class name-LargestDigit
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
/* A class to find the largest digit in any number.
 */
public class LargestDigit {
	int largestdigit(int x)
	{
		/*
		* Below function finds the largest digit in given number.
		* The function works by finding the largest digit in given number by dividing the
		* number by 10 and compares the remainder obtained by dividing number by 10.
		* If new number is greater than remainder then new number is returned by function.
		* Otherwise call the same function by new number.
		*/
		int newNumber;							//to store the new number
		if(x==0)
		{
			return 0;
		}
		else
		{
			int digit=x%10;					   //to store largest digit
			newNumber=largestdigit(x/10);
			if(newNumber>digit)
			{
				return newNumber;
			}
			else
			{
				return digit;				 
			}
		}
	}
}