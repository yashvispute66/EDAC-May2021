/*4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13 */

import java.util.Scanner;

public class opertion
{
    public static void main(String args[])
    {
        System.out.println("Expression 1 output="+(-5+(8*6)));
        System.out.println("Expression 1 output="+((55+9) % 9));
        System.out.println("Expression 1 output="+(20 + (-3*5 / 8)));
        System.out.println("Expression 1 output="+(5 + (15 / 3) * 2 - (8 % 3)));
    }
}