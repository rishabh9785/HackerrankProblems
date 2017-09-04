package algorithms;

import java.util.Scanner;

public class RunningTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		   int u=0,l=0,p=0;
	       int n=sc.nextInt();
	       int a[]=new int[n];
	       for(int i=0;i<n;i++){
	    	   a[i]=sc.nextInt();
	       }
			for(int j=1;j<n;j++){
		    	   int hole=j;
		    	   int value=a[hole];
		       while(hole>0 && a[hole-1]>value){
		    	   a[hole]=a[hole-1];
		    	   hole=hole-1;
		    	   u++;
		       }
		       a[hole]=value;
//		       for(int i=0;i<n;i++){
//		    	   System.out.print(a[i]+" ");
//		       }
//		       System.out.println();
		       }
			System.out.println(u);
//		   for(int i=n-1;i>=0;i--){
//	 	   int hole1=i;
//	 	   int value1=a[hole1];
//	 	   while(hole1>0 && a[hole1-1] > value1){
//	 		   a[hole1]=a[hole1-1];
//	 		   hole1=hole1-1; 
//	 		   
//	 	   }
//	 	       System.out.println(l);
//	 		   a[hole1]=value1;
//	 	   }
//	 	   for(int i=0;i<n;i++){
//	 		   System.out.print(a[i]+" ");
//	 	   }
	 	   
	 	   
	     }
	}

