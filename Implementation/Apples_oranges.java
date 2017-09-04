import java.util.*;
public class Apples_oranges {
     public static void main(String args[]){
      Scanner in =new Scanner(System.in);
      int s,t,a,b,d,m,n;
          s=in.nextInt();
    	  t=in.nextInt();
    	  a=in.nextInt();
    	  b=in.nextInt();
    	  m=in.nextInt();
    	  n=in.nextInt();
    	  int d_m[]=new int[m];
    	  for(int i=0;i<m;i++){
    		  d_m[i]=in.nextInt();
    	  }
    	  int d_n[]=new int[n];
    	  for(int i=0;i<n;i++){
    		  d_n[i]=in.nextInt();
    	  }
    	  int dvalid_m=0,dvalid_n=0,v=0,k=0;
    	  for(int i=0;i<m;i++){
    		  dvalid_m=a+d_m[i];
    		  if(dvalid_m >=s && dvalid_m<=t){
    			  v=v+1;
    		  }
    		  dvalid_m=0;
    	  }
    	  for(int i=0;i<n;i++){
    		  dvalid_n=b+d_n[i];
    		  if(dvalid_n>=s && dvalid_n<=t){
    			  k=k+1;
    		  }
    		  dvalid_n=0;
    	  }
    	  System.out.println(v+" "+k);
     }
}
