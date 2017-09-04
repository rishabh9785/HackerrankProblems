package algorithms;
import java.util.*;
public class QuickSortPartition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     int b[]=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=sc.nextInt();
    	 b[i]=a[i];
     }
//     for(int i=n-1;i>=0;i--){
//    	 a[i]=b[n-i-1];
//    	 }
//     for(int i=0;i<n;i++){
//    	 System.out.print(a[i] + " ");
//     }
//     System.out.println();
     
     int c;
     int pivot=a[0];
     int pindex=n-1;
     for(int i=n-1;i>0;i--){
    	 if(a[i]>=pivot){
    		 int k=a[i];
    		  a[i]=a[pindex];
    		 a[pindex]=k;
    		 
    		 pindex=pindex-1;
    		 
    	 }
     }
     c=a[pindex];
	 a[pindex]=a[0];
	 a[0]=c;
     
     for(int i=0;i<n;i++){
    	 System.out.print(a[i] + " ");
    	 
     }
     
	}
}
