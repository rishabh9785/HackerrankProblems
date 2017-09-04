import java.util.*;
import java.io.*;
public class Pdf_Viewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
        String s="abcdefghijklmnopqrstuvwxyz";
        char[] a = s.toCharArray();
        char b[]=new char[26];
        int c[]=new int[26];
        for(int i=0;i<26;i++){
        	b[i]=a[i];
        	c[i]=sc.nextInt();
        }
        String d=sc.next();
        char n[]=d.toCharArray();
        int k[]=new int[n.length];
        for(int i=0;i<n.length;i++){
        	for(int j=0;j<26;j++){
        	if(n[i]==b[j]){
        		k[i]=c[j];
        	}
        }
        }
        Arrays.sort(k);
        System.out.println(k[n.length-1]*n.length);
	
	}
}
