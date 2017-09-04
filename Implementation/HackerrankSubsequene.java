import java.util.*;
public class HackerrankSubsequene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char a[]= {'h','a','c','k','e','r','r','a','n','k'};
        int n=sc.nextInt();
        String s=new String();
        for(int i=0;i<n;i++) {
        s=sc.next();
        char b[]=s.toCharArray();
        if(b.length<a.length) {
        	System.out.println("NO");
        }
        int j=0;
        	for(int k=0;k<b.length;k++) {
        		if(j<a.length && a[j]==b[k]) {
        		j++;
        		}
        	}
        	System.out.println(j==a.length?"YES":"NO");
        }
        }
	}


