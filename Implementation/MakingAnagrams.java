import java.util.*;
public class MakingAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s1=new String();
        s1=sc.next();
        sc.nextLine();
        String s2=new String();
        s2=sc.next();
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++) {
        	freq1[s1.charAt(i)-97]++;
        }
        for(int i=0;i<s2.length();i++) {
        	freq2[s2.charAt(i)-97]++;
        }
        int count=0;
        for(int i=0;i<26;i++) {
        	count=count+Math.abs(freq1[i]-freq2[i]);
        }
        System.out.println(count);
	}

}
