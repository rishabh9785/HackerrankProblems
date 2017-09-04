		import java.io.*;
		import java.util.*;
		import java.text.*;
		import java.math.*;
		import java.util.regex.*;
public class Statistics_1 {

	public static void main(String[] args) {
	
		        Scanner sc=new Scanner(System.in);
		        long n=sc.nextInt();
		        long a[]=new long[(int) n];
		        long i;
		        long m=0;
		        for(i=0;i<n;i++){
		        a[(int) i]=sc.nextInt();   
		        m=m+a[(int) i];
		        }
		        float mean=(float)m/n;
		        System.out.println(mean);
		        float median=0;
		        Arrays.sort(a);
		        if(n%2==0){
		          median =(float)(a[(int) ((n/2)-1)]+a[(int) (n/2)])/2;
		          System.out.println(median);
		        }
		        else{
		        	median=a[(int) ((n/2)+1)];
		        	System.out.println(median);
		        }
		        int l[]=new int[(int)n];
		        for(int k=0;k<n;i++){
		        	for(int j=k+1;j<n;j++){
		        		if(a[k]==a[j]){
		        			l[k]=l[k]+1;
		        		}
		        		else{
		        			continue;
		        		}
		        	}
		        }
		        Arrays.sort(l);
		        
		        System.out.println();
		        
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		    }
		
	}


