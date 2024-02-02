package pkg_sample;
import java.util.*;
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.out.println("enter 1st value");
			Scanner sc = new Scanner(System.in);
			int a= sc.nextInt();
			
			
			System.out.println("enter 2nd value");
			Scanner sc1 = new Scanner(System.in);
			int b= sc1.nextInt();
			
			
			
		        try {
		            int result = a / b;
		            System.out.println("result" +   result);
		        }
		
		        catch (ArithmeticException e) {
		            System.out.println("Exception caught:Division by zero");
		        }
		
		        finally {
		            System.out.println("In final block");
		        }
		    }
		  
	}


