import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t!=0) {
    	   String s=new String();
    	   s=sc.next();
    	   
//    	   System.out.println(s.length());
    	   if(s.length()%2==0) {
    		   int freq1[]=new int[26];
    		   int freq2[]=new int[26];
    		   int freq3[]=new int[26];
    		   for(int i=0;i<s.length()/2;i++) {
    			   freq1[s.charAt(i)-97]++;
    		   }
    		   for(int i=s.length()/2;i<s.length();i++) {
    			   freq2[s.charAt(i)-97]++;
    		   }
    		   
//    		   for(int i=0;i<26;i++) {
//    			   freq3[i]=Math.abs(freq2[i]-freq1[i]);
//    		   }
    		   int temp=0;
//    		   for(int i=1;i<26;i++) {
//    			   if(freq3[i-1]>freq3[i]&& freq3[i]!=0 && freq3[i-1]!=0) {
//    				   temp=freq3[i];
//    			   }
//    			   else if(freq3[i-1]<=freq3[i]&& freq3[i]!=0 && freq3[i-1]!=0){
//    				   temp=freq3[i-1];
//    			   }
//    		   }
    		   for(int i=0;i<26;i++) {
    			   if(freq1[i]>freq2[i] && freq1[i]!=0) {
    				   temp=temp+Math.abs(freq1[i]-freq2[i]);
    			   }
    		   }
//    		   System.out.println(temp);
//    		   Arrays.sort(freq3);
//    		   for(int i=1;i<26;i++) {
//    			   if(freq3[i-1]>=freq3[i]&& freq3[i]!=0 && freq3[i-1]!=0) {
//    				   temp=freq3[i];
//    			   }
//    			   else if(freq3[i-1]<=freq3[i]&& freq3[i]!=0 && freq3[i-1]!=0){
//    				   temp=freq3[i-1];
//    			   }
//    		   }
    		   System.out.println(temp);
    	   }
    	   else {
    		   System.out.println("-1");
    	   }
    	   t--;
       }
	}

}
