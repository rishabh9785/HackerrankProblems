import java.util.Scanner;
public class Rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++){
			int m=sc.nextInt();
			System.out.println(a[(n-k+m)%n]);		
			}
		sc.close();
		// TODO Auto-generated method stub

	}

}
