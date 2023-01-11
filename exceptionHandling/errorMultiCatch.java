package exceptionHandling;

public class errorMultiCatch {
	
	 public static void main(String args[]){    
		 
		   try {  
			   
			   int a[] = new int[5]; 
			   
			   a[5] = 30/0;
			       
		   }  
		   
		   catch(Exception e) {
			   
			   System.out.println("line");
		   }
		   
		   catch(ArithmeticException e) {
			   
			   System.out.println("line 1");
		   }
		   
		   catch(ArrayIndexOutOfBoundsException e) {
			   
			   System.out.println("line 2");
		   }
		   
		   System.out.println("- - - - - - - -");    
	 }  
	 
}