/*
 * printing reverse number
 */
public class Array_problem6 {

	public static void main(String[] args) {
		


		
		int [] a = new int [5];
			
 		a[0]=1;
 		a[1]=2;
 		a[2]=3;
 		a[3]=4;
 		a[4]=5;
		 /*
		  * using For loop statement
		  */
		 for (int i = 0; i < a.length; i++) { 
			 
	            System.out.print(a[i] + " "); 
		}
		 System.out.print("\nReverse order:");
		 
		 for (int i = a.length -1; i>=0; i--) { 
			 
	            System.out.print(  a[i] + " "); 
		 
		 }
		 
	}
		 

	
	
	
	
}
