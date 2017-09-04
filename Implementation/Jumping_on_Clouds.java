import java.util.*;
public class Jumping_on_Clouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int e=100;
       int a[]=new int[n];
       for(int i=0;i<n;i++){
    	   a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i=i+k){
    	   if(a[i]==0){
    		   e=e-1;
    	   }
    	   else{
    		   e=e-3;
    	   }
       }
       System.out.println(e);
	}

}
