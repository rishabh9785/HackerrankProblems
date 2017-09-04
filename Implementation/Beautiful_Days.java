import java.util.*;
import java.lang.Math.*;
public class Beautiful_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int l=sc.nextInt();
    int a[]=new int[(n-m+1)];
    int temp1=m;
    for(int i=0;i<n-m+1;i++){
    	a[i]= temp1;
    	temp1++;
    }
    int b[]=new int[n-m+1];
    int temp=0;
    for(int i=0;i<n-m+1;i++)
    {		temp=a[i];
    	 while (temp != 0)
    	    {
    	        b[i] = b[i] * 10 + temp % 10;
    	        temp = temp / 10;
    	    }
    }
    
   long k=0,count=0;
    for(int i=0;i<n-m+1;i++){
    	k=((Math.abs(a[i]-b[i]))%l);
    	if(k==0){
    		count++;
    	}
    	
	}
System.out.println(count);
}
}