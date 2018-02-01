/**
 * Class name-DuplicateElements
 *
 *@version 1.0
 *@author Jaya Bapna
 */
 
/*
 *A class to remove duplicate elements from an array.
 */
public class DuplicateElements {
	 /* 
	 * Below function remove duplicate elements from array.
	 * The function returns the new array of modified size.
	 * The function compare each element with remaining elements.
	 * If same element exists in array then elements are left shifted.
	 */
     int[] removeDuplicate(int array[])
     {
        int counter1,counter2,counter3,size,output[] = null;           //Output array to store unique elements
        size=array.length;											   //To store size of array.
        if(size==0||size==1)
        {
        	return array;
        }
        for(counter1=0;counter1<size;counter1++)
        {
            for(counter2=counter1+1;counter2<size;counter2++)
            {
                if(array[counter1]==array[counter2])
                {
                    for(counter3=counter2;counter3<size-1;counter3++)
                    {
                        array[counter3]=array[counter3+1];
                    }
                    counter2--;
                    size--;
                    output=new int[size];
                    System.arraycopy(array, 0, output, 0, size);
                }
            }
        }
        return output;												  //returns array of unique elements
     }
}


