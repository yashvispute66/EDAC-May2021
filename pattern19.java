/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1    */


public class pattern19

{
    public static void main(String args[])
    {
        int i=0;
        int j=0;

        for(i=5;i>=1;i--)
        {
            for(j=5;j>=1;j--)
            {
                
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}