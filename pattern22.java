/*
E E E E E
D D D D D
C C C C C 
B B B B B
A A A A A 
 */
 
 public class pattern22
 {
     public static void main(String args[])
     {
         char i,j;

         for(i='E';i>='A';i--)
         {
             for(j='E';j>='A';j--)
             {
                 System.out.print(i);
             }
             System.out.println();
         }
     }
 }