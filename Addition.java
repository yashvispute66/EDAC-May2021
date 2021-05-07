/*2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36 */

import java.util.Scanner;
 public class Addition
 {
     public static void main(String args[])
     {
         Scanner s1 =new Scanner(System.in);

         System.out.println("Enter Two Numbers");
         int ino1=s1.nextInt();
         int ino2=s1.nextInt();
         int Add=ino1+ino2;

         System.out.println("Addition is:"+Add);
     }
 }