import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class GameOfThrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String s=new String();
       s=sc.next();
       int freq[]=new int[26];
       for(int i=0;i<s.length();i++) {
    	   freq[s.charAt(i)-97]++;
       }
       int count1=0;
       int count2=0;
       int count3=0;
       for(int i=0;i<26;i++) {
    	   if(freq[i]%2!=0 && freq[i]!=1) {
    		   count1++;
    	   }
    	   else if(freq[i]%2!=0 && freq[i]==1) {
    		   count2++;
    	   }
    	   else if(freq[i]%2==0) {
    		   count3++;
    	   }
       }
       if(count1==1 && count2==0 || count2==1) {
    	   System.out.println("YES");
       }
       else if(count1>1 ||count2>1) {
    	   System.out.println("NO");
       }
     
       else {
    	   System.out.println("YES");
       }
       
       
	}

}
