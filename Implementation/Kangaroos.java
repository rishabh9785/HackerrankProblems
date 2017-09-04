import java.util.Scanner;
public class Kangaroos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of x1,x2,v1 and v2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		if((x1>x2&&v1<v2)||(x1<x2&&v1>v2))
		{
			int n=((x1-x2)/(v2-v1));
			x1=x1+(n)*v1;
		    x2=x2+(n)*v2;
		    if(x1==x2){
		    	System.out.println("YES");
		    }
		    else
		    {
		    	System.out.println("NO");
		    }
			
		}
			
			else{
				System.out.println("NO");
			}
	

}
}