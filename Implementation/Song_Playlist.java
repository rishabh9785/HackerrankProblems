import java.util.*;
public class Song_Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b=sc.nextInt();
    int p=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++) {
    	for(int j=i+1;j<n;j++) {
    		for(int k=j+1;k<n;k++) {
    			int temp=0;
    			temp=a[i]+a[j]+a[k];
    			if(temp==b) {
    				p++;
    				
    			}
    			else {
    				continue;
    			}
    		}
    	}
    }
    System.out.println(p);
	}

}

