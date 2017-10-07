package Stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


 class Stack2{
	int max=100000;
    int top=0;
    int a[]=new int[max];
    boolean isEmpty() {
    	return (top<0);
    }
    Stack2(){
    	top=-1;
    }
    boolean push(int x) {
    	if(top>=max) {
    		
    		return false;
    	}
    	else {
    		a[++top]=x;
           
    	   return true;
    	}
    }
    int pop() {
    	if(top<0) {
    		
    		return 0;
    	}
    	else {
    		int x=a[top--];
    		return x;
    		}    
    	}
  }
public class EqualStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        Stack2 s1=new Stack2();
        Stack2 s2=new Stack2();
        Stack2 s3=new Stack2();
        int sum1[]=new int[n1];
        int sum2[]=new int[n2];
        int sum3[]=new int[n3]; 
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1[h1_i]=0;
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2[h2_i]=0;
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3[h3_i]=0;
        }
        int sum_1=0,sum_2=0,sum_3=0;
        for(int i=n1-1;i>=0;i--){
            s1.push(h1[i]);
            sum_1=sum_1+h1[i];
         }
        for(int i=n2-1;i>=0;i--){
            s2.push(h2[i]);
            sum_2=sum_2+h2[i];
        }
        for(int i=n3-1;i>=0;i--){
            s3.push(h3[i]);
            sum_3=sum_3+h3[i];
        
        }
        
       int a=0,b=0,c=0;
        for(int i=0;i<n1;i++){
            sum1[i]=sum_1;
            a=s1.pop();
            sum_1=sum_1-a;
            
        }
//        for(int i=0;i<n1;i++){
//            System.out.print(sum1[i]+" ");
//        }
//        System.out.println();
        for(int i=0;i<n2;i++){
            sum2[i]=sum_2;
            b=s2.pop();
            sum_2=sum_2-b;
        }
//        for(int i=0;i<n2;i++){
//            System.out.print(sum2[i]+" ");
//        }
//        System.out.println();
        for(int i=0;i<n3;i++){
            sum3[i]=sum_3;
            c=s3.pop();
            sum_3=sum_3-c;
        }
//        for(int i=0;i<n3;i++){
//            System.out.print(sum3[i]+" ");
//        }
//        System.out.println();
        int i=sum1.length,j=sum2.length,k=sum3.length;
        int smallest=0;
        Arrays.sort(sum2);
        Arrays.sort(sum3);
        Arrays.sort(sum1);
//        System.out.println(smallest);
        int l=0,highest=0;
        int result1=0,result2=0;
        if(i<j && i<k){
            smallest=i;
            while(l<smallest){
            	
                result1=Arrays.binarySearch(sum2,sum1[l]);
                result2=Arrays.binarySearch(sum3,sum1[l]);
               
               if(result1>=0 && result2>=0 && sum2[result1]==sum3[result2] && highest<sum1[l]) {
                   highest=sum1[l];
                   
                }
               l++;
            }
            
        }
        else if(j<i && j<k){
            smallest=j;
       while(l<smallest){
            	
                result1=Arrays.binarySearch(sum1,sum2[l]);
                result2=Arrays.binarySearch(sum3,sum2[l]);
               
               if(result1>=0 && result2>=0 && sum1[result1]==sum3[result2] && highest<sum2[l]) {
                   highest=sum2[l];
                   
                }
               l++;
            }
        }
        else{
            smallest=k;
            
            while(l<smallest){
                 	
                     result1=Arrays.binarySearch(sum1,sum3[l]);
                     result2=Arrays.binarySearch(sum2,sum3[l]);
                    
                    if(result1>=0 && result2>=0 && sum2[result2]==sum1[result1] && highest<sum3[l]) {
                        highest=sum3[l];
                        
                     }
                    l++;
                 }
        }
        
       
        System.out.println(highest);
            
        
    }
}

