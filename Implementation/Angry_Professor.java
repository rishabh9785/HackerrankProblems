import java.util.*;
public class Angry_Professor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int k,n;
        
       
        for(int j=0;j<t;j++){
        	int count=0;
        	n=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
        	if(a[i]<=0){
        		count++;
        	}
        	else{
        		continue;
        	}
        }
        System.out.println(count);
        if(count>=k){
        	System.out.println("NO");
        }
        else{
        	System.out.println("YES");
        }
        		
	}

}
}
