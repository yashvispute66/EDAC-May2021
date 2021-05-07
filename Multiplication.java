/* 5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */

import java.util.Scanner;

public class Multiplication
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);

        System.out.println("Enter first number");
        int ino1=s1.nextInt();
        System.out.println("Enter Second number");
         int ino2=s1.nextInt();

        int Multiplication=ino1*ino2;
        System.out.println("Multiplication is:"+Multiplication);
    }
}