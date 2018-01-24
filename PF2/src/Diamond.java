/**
 * Class name-Diamond
 * 
 * @version 1.0
 * @author Jaya Bapna
 */

/* 
 * This file contains the class Diamond to print pattern
 */
/**
 * Class contains 3 methods
 * First method returns the string containing spaces
 * Second method returns the string containing numbers
 * Last method returns the string containing final pyramid
 */
public class Diamond {
	/**
	 * This function returns String of spaces
	 * @param row
	 * @param n
	 * @return str
	 */
	String spaces(int row,int n)
	{
		String str="";
		int spaces=n-row;
		for(int i=0;i<spaces;i++)
		{
			str+=" ";
		}
		return str;
	}
	/**
	 * This function returns String of numbers
	 * @param row
	 * @param n
	 * @return str
	 */
	String numbers(int row,int n)
	{
		String str="";
		int i,j;
		for(i=1;i<=row;i++)
		{
			str+=i;
		}
		for(j=row-1;j>0;j--)
		{
			str+=j;
		}
		return str;
	}
	/**
	 * This function returns final pattern
	 * @param n
	 * @return pattern
	 */
	String[] print(int n)
	{
		int i;
		String pattern[] = new String[(2*n)-1];
		for(i=0;i<n;i++)
		{
			pattern[i]=(spaces(i+1,n)+numbers(i+1,n)+spaces(i+1,n));
		}
		int k=1;
		for(int j=i;j<2*n-1;j++)
		{
			pattern[j]=(spaces(n,j+1)+numbers(n-k,n)+spaces(n,j+1));
			k++;
		}
		return pattern;													//Returns final pattern
	}
	
}
