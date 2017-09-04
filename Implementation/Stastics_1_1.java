import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Stastics_1_1 {

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
		        
		        int count2 = 0;
		        int count1 = 1;
		        int pupular1 =0;
		        int popular2 =0;
		        

		        for ( i = 0; i < a.length; i++)
		        {
		                pupular1 = (int) a[(int) i];
		                count1 = 0;    //see edit

		            for (int j = (int) (i + 1); j < a.length; j++)
		            {
		                if (pupular1 == a[j]) count1++;
		            }

		            if (count1 > count2)
		            {
		                    popular2 = pupular1;
		                    count2 = count1;
		            }

		            else if(count1 == count2)
		            {
		                popular2 = Math.min(popular2, pupular1);
		            }
		        }

		        System.out.println(popular2);
		    }

		        
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		    }
		
	


