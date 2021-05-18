import java.util.*;
 class Lar
 {
   public static void main(String []args) 
   {
      int big=[0][0];
      Scanner n=new Scanner(System.in);
      int[][] two=new int[3][3];
      System.out.println("Enter the elements in the 2d array: ");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
          System.out.print("two[" + i + "][" + j + ": "]);
          int two[i][j]=n.nextInt();
        }
         for(i=0;i<3;i++)
         {
          for(j=0;j<3;j++)
          {
             if (two[i][j]>big)
             {
               big=two[i][j];
             }
           }
          }
           System.out.println("The greatest element is : "+big);
    }
 } 


 ch[i]=str.charAt(i);
      }
       System.out.println("Enter the character to be searched: ");
       char c=n.next().charAt(0);
       for (int i=0;i<ch.length;i++)
       {
         if(ch[i]==c)
         {
            System.out.println("The item location is : "+i);
            flag=1;
            break;
         }
       }
      if(flag==0)
      {
        System.out.println("Item not found ");
      }
   }
}