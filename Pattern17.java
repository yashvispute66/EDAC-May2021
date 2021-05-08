class Pattern17
{
    public static void main(String args[])
    {
        int i=0,j=0;
        int alpha=64;
    for(i=1;i<=6;i++) // Row
    {
         for(j=1;j<=i;j++)  //Coloumn for space
         {  
                System.out.print((char)(alpha+j)+" "); 
                
        }
    
             System.out.println();
            
             
    }

}
}