/*7. Write a Java program that takes a number as input and prints its multiplication
table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

import java.util.Scanner;


public class table
{
    public static void main(String args[])
{
    Scanner s1 =new Scanner(System.in);

    System.out.println("Enter number");
    int Mul=s1.nextInt();


    for(int i=1;i<=10;i++)
    
    System.out.println(i*Mul);
    
}
}