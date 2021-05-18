import java.util.*;
class Two
{
  public static void main(String args[])
  { 
   int[][] largest=new int[0][0];
   int[][] num=new int[3][3] ;
   System.out.println("Enter the values: ");
   Scanner n=new Scanner(System.in);
   for(int i=0;i<3;i++)
   {
     for(int j=0;j<3;j++)
     {
      num[i][j]=n.nextInt();
     }
   }
   System.out.println("The largest element is : ");
   for(int i=0;i<3;i++)
   {
    for(int j=0;j<3;j++)
    {
      if(num[i][j]>largest[0][0])
      {
        largest[0][0]=num[i][j];
      }
     }
   }
    System.out.println(largest);
  }
}