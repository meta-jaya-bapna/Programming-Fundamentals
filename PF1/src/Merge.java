/**
 * Class name-Merge
 *
 *@version 1.0
 *@author Jaya Bapna
 */
 
/*
 *A class to merge two sorted arrays and store in new resultant array
 */

public class Merge {
	   /* 
		* Below function merges two sorted arrays intoa new array of size equal 
		* to sum of two sorted arrays.
		* The function compares the elements of both sorted arrays and the smaller 
		* element is added to resultant array.
		* This process is repeated for all the elements of both arrays.
		* The function returns resultant array.
		*/
    int[] join(int a[], int asize, int b[], int bsize, int c[])
    {
        int counter1=0,counter2=0,counter3=0;
        while(counter1<asize&&counter2<bsize)
        {
            if(a[counter1]<b[counter2])             //Compare elements of both arrays
            {
                c[counter3]=a[counter1];
                counter3++;                        
                counter1++;
            }
            else
            {
                c[counter3]=b[counter2];
                counter3++;
                counter2++;
            }
        }
        if(counter1<asize)						  //Copys the remaining elements of first array.
        {
            while(counter1<asize)
            {
                c[counter3]=a[counter1];
                counter3++;
                counter1++;
            }    
        }
        if(counter2<bsize)						 //Copys the remaining elements of second array.
        {
            while(counter2<bsize)
            {
                c[counter3]=b[counter2];
                counter3++;
                counter2++;
            }    
        }
        return c;								//returns the resultant sorted array.    
    }

}