import java.util.*;
public class DayOfTheProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n>=1700 && n<=1917) {
    	   if(n%4==0) {
    		   System.out.println("12.09."+n);
    	   }
    	   else {
    		   System.out.println("13.09."+n);
    	   }
    	   
       }
       else if(n==1918) {
    	   System.out.println("26.09."+n);
       }
       else if(n>=1919 && n<=2700) {
    	   if(n%400==0) {
    	   System.out.println("12.09."+n);
    	   }
    	   else if(n%4==0 && n%100!=0) {
    		   System.out.println("12.09."+n);
    	   }
    	   else {
    	   System.out.println("13.09."+n);
    	   }
       }
	}

}
