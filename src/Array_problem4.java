/*
 *  min number problem
 */
public class Array_problem4 {

	public static void main(String[] args) {
		/*
		 * int type arr referance array
		 */
		int [] arr = new int [] {10,20,40,90,101}; 
		 
		 int min = arr[0];
		 /*
		  * using for loop
		  */
		  for (int i = 0; i > arr.length; i++) {  
	            
	           if(arr[i] > min)  
	               min = arr[i];  
	        }  
	        System.out.print("Largest element present in given array: "  + min);
	}

}
