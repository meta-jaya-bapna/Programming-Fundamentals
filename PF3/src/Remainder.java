/**
 * Class name-Remainder
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
/* A class to find the remainder when one number is
 * divided by other number using recursion.
 */
public class Remainder {
	/*
	* Below function finds the remainder when one number is divided by other
	* number using recursion.
	* It is assumed that two numbers are greater than zero.
	* The function works by subtracting the two numbers.
	* If remainder is less than second number than it is final answer.
	* Otherwise call the function again.
	*/
	    int rem(int x,int y)
	    {
	    	int r=0;						//To store final result.
	    	if(y==0)
	    	{
	    		return x;
	    	}
	    	else
	    	{
	    		r=x-y;
	    		if(r<y)
	    		{
	    			return r;			   //returns final result.
	    		}
	    		else
	    		{
	    			return rem(r,y);	  //Calls function 
	    		}
	    	}
	    }	
}

