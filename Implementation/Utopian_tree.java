import java.util.*;
public class Utopian_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
    	   a[i]=sc.nextInt();
       }
       
       int m=0;
       for(int i=0;i<n;i++){
    	   int l=1;
    	   if(a[i]%2==0){
    		   for(int j=0;j<(a[i]/2);j++){
    			   l=l*2;
    			   l=l+1;
    		   }
    		   System.out.println(l);
    	   }
    	   else{
    		   m=a[i]-1;
    		   for(int v=0;v<(m/2);v++){
    			   l=l*2;
    			   l=l+1;
    		   }
    		   l=l*2;
    		   System.out.println(l);
    	   }
    	   
       }
	}

}
