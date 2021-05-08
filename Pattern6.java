class Pattern6
{
    public static void main(String args[])
    {
        int i=0,j=0,c=0;
        for(i=1;i<=5;i++) // Row
        {
             for(j=1;j<=i;j++) //Coloumn
             {  System.out.print(j);
                c=c+j;
             }
                 System.out.print(" "+c);
             c=0;
             System.out.println();
              
    }
}
}
/*
1 1
12 3
123 6
1234 10
12345 15 */