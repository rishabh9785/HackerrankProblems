import java.util.*;
public class Statistics_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int x[]=new int[n];
       int w[]=new int[n];
       for(int i=0;i<n;i++){
    	   x[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
    	   w[i]=sc.nextInt();
       }
       double m=0;
       double k=0;
	  for(int i=0;i<n;i++){
		  m=m+(x[i]*w[i]);
		  k=k+w[i];
	  }
	  double answer=m/k;
	 System.out.printf("%.1f", answer);
	}

}
