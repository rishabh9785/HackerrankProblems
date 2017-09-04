import java.lang.Math.*;
import java.util.*;
public class Find_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
    	   a[i]=sc.nextInt();
       }
       
       for(int i=0;i<n;i++){
    	  int m=0;
          int temp=a[i];
    	  while(temp!=0){
    	    temp=temp/10;
    	     m++;
       }
    	  int temp2=a[i];
    	  int temp1[]=new int[m];
    	  int l = 0,k=0;
    	   while ( temp2!= 0) {
    	   temp1[l] = temp2%10;
    	   temp2 /= 10;
    	     l++;
    	   }
    	   for(int j=0;j<l;j++){
    		   try{
    		   if(a[i]%temp1[j]==0){
    			   k++;
    		   } 
    		   }
    		   catch(ArithmeticException e){
    			   continue;
    		   }
    	   }
    	   System.out.println(k);
	}

}
}
