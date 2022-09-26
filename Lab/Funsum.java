// Name: Ashwini Tupe

//5)To calculate sum of two numbers function if my input char is 'y' [yes] to continue again otherwise to stop process?


import java.util.Scanner;
import java.lang.*;
class Funsum
{
void  sum(int a,int b)
{
System.out.println("sum: "+(a+b));
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Funsum f=new Funsum();
char ch;
do
{
int num1,num2;
System.out.println("Enter Two number :");
num1=sc.nextInt();
num2=sc.nextInt();
f.sum(num1,num2);
System.out.println("Enter 'y' To continue or 'n' to exit");
ch=sc.next().charAt(0);
ch=Character.toLowerCase(ch);
}while(ch=='y');


}
}