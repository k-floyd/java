import java.util.Arrays;

//////////////////////////////////////////////////////////////////////
// Solution to Programming Project                                  //
// Name: Keidra Floyd                                               // 
// Lab time: Tuesday 1pm                                            // 
// Program description: quicksort the array 						//
//////////////////////////////////////////////////////////////////////


public class KeidraFloyd_Midterm_Quicksort {

	public static void main(String[] args) {
		
		//set the values in the array
		int [] array = {50, 11, 33, 21, 40, 50, 40, 40, 21};	
		
		//print the array before quick sorting
		System.out.println("Before sorting: ");
		System.out.println("ARRAY[] = " + Arrays.toString(array));
		
		//call the quick function
		quicksort(array);
		
		//print the array after quick sorting
		System.out.println("\nAfter sorting: ");
		System.out.println("ARRAY[] = " + Arrays.toString(array));

	}
	
	static void quicksort(int[] array) {
    	
    	//call the quick method
        quick(array, 0, array.length - 1);
        
    }

    static void quick(int[] array, int left, int right) {
    	
    	//if the array only has one element its already sorted
        if (left >= right) {
            return;
        }
        
        //partition for the array between l and r
        int p = partition(array, left, right);
        
        //partition through the numbers less than the pivot
        quick(array, left, p - 1);
        
        //partition through the numbers greater than the pivot
        quick(array, p + 1, right);
        
    }

    static int partition(int[] array, int left, int right) {
    	
    	//set the pivot as the last index in the array
        int target = array[right];
        
        //last number out of the numbers less than the pivot
        int i = left - 1;
        
        //j is the current number we're looking at
        //j moves from beginning of the array to the number before the pivot
        for (int j = left; j < right; j++) {
            if (array[j] < target) {
                i += 1;
                
                //swap i and j so all the values up to i are less than the pivot
                //and and the values between i and j are greater than the pivot
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        //put the pivot in the middle of the array
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        return i + 1; //index of the pivot    
        
    }

}
