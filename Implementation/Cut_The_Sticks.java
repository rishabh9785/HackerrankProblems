import java.util.*;
public class Cut_The_Sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=sc.nextInt();
     }
     Arrays.sort(a);
     int p=0;
     for(int i=0;i<n;i++){
    	  int k=a[i];
    	  int l=i;
    	  int count=0;
    	  while(l<n){
    		  if(k!=0){
    			  a[l]=a[l]-k;
    			  count++;
    		  }
    	  l++;
    	  }
    	  if(count!=0){
    	  System.out.println(count);
    	  }
     }
	}

}
