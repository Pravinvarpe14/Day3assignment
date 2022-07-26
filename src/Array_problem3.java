/*
 * largest value element
 */
public class Array_problem3 {

	public static void main(String[] args) {
		/*
		 * int type arr referance array
		 */
		int [] arr = new int [] {10,20,40,90,101}; 
		 
		 int max = arr[0];
		 /*
		  * using for loop
		  */
		  for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);

	}
	}

