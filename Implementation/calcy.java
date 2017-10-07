import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class calcy {

    static int solve(String opr) {
        // Complete this function
       int i=0;
       int a=Character.getNumericValue(opr.charAt(0));
       int b=Character.getNumericValue(opr.charAt(2));
       int sum=0;
       char p=(char)opr.charAt(1);
        if(p== '+'){
           sum=a+b; 
        }
        else if(p== '-'){
            sum=a-b;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
