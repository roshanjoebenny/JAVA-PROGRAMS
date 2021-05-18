import java.util.*;
class Greatest
{
  public static void main(String args[])
  {
   Scanner te=new Scanner(System.in);
   System.out.println("Enter the value of  first number:  ");
   int a=te.nextInt();
   System.out.println("Enter the value of  second number:  ");
   int b=te.nextInt();
   System.out.println("Enter the value of  third number:  ");
   int c=te.nextInt();
   if (a>b)
   {
     if (a>c)
        System.out.println("The largest number is: "+a);
   }
   else if(b>c)
        System.out.println("The largest number is: "+b);
   else
      System.out.println("The largest number is: "+c);
  }
}