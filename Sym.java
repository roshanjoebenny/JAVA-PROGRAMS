import java.util.*;
class Sym
{
  public static void main(String args[])
  { 
   int flag=0;
   int[][] tran=new int[2][2];
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
   for(int i=0;i<2;i++)
   {
    for(int j=0;j<2;j++)
    {
      tran[j][i]=num[i][j];
    }
   }
    for(int i=0;i<2;i++)
    {
      for (int j=0;j<2;j++)
      {
        if(num[i][j]!=tran[i][j])
        {
          flag=1;
          break;
         }
      }
    }
    if (flag==1)
    {
      System.out.println("matrix is not symmetric");
    }
    else
    {
      System.out.println("matrix is symmetric");
    }
 
   }
}