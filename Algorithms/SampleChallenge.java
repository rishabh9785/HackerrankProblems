package algorithms;
import java.util.*;
public class SampleChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int flag=0;
       int s=sc.nextInt();
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
    	   a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
    	   if(a[i]==s){
    		   System.out.println(i);
    		   flag=1;
    	   }
    	   if(flag==1){
    		break;   
    	   }
    	   
       }
	}

}
