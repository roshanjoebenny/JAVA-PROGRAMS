import java.util.*;
class Arrsum
{
  public static void main(String args[])
  {
    int add=0;
    int[] sum=new int[10] ;
    System.out.println("Enter the value: ");
    Scanner n=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      sum[i]=n.nextInt();
    }
    System.out.println("The sum of integers are : ");
    for (int j=0;j<10;j++)
    {
      add=add+sum[j];
    }
     System.out.println(add);
  }
}   
   