
	
	 class OddNums_Recursion {
		 
         int binarySearch(int arr[], int x)  {
      
             int l = 0, r = arr.length - 1;
      
             // Checking element in whole array
             while (l <= r) {
                 int m = l + (r - l) / 2;
      
                 // Check if x is present at mid
                 if (arr[m] == x)
                     return m;
      
                 // If x greater, ignore left half
                 if (arr[m] < x)
                     l = m + 1;
      
                 // If x is smaller, element is on left side so ignore right half
                 else
                     r = m - 1;
             }
      
             // If we reach here, element is not present
             return -1;
         }
     


	public static void main(String[] args) {
		
		//set the values in the array
		int[] array = {7,9,11,15,17,1,3};
		
		OddNums_Recursion obj = new OddNums_Recursion();
        //length of the array
        int n = array.length;
        //check if this element is present or not
        int x = 17;
        
        int result = obj.binarySearch(array, x);
        
        // Element present
        if (result == -1)
 
            // Print statement
            System.out.println("Element not present");
 
        // Element not present
        else
 
            // Print statement
            System.out.println("Element found at index "
                               + result);

	}

}
