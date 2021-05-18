import java.util.*;
class Two
{
  public static void main(String args[])
  { 
   int largest=0;
   int[][] num=new int[2][2] ;
   System.out.println("Enter the values: ");
   Scanner n=new Scanner(System.in);
   for(int i=0;i<2;i++)
   {
     for(int j=0;j<2;j++)
     {
      num[i][j]=n.nextInt();
     }
   }
   System.out.println("The largest element is : ");
   for(int i=0;i<2;i++)
   {
    for(int j=0;j<2;j++)
    {
      if(num[i][j]>=largest)
      {
        largest=num[i][j];
      }
     }
   }
    System.out.println(largest);
  }
}