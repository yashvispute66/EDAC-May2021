class Pattern16
{
    public static void main(String args[])
    {
        int i=0,j=0;
    for(i=1;i<=5;i++) // Row
    {
         for(j=1;j<=i;j++)  //Coloumn for space
         {  
             //if(j%2==0)
             if(i%2==0)
                System.out.print("0");
            else
                System.out.print("1");     
        }
    
             System.out.println();
             
    }

}
}
/*
1
10
101
1010
10101


1
00
111
0000
11111 */