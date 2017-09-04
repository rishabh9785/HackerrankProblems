import java.util.*;
import java.util.regex.*;
public class ReGex {

	public static void main(String[] args) {
		 
	

		    
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        scan.close();
		         	
					String[] words=s.split( "[ .,?!'\t@_&%#$~()]+"); 
					
					/*for(int i=0;i<words.length;i++){
					System.out.println(words[i]);
					}*/
					
					int i=0,j=0,m=0,n=0;
					for(int k=0;k<words.length;k++){
						if(Pattern.matches("[a-zA-Z]+",words[k])==true){
						j=j+1;
						}
					}
					System.out.println(j);
					String answer[]=new String[j];
					//using java foreach loop to print elements of string array  
					for(i=0;i<words.length;i++){
						if(Pattern.matches("[a-zA-Z]+",words[i])==true)
						{
							answer[n]=words[i];
						    n++;
						}
					
					}
				for(m=0;m<j;m++){
					System.out.println(answer[m]);
				}
		        // Write your code here.
		    }
		}

