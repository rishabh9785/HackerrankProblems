import java.util.Scanner;


public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long i, n, s, m,r;
	    
		for (i = 0; i < t; i++) {
			n = sc.nextLong();
			m = sc.nextLong();
			s = sc.nextLong();
			r=(s+n-1)%m;
			if(r==0){
				System.out.println(m);
			}
			else{
				System.out.println(r);
			}

}
	}
}
