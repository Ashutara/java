
// Name : Ashwini Tupe

// 3)Find maximum of array element,Minimum of array element using Methods?

import java.util.Scanner;
class Mimx
{
void max(int[] a)
{
int max=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
max=a[i];

}
System.out.println("The Max value from array is "+max); 

}
void min(int[] a)
{
int min;
min=a[0];
for(int i=0;i<a.length;i++)
{

if(a[i]<min)
min=a[i];
}

System.out.println(" The Min value from array is "+min);
}




public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] a=new int[5];
Mimx m=new Mimx();
System.out.println("Enter array: ");
for(int i=0;i<5;i++)
{
System.out.println("enter value" );
a[i]=sc.nextInt();
}

System.out.println(" \n The  array is : ");
for(int i=0;i<5;i++)
{
System.out.print(" "+a[i]);
}
int i=0;
do
{
int ch;
System.out.println(" \n \n 1. Find Max Value in array" );
System.out.println("2. Find Min Value in array" );
System.out.println("Enter your Choice " );
ch=sc.nextInt();
switch(ch)
{
case 1:
m.max(a);
break;
case 2:
m.min(a);
break;
default:
System.out.println("Sorry Error !!!");
break;
}

System.out.println(" \n Enter 1 to continue or -1 to exit .");
i=sc.nextInt();
}while(i!=-1);
}
}