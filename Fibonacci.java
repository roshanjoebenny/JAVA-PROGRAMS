import java.util.*;
class Fibonacci
{
  public static void main(String args[])
  {
   Scanner te=new Scanner(System.in);
   System.out.println("Enter the value of n:  ");
   int n=te.nextInt();
   int i,a=0,b=1,c;
   System.out.println("The fibonacci series upto "+n +"is : ");
   if (n==1)
   {
     System.out.println(a);
   }
   else if(n==2)
   {
     System.out.println(b);
   }
   else
   {
     System.out.println(a);
     System.out.println(b);
    for(i=2;i<n;i++)
    {
      c=a+b;
      a=b;
      b=c;
      System.out.println(c);
    }
   }
  }
}  
   