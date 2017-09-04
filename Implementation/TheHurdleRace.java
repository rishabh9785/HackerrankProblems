import java.util.*;
import java.lang.Math;
public class TheHurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        int beverageCount=0,increase=0;
        for(int i=0;i<n;i++) {
        
        if(k<a[i]) {
        	 increase=Math.abs(k-a[i]);
        	k=k+increase;
        	
            beverageCount=beverageCount+increase; 
            
        }
        
        }
        System.out.println(beverageCount);
	}

}
