import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
   Scanner te=new Scanner(System.in);
   System.out.println("Enter the value of number:  ");
   int n=te.nextInt();
   int t=n;
   int remainder=0,reverseN=0;
   while(n!=0)
   {
     remainder=n%10;
     reverseN=reverseN*10+remainder;
     n=n/10;
   }
   if (t==reverseN)
     System.out.println("The entered value "+t+" is a palindrome"); 
   else
      System.out.println("The entered value "+t+" is not a palindrome");
   
  }
}