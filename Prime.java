import java.util.*;
class Prime
{
  public static void main(String args[])
  {
   Scanner te=new Scanner(System.in);
   System.out.println("Enter the number : ");
   int n=te.nextInt();
   for(int i=2;i<n;i++)
   {
     if(n%i==0)
     {
       System.out.println("Entered number is not prime");
       break;
     }
     else
     {
       System.out.println(" Entered number is prime");
       break;
     }
   }
  }
}
    