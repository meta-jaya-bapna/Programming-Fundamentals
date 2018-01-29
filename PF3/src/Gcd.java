
/**
 * Class name-Gcd
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
/* A class to find the Greatest Common Divisor of two numbers
 * using recursion.
 */
public class Gcd 
{
	/*
	* Below function finds the greatest common divisor of two
	* numbers using recursion.
	* It is assumed that two numbers are greater than zero.
	* The function works by calling the same function by remainder of
	* two numbers.
	* If remainder is zero then it is final answer.
	* Otherwise call the function again.
	*/
	int gcd(int x,int y)
    {
    if(x>0&&y>0)
    {
        if(x%y==0)
        {
            return y;				//returns final result
        }
        else
        {
           return gcd(y,x%y);
        }
    }
    else
    {
    	return -1;
    }
}
}

