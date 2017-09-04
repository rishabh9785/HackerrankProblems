import java.util.*;
public class ValleyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int reference=0;
        int result=0;
        boolean value=false;
        for(int i=0;i<n;i++) {
        	if(s.charAt(i)=='U') {
        		reference++;
        	}
        	else {
        		reference--;
        	}
        	if(reference<0 && value==false) {
        		result++;
        		value=true;
        	}
        	if(reference>0) {
        		value=false;
        	}
        }
	System.out.println(result);
	}

}
