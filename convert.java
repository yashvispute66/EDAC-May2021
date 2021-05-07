/* 
19. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101  */

import java.util.Scanner;
public class convert
{
    public static void main(String args[])
{
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter Numbers to convert");
    int ino1=s1.nextInt();
    int idigit=0;
    while(ino1>0)
    {
        idigit=ino1%2;
        ino1=ino1/2;
        System.out.println("Decimal to binary conversion is:"+idigit);
    } 
}
}   
43 reminder -1
21 1
10 0