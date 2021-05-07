/* 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. */

import java.util.Scanner;

public class Average
{
    public static void main(String args[])
    {
        Scanner s1 =new Scanner(System.in);

        System.out.println("Enter first Number");
        int ino1=s1.nextInt();
        System.out.println("Enter Second Number");
        int ino2=s1.nextInt();
        System.out.println("Enter Third Number Number");
        int ino3=s1.nextInt();

        int avg=(ino1+ino2+ino3)/3;

        System.out.println("Average Of the Numbers are: "+avg);

    }
}