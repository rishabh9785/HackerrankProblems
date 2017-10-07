import java.util.*;
public class twoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0) {
        	String s1=new String();
        	s1=sc.next();
        	sc.nextLine();
        	String s2=new String();
        	s2=sc.next();
        	int freq1[]=new int[26];
        	int freq2[]=new int[26];
        	
        	for(int i=0;i<s1.length();i++) {
        	freq1[s1.charAt(i)-97]=1;
        	
        	}
        	
        	for(int i=0;i<s2.length();i++) {
            	freq2[s2.charAt(i)-97]=1;
            	}
        	int count1=0;
        	
        	for(int i=0;i<26;i++) {
        		if(freq1[i]==1&&freq2[i]==1) {
        			count1=1;
        		}
        		
        	}
        	
        	if(count1==1){
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        	t--;
        }
        
	}

}
