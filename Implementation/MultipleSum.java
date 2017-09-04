import java.util.Scanner;
public class MultipleSum {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	int n[]={0};
	int x[]={0};
	int i=0,v,sum;
	
	for ( v=0;v<t;v++)
	{ 
      n[v]=s.nextInt();
	}
	for(v=0;v<t;v++){
		sum=0;
      	for ( i=1;i<n[v];i++)
	{
		if(i%3==0){
	   		x[i]=i;
		}
		else if(i%5==0){
			x[i]=i;
		}
		
		else{
			continue;
		}
		sum=sum+x[i];
	}
	System.out.println(sum);
	
	}
	

}
}