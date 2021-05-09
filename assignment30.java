public class assignment30 {
    public static void main(String args[])
    {
        int n='A';
        for(char i='E';i>=n;i--)
        {
            for(int k=n+1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++)
            {
                System.out.print(i+" ");

            }
            System.out.println("");
        }

    }
    
}
