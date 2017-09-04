import java.util.*;
public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	b[i]=a[i];
        	c[i]=a[i];
        }
        int temp1=a[0],highCount=0;
        for(int i=1;i<n;i++) {
        	if(temp1>a[i]) {
        		a[i]=temp1;
        		}
        	else if(temp1<a[i]) {
        		temp1=a[i];
        		highCount++;
        	}
        }
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
        System.out.println(highCount);
        int temp2=b[0],lowCount=0;
        for(int i=1;i<n;i++) {
        	if(temp2<b[i]) {
        		b[i]=temp2;
        	}
        	else if(temp2>b[i]) {
        		temp2=b[i];
        		lowCount++;
        	}
        }
        for(int i=0;i<n;i++) {
        	System.out.print(b[i]+" ");
        }
        System.out.println(lowCount);
	}

}
