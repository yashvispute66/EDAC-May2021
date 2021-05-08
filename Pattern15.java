/*   
    *
   * *
  * * *
 * * * *
        
 */



class Pattern15
{
    public static void main(String args[])
    {
        int i=0,j=0;
    for(i=1;i<=4;i++) // Row
    {
         for(j=4;j>=1;j--)  //Coloumn for space
         {  
             if(j>i)
                System.out.print(" ");
            else
                System.out.print(" *");     
        }
    
             System.out.println();
             
    }

}
}