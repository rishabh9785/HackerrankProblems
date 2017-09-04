import java.util.*;
public class AliceRanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int ranking[]=new int[n];
      int rank=0;
      for(int i=0;i<n;i++) {
    	  a[i]=sc.nextInt();
      }
      ranking[0]=1;
      for(int j=1;j<n;j++) {
    	  if(a[j-1]==a[j]) {
    		  ranking[j]=ranking[j-1];
    	  }
    	  else {
    		  ranking[j]=ranking[j-1]+1;
    	  }
      }
//      for(int j=0;j<n;j++) {
//      System.out.print(ranking[j]+" ");
//      }
      int k=sc.nextInt();
      int b[]=new int[k];
      int aliceRanking[]=new int[k];
      for(int j=0;j<k;j++) {
    	  b[j]=sc.nextInt();
      }
      int count=n-1;
      for(int j=0;j<k;j++) {
    	  for(int p=count;p>=0;p--) {
    		  if(b[j]>a[0]) {
    			  aliceRanking[j]=1;
    			  break;
    		  }
    		  else if(b[j]>a[p]) {
    			  continue;
    		  }
    		  else if(b[j]==a[p]) {
    			  aliceRanking[j]=ranking[p];
    			  count=p;
    			  break;
    		  }
    		  else if(b[j]<a[p]) {
    			  aliceRanking[j]=ranking[p]+1;
    			  count=p;
    			  break;
    		  }
    		  
    	  }
      }
      for(int i=0;i<k;i++) {
      System.out.print(aliceRanking[i]+ " ");
      }
	}

}
