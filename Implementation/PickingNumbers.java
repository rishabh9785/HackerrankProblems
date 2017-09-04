import java.util.*;
public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a[n-1];i++) {
        	b[i]=0;
        }
        
        for(int i=0;i<a[n-1];i++) {
        	b[a[i]-1]++;
        }
        int max=0;
        for(int i=1;i<a[n-1];i++) {
        	if(b[i-1]+b[i]>max) {
        		max=b[i-1]+b[i];
        		continue;
        	}
        	else {
        		continue;
        	}
        }
        System.out.println(max);
	}

}
