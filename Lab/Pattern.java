// Name : Ashwini Tupe ; Batch JAVA C-2533 //

/*4)write a program to print given patteren?
       *****
       ****
       ***
       **/

public class pattern {
// here this is the main class of the program.
	public static void main(String[] args) {
		// here i am initilizing the row variable that indiacates i have 5 rows in program.
		int rows=5;      
		// this is inner loop which shows first line   
		for (int i= rows-1; i>=0 ; i--)  
		{  
		//this is outer loop print until last numbers became 1  
		for (int j=0; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print("*" + " ");  
		}  
		//throws the cursor in the next line after printing each line  
		System.out.println(); 
}
}
}

