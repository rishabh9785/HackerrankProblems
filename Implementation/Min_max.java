import java.util.*;
public class Min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner in = new Scanner(System.in);
		        long i=0;
		        long a[]=new long[5];
		        for(i=0;i<5;i++){
		            a[(int) i]=in.nextLong();
		            }
		        Arrays.sort(a);
		        long min_sum=0;
		        for(i=0;i<4;i++){
		            min_sum=min_sum+a[(int) i];
		        }
		        long max_sum=0;
		        for(i=1;i<5;i++){
		            max_sum=max_sum+a[(int) i];
		        }
		        System.out.println(min_sum+" "+max_sum);
		    }
		}

	


