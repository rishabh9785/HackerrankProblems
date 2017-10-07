import java.util.*;
public class StringsConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0) {
        	String s=new String();
        	s=sc.next();
        	int count=0;
//        	for(int i=s.length();i>=0;i--) {
//        		for(int j=i;j>=0;j--) {
//        			if(s.charAt(i)==s.charAt(j)) {
//        				count++;
//        			}
//        		}
//        	}
        	int freq[]=new int[26];
        	int sum[]=new int[26];
        	int value=0;
        	for(int i=0;i<s.length();i++) {
        		freq[s.charAt(i)-97]++;
        	}
        	for(int i=0;i<26;i++) {
        		if(freq[i]==0) {
        			sum[i]=0;
        		}
        		else {
        			sum[i]=1;
        		}
        		value=value+sum[i];
        	}
        	System.out.println(value);
        t--;
        }
        	
        }
	}


