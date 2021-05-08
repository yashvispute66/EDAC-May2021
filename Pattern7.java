class Pattern7
{
    public static void main(String args[])
    {
        int i=0,j=0,c=0;
        for(i=1;i<=5;i++) // Row
        {
             for(j=1;j<=i;j++) //Coloumn
             {  
                 c=c+1;
                 System.out.print(c+" ");
                 
             }
             System.out.println();
             
    }
}
}
/*
 1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */
