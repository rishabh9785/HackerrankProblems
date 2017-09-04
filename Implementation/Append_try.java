import java.util.*;
public class Append_try {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    int k = in.nextInt();
    int temp=k;
   int sl=s.length();
   int tl=t.length();
    int n;
    if(temp>=sl+tl)
        System.out.println("Yes");
    else
    {int x=s.compareTo(t);
    
    	if(x<0)
        n=s.length();
    else
        n=t.length();

    int i,flag;
    for( i=0;i<n;i++){
        if(s.charAt(i)==t.charAt(i))
        	flag=1;
        else
        	break;
    }


    sl=sl-i;
    tl=tl-i;
    sl=sl+tl;

    if(temp<sl)
        System.out.println("No");

        temp=temp-sl;

     if(temp>=0 && temp%2==0 )
         System.out.println("Yes");
    if(temp>=0 && temp%2!=0)
        System.out.println("No");
    }}
}
