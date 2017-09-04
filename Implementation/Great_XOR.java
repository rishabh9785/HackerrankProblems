import java.util.*;
public class Great_XOR {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     long n=sc.nextLong();
     long a[]=new long[ (int) n];
     for(long i=0;i<n;i++){
    	 a[(int) i]=sc.nextLong();
     }
     
     for(int i=0;i<n;i++){
    	 int k=1;
         int l=0;
         int p=0;
     int m[]=new int[((int) a[i])-1];
     for(int j=0;j<a[i]-1;j++){
     while(k<a[i]){
    	
    	 m[l]=k;
    	 l++;
    	 k=k+1;
    	 }
     if((m[j]^a[i])>a[i]){
    	 p++;
     }
     else{
    	 continue;
     }
     }
     System.out.println(p);
     }
     
     }
}
