/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov */

import java.util.Scanner;

public class Hello1
{
    public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);

    String s1=sc.next();
  

    System.out.println("Hello ");
    System.out.println(s1);
}
}
