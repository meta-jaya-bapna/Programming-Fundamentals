/**
 * Class name-BinarySearch
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
/* A class to perform binary search on an array using recursion.
 */
public class BinarySearch {
	/*
	* Below function finds whether given number is present in array
	* or  not using recursion.
	* The function checks with the mid element of array if element is present or not.
	* If element is smaller than middle element then it calls function by changing
	* highest element index.
	* If element is greater than middle element then it calls function by changing
	* lowest element index.
	* If element is found it returns true.
	* Otherwise it returns -1.
	*/
	int binarySearch(int input[],int n,int low,int high)
	{
		int mid;
		if(high>=low)
		{
		mid=low+(high-low)/2;
		if(input[mid]==n)
		{
			return 1;
		}
		if(input[mid]<n)
		{
			return binarySearch(input,n,mid+1,high);
		}
		return binarySearch(input,n,low,mid-1);
	}
	return -1;
}
}
