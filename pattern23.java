/*
   E D C B A
   E D C B A
   E D C B A
   E D C B A
   E D C B A
 */
 
public class pattern23
{
    public static void main(String args[])
    {
        char i,j;

        for(i='E';i>='A';i--)
        {
            for(j='E';j>='A';j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}