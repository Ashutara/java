// Name: Ashwini Tupe
//Write a program with PrintWriter class and store different data details into "abc.txt" file?

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printWriterClass {
    public static void main(String[] args) {
          int n=45,year=2022;
        try {
            PrintWriter pw=new PrintWriter("abc.txt");
            pw.write("Hello my name is viral...");
            pw.println("My Roll Number is: ");
            pw.write(n);
            pw.println("Year");
            pw.write(year);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}