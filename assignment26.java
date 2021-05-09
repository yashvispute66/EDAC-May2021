/*
        *
      * *
    * * *
  * * * *
* * * * *

*/

public class assignment26 {
    public static void main(String args[])
    {
       for(int i=1;i<=5;i++)  //outerloop
       {
           for(int k=5-1;k>=i;k--) // whitespaces
           {
               System.out.print("");
           }
           for(int j=1;j<=i;j++) //inner loop for print
           {
               System.out.print("*");
           }
           System.out.println("");
       }
    }
    
}
