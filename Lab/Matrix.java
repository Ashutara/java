// Name: Ashwini Tupe

//1)to make menu driven using 2d-arrays
  a)addition
  b)multiplication
  c)transpose


import java.util.Scanner;
class Matrix
{
void add(int[][] a,int[][] b) //Addtion Function
{
int [][] c=new int[2][2];
System.out.println("Addtion of Two Matrix :");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}

void transpose(int[][] a,int[][] b)
{
Scanner sc=new Scanner(System.in);
int[][] c=new int[2][2];
int ch;
System.out.println("Enter your choice for Transponse of Matrix (1 or 2 Any one):"); 
ch=sc.nextInt();
if(ch==1)
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
c[i][j]=a[j][i];
}
}
}
else
{
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b.length;j++)
{
c[i][j]=b[j][i];
}
}
}

System.out.println("Tranpose of Martix : ");
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}

// Multiply of array......
void multi(int[][] a,int[][] b)
{

int[][] c=new int[2][2];
if(a.length==b.length)
{
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<2;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
}
else
{
System.out.println("Mulitply of array is not possible .");
}
System.out.println("Multiply of Martixes : ");
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
System.out.print(" "+c[i][j]);
}
System.out.println();
}



}











public static void main(String[] args)
{
Matrix c=new Matrix();
Scanner sc=new Scanner(System.in);
// First Array.......

System.out.println("Enter  First array  ");
int[][] a=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println("Enter value ");
a[i][j]=sc.nextInt();
}
}
System.out.println("Your first array: ");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(" "+a[i][j]);
}
System.out.println();
}

// Second Array ......
System.out.println(" \n \n \n Enter  Second array  ");
int[][] b=new int[2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println("Enter value ");
b[i][j]=sc.nextInt();
}
}
System.out.println("Your Second array: ");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(" "+b[i][j]);
}
System.out.println();
}




// Operation on Matrix Select your choice ....

int ch;
System.out.println(" \n \n \n 1. Addtion of Matrix .");
System.out.println("2. Transpose of Matrix .");
System.out.println("3.  Multiply  of Matrix .");
System.out.println("Enter  Your Choice: ");
ch=sc.nextInt();
switch(ch)
{
case 1:
c.add(a,b);
break;
case 2:
c.transpose(a,b);
break;
case 3:
c.multi(a,b);
break;
default:
System.out.println("Error!!");
break;
}
}
}