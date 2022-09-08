// Name: ASHWINI TUPE Batch code: C2533 

// Write a java code to demo all types of variables.

class Variables
{
     int a=10;          //instance variable
     static int b=20;          //static variable
     public int m1()
     {
          int c = 30;          //local variable
          System.out.println("c = "+c);
          return 0;
     }
     public static void main(String args[])
     {
          Variables v = new Variables ();
          System.out.println("a = "+v.a+"  b = "+b);
          v.m1();          //invoke the m1 method
     }
}