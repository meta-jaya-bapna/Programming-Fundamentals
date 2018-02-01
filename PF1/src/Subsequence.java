import java.util.Arrays;

/**
 * Class name-Subsequence
 *
 *@version 1.0
 *@author Jaya Bapna
 */
 
/*
 *A class to find out the longest increasing sequence from unsorted array
 */

public class Subsequence
{
	public int[] longestSequence(int input[])
	{
	/* 
	 * Below function finds the longest increasing sequence from array.
	 * The function returns the resultant array
	 * It is assumed that if there are two longest increasing sequence than first one is
	 * considered as longest increasing sequence.
	 */
		int len=0,max=0,start=0;
		for(int i=1;i<input.length;i++)
		{
			if(input[i]>input[i-1])
			{
				len++;                                    //Increment length if the current element is greater than the previous one
			}
			else
			{
				len=0;                                    //Re-Initialize count
			}
			if(len>max)
			{
				start=i; 								 //If we have found subsequence longer than any we've found yet, update sequenceLength
				max=len;
			}
		}	
		int result[]=new int[max+1];
		for(int i=(start-max),j=0;i<=start;i++)
		{
			result[j++]=input[i];
		}
		return result;
	}
}	
