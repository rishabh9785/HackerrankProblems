import java.util.*;
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int t=0;
        for (int i=0;i<n-1;i++){
        		if(a[i]==a[i+1]){
        			t++;
        			i++;
        		}
        	}
        	System.out.println(t);
	}

}
