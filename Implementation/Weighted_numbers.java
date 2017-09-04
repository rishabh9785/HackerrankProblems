import java.lang.Math.*;
import java.util.*;
public class Weighted_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     
     String s1=sc.next();
     int n=sc.nextInt();
    // char a[]=s1.toCharArray();
    /* int v[]=new int[n];
     for(int i=0;i<n;i++){
    	 v[i]=sc.nextInt();
     }*/
     
     int a1[]=new int[26];
     for(int i=0;i<s1.length();i++)
     {
    	 int temp=0;
    	 for(int j=i;j<s1.length();j++)
    	 {
    		 if(s1.charAt(i)!=s1.charAt(j))
    		 {
    			 i=j-1;
    			 break;
    		 }
    		 else{
    			 temp++;
    		 }
    	 }
    	 	
    	 	if(a1[s1.charAt(i)-97]<temp){
    	 		a1[s1.charAt(i)-97]=temp;
    	 	}
     }
     for (int i=0;i<26;i++)
     {
    	 System.out.println(a1[i]);
     }
}
}
