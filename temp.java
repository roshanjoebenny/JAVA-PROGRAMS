import java.util.*;
class Temp
{
  public static void main(String args[])
  {
   Scanner te=new Scanner(System.in);
   System.out.println("Enter the value of fahrenheit:  ");
   double s=te.nextDouble();
   System.out.println("Enter the value of celsius:  ");
   double r=te.nextDouble();
   System.out.println("The new converted celsius value is:  ");
   System.out.println(((s-32)*5/9));
   System.out.println("The new converted fahrenheit value is:  ");
   System.out.println(((r*9/5)+32));
  }
}
   