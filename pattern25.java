/* 
1
22
333
4444
55555
*/
public class pattern25
{
    public static void main(String args[])
    {
        int  i,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}