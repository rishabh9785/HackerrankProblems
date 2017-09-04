import java.util.*;
import java.io.*;
public class DeletionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          StringBuffer s=new StringBuffer(sc.nextLine());
          for(int i=1;i<s.length();i++) {
        	  if(s.charAt(i)==s.charAt(i-1)) {
        		  s.delete(i-1,i+1);
        		  i=0;
        	  }
        	  }
          if(s.length()==0) {
        	  System.out.println("EMPTY STRING");
          }
          else {
        	  System.out.println(s);
          }

	}

}
