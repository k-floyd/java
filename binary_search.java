import java.util.Arrays;

//////////////////////////////////////////////////////////////////////
// Solution to Programming Project                                  //
// Name: Keidra Floyd                                               // 
// Lab time: Tuesday 1pm                                            // 
// Program description: binary sorting								//
//////////////////////////////////////////////////////////////////////


public class KeidraFloyd_Midterm_Binary {

	public static void main(String[] args) {

		//set the variables
		int [] array = {11, 21, 33, 40, 50};		
		int target = 21;
		
		//print the array before quick sorting
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(array));
		
		//call the binary function
		binary(array, target);

	}
	
	static int binary (int[] array, int target) {
		
		//set the variables
		int left = 0;
		int right = array.length;
		int mid = (left + right) / 2;
		
		while (left <= right) {
            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            
            //return the index or value
            if (target == 21) {
                System.out.println("\nThe target number " + target + " was found.");
                break;
            }
        }
		
        return -1;	
	}

}
