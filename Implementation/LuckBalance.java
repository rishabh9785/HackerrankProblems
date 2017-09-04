import java.util.Scanner;
public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();//k<=n
		int l[]=new int[n];
		int t[]=new int[n];
		int p[]={0};
	    int sum=0;
		for(int i=0;i<n;i++)
		{
			 
			l[i]=sc.nextInt();
			t[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			if(t[i]==0){
				break;
			}
			else{
				p[i]=l[i];
			}

	}
		
		for(int i=0;i<p.length;i++){
			
			sum=sum+p[i];
		}
        System.out.println(sum);
}
}
