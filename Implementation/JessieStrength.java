import java.util.*;
public class JessieStrength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	
        }
        int count=0,skip=0;
        for(int i=0;i<n;i++) {
        	if(a[i]<=k && skip==1) {
        		count++;
        	}
        	else if(a[i]>k && skip==1) {
        		break;
        	}
        	else if(a[i]<=k) {
        		count++;
        		continue;
        	}
        	else if(a[i]>k && skip==0) {
        		skip++;
        		continue;
        	}
        	
        	
        }
        System.out.println(count);
	}

}
