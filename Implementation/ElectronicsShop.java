import java.util.*;
public class ElectronicsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int n=sc.nextInt();
       int m=sc.nextInt();
       int keyboard[]=new int[n];
       int usb[]=new int[m];
	   for(int i=0;i<n;i++) {
		   keyboard[i]=sc.nextInt();
	   }
	   for(int i=0;i<m;i++) {
		  usb[i]=sc.nextInt();
	   }
	   int k=n*m;
	   int sum[]=new int[k];
	   
		   int p=0;
		   while(p<k) {
			   for(int j=0;j<n;j++) {
				   for(int l=0;l<m;l++) {
					   sum[p]=keyboard[j]+usb[l];
					   p++;
				   }
			   }
		   }
	  
	   Arrays.sort(sum);
	   for(int i=0;i<k;i++) {
		   System.out.println(sum[i]);
	   }
	   int amount=0;
	   for(int i=0;i<k;i++) {
		   if(s>=sum[i]) {
			   amount=sum[i];
			   continue;
		   }
		   else if(s<sum[i] && amount!=0) {
			   System.out.println(amount);
			   break;
		   }
		   else if(s<sum[i]) {
			   System.out.println("-1");
			   break;
		   }
		   
		   
	   }
	}

}
