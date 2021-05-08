class Pattern10
{
    public static void main(String args[])
    {
        int i=0,j=0;
        for(i=1;i<=3;i++) // Row
        {
             for(j=3;j>=i;j--)  //Coloumn
             {  
                 
                 System.out.print("*");
                 
             }
             System.out.println();
             
    }
}
}