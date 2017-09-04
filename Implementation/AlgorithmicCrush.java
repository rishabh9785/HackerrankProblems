import java.util.*;
public class AlgorithmicCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     long a[]=new long[m];
     long b[]=new long[m];
     long k[]=new long[m];
     long l[]=new long[m];
     long c[]=new long[n];
     for(int i=0;i<m;i++) {
    	 a[i]=sc.nextInt();
    	 b[i]=sc.nextInt();
    	 k[i]=sc.nextInt();
    }
//     for(int i=0;i<m;i++) {
//     System.out.println(a[i]);
//     System.out.println(b[i]);
//     System.out.println(k[i]);
//     }
     for(int i=0;i<n;i++) {
    	 c[i]=0;
     }
     for(int i=0;i<m;i++) {
    	 l[i]=b[i]-a[i];
     }
     for(int i=0;i<m;i++) {
      if(l[i]==1) {
    	  c[(int) (a[i]-1)]=c[(int) (a[i]-1)]+k[i];
    	  c[(int) (b[i]-1)]=c[(int) (b[i]-1)]+k[i];
    	  
    	  }
      else {
    	 
    	  int d=(int) b[i];
    	  for(int p=(int) a[i];p<=d;p++) {
    		  c[p-1]=c[p-1]+k[i];
    	  }
    	  
      }
     }
//      for(int j=0;j<n;j++) {
//     	 System.out.println(c[j]);    	 
//     	 }
//      System.out.println();
//     }
    Arrays.sort(c);
    
     System.out.println(c[n-1]);
     
	}

}


