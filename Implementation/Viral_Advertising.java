import java.lang.Math.*;
import java.util.*;
public class Viral_Advertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=5;
        int k=0;
        for(int i=0;i<n;i++){
        	m=(int)Math.floor(m/2);
        	k=k+m;
        	m=m*3;
        }
        System.out.println(k);
	}

}
