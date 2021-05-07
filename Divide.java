/* 3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16 */

import java.util.Scanner;

    public class Divide
{
        public static void main(String[] args) 
        {
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter two Numbers");

            int ino1=s1.nextInt();
            int ino2=s1.nextInt();
            int Division=ino1/ino2;

            System.out.println("Division is:"+Division);
            
        }
    }