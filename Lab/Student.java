 // Name: Ashwini Tupe; Batch JAVA C-2533 //


/*Write a java code input Student id,Sname, attendance and print
 * details using "Scanner Class"?*/

import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		
		int  Stu_id;
		String Sname;
		String attendance;
		Scanner sc=new Scanner(System.in);
		{
	System.out.println("Enter your ID");
	Stu_id=sc.nextInt();
	System.out.println("Enter your Sname");
	Sname=sc.next();
	System.out.println("Place attendance Present or Absent");
	attendance=sc.next();
	
	System.out.println("Student ID is :" + Stu_id);
	System.out.println("Sname is : " + Sname);
	System.out.println(Sname + " is " +attendance);
		
		}
	}
}