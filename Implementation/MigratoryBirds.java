import java.util.*;
public class MigratoryBirds {
static int migratoryBirds(int n,int[] ar) {
	int count[]=new int[n];
	for(int i=0;i<n;i++) {
		count[ar[i]-1]++;
	}
	int max=count[0];
	int output=0;
	for(int i=1;i<n;i++) {
		if(max<count[i]) {
			max=count[i];
			output=i+1;
		}
		
	}
	return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++) {
    	 a[i]=sc.nextInt();
     }
     int result =migratoryBirds(n,a);
     System.out.println(result);
	}

}
