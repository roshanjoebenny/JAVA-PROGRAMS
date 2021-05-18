import java.util.*;
class Num
{
  public static void main(String args[])
  {
   Scanner n=new Scanner(System.in);
   System.out.println("Enter the value of n:  ");
   int s=n.nextInt();
   int i,j;
   for(i=1;i<=s;i++)
   {
     for(j=1;j<=i;j++)
     {
       System.out.print(j);
       System.out.print(" ");
     }
       System.out.println(); 
   }
  }
}