/**
 * Class name-QuickSort
 * 
 * @version 1.0
 * @author Jaya Bapna
 */
/* A class to perform quick sort on given array.
 */
public class QuickSort 
{
		 /*
		  * Below function partition the array in such a way that all leftmost elements are
		  * smaller than pivot element.
		  * And all rightmost elements are greater than pivot elements.
		  */
		 /**
		  * 
		  * @param arr
		  * @param low
		  * @param high
		  * @return index
		  */
	     int partition(int arr[], int low, int high)
	     {
	        int pivot = arr[high]; 						//To store pivot element
	        int i = (low-1);
	        for (int j=low; j<high; j++)
	        {
	            if (arr[j] <= pivot)				   //If element is smaller than pivot element than swap it with element
	            	                                   //at i th index.
	            {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	        return i+1;								 //returns index of pivot element.
	     }
	     /**
	      * 
	      * @param arr
	      * @param low
	      * @param high
	      * @return
	      */
	     int[] sort(int arr[], int low, int high)
	     {
	        if (low < high)
	        {
	            int pi = partition(arr, low, high);
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	        return arr;									//returns array after sorting
	     }
}
