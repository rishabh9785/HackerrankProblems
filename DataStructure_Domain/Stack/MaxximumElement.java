package Stack;
import java.util.Scanner;
class Stack{
//	int compare=0;
	int updatedIndex=0;
	int max=100000;
	int a[]=new int[max];
    int top=0;
    Stack (){
    	top=-1;
    }
    boolean isEmpty() {
    	return (top<0);
    }
    boolean push(int x) {
    	if(top>=max) {
    		return false;
    	}
    	else {
    		a[++top]=x;
    		updatedIndex=top;
    		//System.out.println(x+" "+"is pushed");
    		return true; 
    	}
    	
    }
    int pop() {
    	int x=0;
    	if(top>=0) {
    		//System.out.println(a[top]+" "+"is removed");
    		x=a[top--];
    		updatedIndex=top;
    		}
    	return x;
    }
//    int output(){
//        int v=0;
//        if(top>=0){
//         v=a[top];
//    }
//       return v;
//    }
    int traverseStack(int index) {
    	int maxelem=a[0];
    	for(int i=0;i<=updatedIndex;i++) {
    		if(maxelem<a[i]) {
    			maxelem=a[i];
    		}
    	}
    	return maxelem;
    }
    
//    int maxElement(int element) {
//    	
//    	if(compare<element) {
//    		compare=element;
//    	}
//    	return compare;
//    }
}
public class MaxximumElement {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack stack=new Stack();
      int maximum=0;
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int count=1;
      while(t>0) {
    	  
    	  int x=sc.nextInt();      
    	  
    	  if(x==1) { 
    		  int element=sc.nextInt();
    		  stack.push(element);
//    		  System.out.println(stack.updatedIndex);
//    		  maximum=stack.traverseStack(stack.updatedIndex);
    	  }
    	  else if(x==2) {
    		 stack.pop();
//    		 System.out.println(stack.updatedIndex);
//    		 maximum=stack.traverseStack(stack.updatedIndex);
    	  }
    	  else if(x==3) {
    		  
    		  maximum=stack.traverseStack(stack.updatedIndex);
    		  System.out.println(maximum);
    		  }
    	  //System.out.println(t);
    	  t--;
    	  
    }
	}

}
