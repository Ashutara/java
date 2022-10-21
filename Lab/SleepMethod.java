//2)Create thread using ThreadSchedular methods sleep(),join()

// important import statements

import java.lang.Thread;
import java.io.*;

public class SleepMethod

{

// main method 

public static void main(String args[])
{
// we can also use throws keyword followed by 
// exception name for throwing the exception

try 
{

for (int j = 0; j < 5; j++)
{

// it throws the exception IllegalArgumentException
// as the time is -ve which is -100

Thread.sleep(-100);

// displaying the variable's value

System.out.println(j);
}
}

catch (Exception expn)
{

// the exception iscaught here
System.out.println(expn);

}
}
}