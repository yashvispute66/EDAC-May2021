/* 13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

import java.util.Scanner;
 public class Area
 {
     public static void main(String args[])
     {
         Scanner s1 =new Scanner(System.in);

         System.out.println("Enter First Number");
         double ino1=s1.nextDouble();
         System.out.println("Enter Second");
         double ino2=s1.nextDouble();
         double Area=(ino1*ino2);
         double Perimeter=2*(ino1+ino2);

         System.out.println("Area is :"+Area);
         System.out.println("Perimeter is :"+Perimeter);
     }
 }