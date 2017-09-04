import java.util.*;
public class Bon_Apetite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int v=0,h=0;
        
       
        	for(int i=0;i<n;i++){
        		if(i!=k){
        			v=v+a[i];
        		}
        		}
        	h=l-(v/2);
        	if(h!=0){
        	System.out.println(h);
        }
        	else{
        		System.out.println("Bon Appetit");
        	}
	}

}
