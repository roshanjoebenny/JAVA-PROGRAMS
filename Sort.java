import java.util.*;
class Sort
 {
  public static void main(String args[])
  {
   int[] num=new int[5] ;
   System.out.println("Enter the values: ");
   Scanner n=new Scanner(System.in);
   for(int i=0;i<5;i++)
   {
    num[i]=n.nextInt();
   }
   for(int i=0;i<5;i++)
   {
     for(int j=i+1;j<5;j++)
     {
       if(num[i]>num[j])
       {
         int temp=num[i];
         num[i]=num[j];
         num[j]=temp;
       }
     }
   }
     System.out.println("Sorted  values are : ");
    for (int i=0;i<5;i++)
    {
      System.out.println(num[i]);
    }
 
 }
}
  