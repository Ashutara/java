// Name: Ashwini Sanjay Tupe Batch code: C2553

// 1. Program to find the largest of 03 numbers


//here we are importing java scanner library which is neccesory for using scanner class.

import java.util.Scanner;

//this is public class " LargestNumbers" is also file name i gave.

public class LargestNumbers {

// this is main class.

public static void main(String args[]){


//here is scanner class which is used to take input from user.

Scanner sc =new Scanner(System.in);

//this is output statement is used to input first number. 

System.out.println("Enter 1st number : ");

int a = sc.nextInt();

System.out.println("Enter 2nd number : ");

int b = sc.nextInt();

System.out.println("Enter 3rd number : ");

int c = sc.nextInt();

if (a > b && a > c){

System.out.println("Largest number is ::"+ a);

}else if ( b > a && b > c){

System.out.println("Largest number is ::"+ b);

}else if ( c > a && c > b){

System.out.println("Largest number is ::"+ c);

}else{

System.out.println("Cannot validate");

}

}

}



