package Stack;

class Stack1{
	int max=1000;
    int top=0;
    int a[]=new int[max];
    boolean isEmpty() {
    	return (top<0);
    }
    Stack1(){
    	top=-1;
    }
    boolean push(int x) {
    	if(top>=max) {
    		System.out.println("stack overflow");
    		return false;
    	}
    	else {
    		a[++top]=x;
           System.out.println(x+" "+"is pushed");  	
    	   return true;
    	}
    }
    int pop() {
    	if(top<0) {
    		System.out.println("Stack is underflow");
    		return 0;
    	}
    	else {
    		int x=a[top--];
    		return x;
    		}    
    	}
}
public class stackImplementation {
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack1 s=new Stack1();
    s.push(10);
    s.push(20);
    System.out.println(s.pop()+" "+"is popped");
    System.out.println(s.pop()+" "+"is popped");
	}

}
