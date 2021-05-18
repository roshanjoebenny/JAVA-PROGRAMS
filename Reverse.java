import java.util.*;
class Ascend
{
 public static void main(String args[])
 {
  int smallest=0;
  int[] num=new int[10] ;
  System.out.println("Enter the values: ");
  Scanner n=new Scanner(System.in);
  for(int i=0;i<10;i++)
  {
    num[i]=n.nextInt();
  }
  
     System.out.println("The ascending list are: ");
     for(int i=0;i<10;i++)
     {
        if (n[i]>smallest)
        {
          smallest=n[i];
          System.out.println(smallest);
        }
     }
 }
}