import java.util.*;
import java.lang.Math;
public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
        	int x=sc.nextInt();
        	int y=sc.nextInt();
        	int z=sc.nextInt();
        	if(Math.abs(x-z)==Math.abs(y-z)) {
        		System.out.println("Mouse C");
        	}
        	else if(Math.abs(x-z)>Math.abs(y-z)) {
        		System.out.println("Cat B");
        	}
        	if(Math.abs(x-z)<Math.abs(y-z)) {
        		System.out.println("Cat A");
        	}
        }
        
	}

}
