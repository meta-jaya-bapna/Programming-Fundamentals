/**
 * Class name-Sorting
 *
 *@version 1.0
 *@author Jaya Bapna
 */
 
/*
 *A class to find whether given array is sorted or not
 */
public class Sorting {
	/* 
	 * Below function merges finds whether the given array is sorted or not.
	 * If array is not sorted the function returns zero.
	 * If array is sorted now it will find out the order in which array is sorted.
	 * If array is sorted in ascending order it will return 1 
	 * otherwise it will return 2.
	 */
    int order(int input[])
    {
        int counter1,result,size=input.length;             //To store lengthof array
        for(counter1=1;counter1<size;counter1++)           //Checks if array is in descending order
        {
            if(input[counter1]<input[counter1-1])           
                break;
        }
        if(counter1<size)
        {
            for(counter1=1;counter1<size;counter1++)
            {
                if(input[counter1]>input[counter1-1])     //Checks if array is in ascending order
                    break;
            }
            if(counter1<size)
            {
                result=0;								 //returns zero for unsorted array
                return result;
            }
            else
            {
                result=2;                                //returns two for array in ascending order
                return result;
            }
        }
        else
        {
            result=1;									//returns one for array in descending order
            return result;
        }
        
    }

}
