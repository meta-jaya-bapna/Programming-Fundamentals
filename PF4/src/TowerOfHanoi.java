
import java.util.ArrayList;
/**
 * Class name-TowerOfHanoi
 * 
 * @version 1.0
 * @author Jaya Bapna
 */

public class TowerOfHanoi 
{
	ArrayList<String> discs = new ArrayList<String>();													      
	/**
	 * Below function uses three rods with n discs placed over the other.
     * First one is source tower from which discs to be moved.
     * Second is destination tower where discs to be moved.
     * Last is Auxiliary tower which is used for remaining discs.
     * Only 1 Disc can be moved at a time.
     * No disc can be placed on top of smaller disc.
	 * @param source
	 * @param destination
	 * @param auxiliary
	 * @param numOfDisk
	 * @return discs
	 */
	public ArrayList<String> towerOfHanoi(String source, String destination, String auxiliary, int numOfDisk)
	{
		if(numOfDisk==1)     				//If number of Discs is 1, move it from source to destination.
		{
			String str="Move Disk "+ numOfDisk + " from " + source + " to " + destination;
			discs.add(str);
			return discs;
		}
		towerOfHanoi(source,auxiliary, destination, numOfDisk-1);		 //Move n-1 top discs to auxiliary rod.
		String str="Move Disk "+ numOfDisk + " from " + source + " to " + destination;
		discs.add(str);
		return towerOfHanoi(auxiliary, destination,source, numOfDisk-1); //Move n-1 top discs to destination rod.
	}
}
