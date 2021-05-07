/* 15. Write a Java program to swap two variables.*/

import java.util.Scanner;

public class swap
{
    public static void main(String args[])
    {
     
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter Numbers to swap");
    int ino1=s1.nextInt();
    int ino2=s1.nextInt();

    int temp=0;
    temp=ino1;
    ino1=ino2;
    ino2=temp;
    
    System.out.println("After Swap=" +ino1);
    System.out.println("After Swap=" +ino2);

}
}