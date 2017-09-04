import java.util.Scanner;


public class Sherlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	       int[][] a=new int[n][2];
	        for(int i=0;i<n;i++){
	        	for(int j=0;j<2;j++){
	        	a[i][j]=sc.nextInt();
	        }
	        }
	        for(int i=0;i<n;i++){
	        	
	        int count=0;
	        for(int k=a[i][0];k<a[i][1];k++){
	        	double x=Math.sqrt(k);
        		double y=Math.ceil(x);
        		if(x==y){
        			count++;
        		}
        		else{
        			continue;
        		}
        	}
        	System.out.println(count);
	        }
	}

}
