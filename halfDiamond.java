import java.io.*;
import java.util.*;
class halfDiamond
{
   public static void main(String[]args)
   {
      int n,i,j;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no .of rows: ");
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
         for(j=0;j<=i;j++)
         {
            System.out.print("1 ");
         }
        System.out.println();
      }
      for(i=1;i<n;i++)
      {
         for(j=n-i;j>=1;j--)
         {
              System.out.print("1 ");
         }
         System.out.println();
      }
   }
}

