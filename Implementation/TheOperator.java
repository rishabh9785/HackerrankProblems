        import java.io.*;
		import java.util.*;
		import java.text.*;
		import java.math.*;
		import java.util.regex.*;
  public class TheOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		    
		        Scanner scan = new Scanner(System.in);
		        double mealCost = scan.nextDouble(); // original meal price
		        int tipPercent = scan.nextInt(); // tip percentage
		        int taxPercent = scan.nextInt(); // tax percentage
		        scan.close();
		      
		        // Write your calculation code here.
		       double tip=mealCost*((double)tipPercent/100);
		       double tax=mealCost*((double)taxPercent/100);
		       double total=(double)mealCost+(double)tip+(double)tax;
		        // cast the result of the rounding operation to an int and save it as totalCost 
		        int totalCost = (int) Math.round(total);
		      System.out.println(totalCost);
		        // Print your result
		    }
		
	}


