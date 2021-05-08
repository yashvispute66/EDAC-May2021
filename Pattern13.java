class Pattern13
{
    public static void main(String args[])
    {
        int i=0,j=0,k=0;
    for(i=1;i<=3;i++) // Row
    {
         for(j=1;j<=i;j++)  //Coloumn for space
         {  
             
             System.out.print(" ");
            
         
        }
        
             for(k=3;k>=i;k--)  //Coloumn for star
             {  
                 
                 System.out.print("*");
                 
             }
             System.out.println();
             
    }

}
}
/* 

 ***
  **
   *
   
*/