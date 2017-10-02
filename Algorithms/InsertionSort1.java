package algorithms;
import java.util.*;
public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
    	   a[i]=sc.nextInt();
       }
       for(int i=n-1;i>=0;i--){
    	   int hole=i;
    	   int value=a[hole];
    	   while(hole>0 && a[hole-1] > value){
    		   a[hole]=a[hole-1];
    		   hole=hole-1;
    		   for(int j=0;j<n;j++){
        		   System.out.print(a[j]+" ");
        	   }
    		   System.out.println();
    	   }
    		   a[hole]=value;
    	   }
    	   for(int i=0;i<n;i++){
    		   System.out.print(a[i]+" ");
    	   }
       }
	}


