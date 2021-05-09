/*
    A
   A B
  A B C
 A B C D
A B C D E */
public class assignment29 {
    public static void main(String args[])
    {
        int n='E';
        for(char i='A';i<=n;i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++)
            {
                System.out.print(j+" ");

            }
            System.out.println("");
        }

    }
    
}
