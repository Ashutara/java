/* Name: Ashwini Tupe , Batch code: C2553

 2. Program to Print reverse a number?
 For example, if the number is 9835 , then O/P should be 5389 */


public class ReverseNumber

{

public static void main(String[] args)

{

// here i am initializing integer num = 9835 //

int number = 9835, reverse = 0;

// this output statement is printing "given number= 9835"  


//here we check run until num becomes 0.

while(number !=0)

{

int remainder = number % 10;

reverse = reverse * 10 + remainder;

number = number/10;

}

System.out.println("The reverse of the given number is: " + reverse);

}

}