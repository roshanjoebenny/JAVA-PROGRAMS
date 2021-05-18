import java.util.*;
class Pattern
{
  public static void main(String args[])
  {
   Scanner n=new Scanner(System.in);
   System.out.println("Enter the value of n:  ");
   int s=n.nextInt();
   int a=97;
   int i,j;
   for(i=0;i<s;i++)
   {
     for(j=0;j<=i;j++)
     {
       System.out.print((char)(a+j));
     }
      System.out.print("  ");
   }
  }
}