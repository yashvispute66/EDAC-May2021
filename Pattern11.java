class Pattern11
{
    public static void main(String args[])
    {
        int i=0,j=0;
    for(i=1;i<=4;i++) // Row
    {
         for(j=1;j<=i;j++)  //Coloumn
         {  
             
             System.out.print("*");
             
         }
         System.out.println();
         
        }
        
        for(i=1;i<=7;i++) // Row
        {
             for(j=3;j>=i;j--)  //Coloumn
             {  
                 
                 System.out.print("*");
                 
             }
             System.out.println();
             
    }

}
}
        /*
 *
**
***
****
***
**
*
      */