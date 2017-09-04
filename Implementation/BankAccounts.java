import java.util.*;

public class BankAccounts {
 static double max(double m,double v) {
	 double maxNumber=0;
	 if(m>v) {
		 maxNumber=m;
	 }
	 else if(m<v) {
		 maxNumber=v;
	 }
	 else if(m==v) {
		 maxNumber=m;
	 }
	 return maxNumber;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      
        for(int i=0;i<t;i++) {
        	double cmpNumber=0;
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int x=sc.nextInt();
        	int d=sc.nextInt();
        	int a[]=new int[n];
         for(int j=0;j<n;j++) {
              a[j]=sc.nextInt();   	 
         }	
         for(int l=0;l<n;l++) {
        	 cmpNumber=cmpNumber+max((double)k,((double)x*(double)a[l]/100));
         }
         if(cmpNumber<=d) {
        	 System.out.println("fee");
         }
         else {
        	 System.out.println("upfront");
         }
        }
	}

}
 