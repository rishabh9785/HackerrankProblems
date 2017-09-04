import java.util.*;
public class mOde {
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
		int count2 = 0;
    int count1 = 0;
    int pupular1 =0;
    int popular2 =0;
    int n[]=new int[a];
    for(int i=0;i<a;i++){
    	n[i]=sc.nextInt();
    }

    for (int i = 0; i < n.length; i++)
    {
            pupular1 = n[i];
            count1 = 0;    //see edit

        for (int j = i + 1; j < n.length; j++)
        {
            if (pupular1 == n[j]) count1++;
        }

        if (count1 > count2)
        {
                popular2 = pupular1;
                count2 = count1;
        }

        else if(count1 == count2)
        {
            popular2 = Math.min(popular2, pupular1);
        }
    }

    System.out.println(popular2);
}

}
