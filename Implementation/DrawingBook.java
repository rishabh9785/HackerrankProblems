import java.util.*;
import java.lang.Math;
public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int p=sc.nextInt();
          int turns=0;
          int front=p/2;
          int back=n/2-p/2;
          if(front<back) {
        	  turns=front;
        	  System.out.println(turns);
          }
          else {
        	  turns=back;
        	  System.out.println(turns);
          }
	}

}
