import java.util.Arrays;

//time complexity: O(n log n)
//space complexity: 
//merge sort - divide and conquer - continue to split the array in half

public class MergeSort {
	
	public static void main(String[] args) {
    
		//set the array
		int[] numbers = {50, 11, 33, 21, 40, 50, 40, 40, 21};
	
	    //print the array as is before sorting
		System.out.println("Before:");
	    System.out.println(Arrays.toString(numbers));
	    
	    //call the mergeSort method
	    mergeSort(numbers); 
	
	    //print the sorted array
	    System.out.println("\nAfter:");
	    System.out.println(Arrays.toString(numbers));
    
	}
	
	
	private static void mergeSort(int[] array) {
	  
		//set a variable for the length of the full/ array  
	    int arrLength = array.length;
	    
	    //if the array is empty or only has 1 element, its already sorted
	    if (arrLength < 2) {
	      return;
	    }
	    
	    int mid = arrLength / 2;
	    
	    //create new arrays with the half the length of the original array
	    int[] leftHalf = new int[mid];
	    int[] rightHalf = new int[arrLength - mid]; //set this way for arrays with odd numbers
	    
	    //put the elements from the left half of the original array into the leftHalf array
	    for (int i = 0; i < mid; i++) {
	      leftHalf[i] = array[i];
	    }
	    
	    //put the elements from the right half of the original array into the righttHalf array
	    for (int i = mid; i < arrLength; i++) {
	      rightHalf[i - mid] = array[i];
	    }
	    
	    //sort the two halves
	    mergeSort(leftHalf);
	    mergeSort(rightHalf);
	    
	    //merge both arrays together
	    merge(array, leftHalf, rightHalf);
    
	}
	
	
	private static void merge (int[] array, int[] leftHalf, int[] rightHalf) {
		
		//set a variable for the length of the left and right arrays
		int leftLength = leftHalf.length;
		int rightLength = rightHalf.length;

		//i is for the left array, j is for the right array, k is for the merged array
		int i = 0;
		int j = 0;
		int k = 0;

		//loop until you run out of elements on the left or right array
		while (i < leftLength && j < rightLength) {
		
			//compare the element in the left half with the element in the right 
			//half and put the smaller number in the merged array
				if (leftHalf[i] <= rightHalf[j]) {
					array[k] = leftHalf[i];
					i++;
				}
				else {
					array[k] = rightHalf[j];
					j++;
				}
				k++;
		}

		//loop through the leftover elements in the left half and add to the merged array
		while (i < leftLength) {
			array[k] = leftHalf[i];
			i++;
			k++;
		}

		//loop through the leftover elements in the right half and add to the merged array
		while (j < rightLength) {
			array[k] = rightHalf[j];
			j++;
			k++;
		}

	}
	
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
}
