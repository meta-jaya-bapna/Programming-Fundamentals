/**
 * Class name-LinearSearch
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
/* A class to perform linear search on an array using recursion.
 */
public class Linearsearch {
	/*
	* Below function finds whether given number is present in array
	* or  not using recursion.
	* The function checks with the zeroth element of array till last element.
	* If element is found it returns true.
	* Otherwise it returns -1.
	*/
	int linearSearch(int array[],int n,int loc)     	
	{
		if(loc>=array.length)
		{
			return -1;
		}
		if(array[loc]==n)
		{
			return 1;								//returns 1 if element is found.
		}
			return linearSearch(array,n,loc+1);	   //calls the function
	}
}

