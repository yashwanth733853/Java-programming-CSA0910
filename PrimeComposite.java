import java.io.*;
import java.util.*;
class PrimeComposite
{
   public static void main(String[] args)
   {
      int pc=0,cc=0;
      int a[]=new int[50];
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the size of array: ");
      n=sc.nextInt();
      System.out.println("enter the elements of array: ");
      for(int i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
         int c=0;
         if(a[j]>0)
         {
            for(int k=1;k<=a[j];k++)
            {
                if(a[j]%k==0)
                {
                      c++;
                }
            }
           if(c>2)
           {
               cc++;
           }
           else 
	   {
               pc++;
           }
        }
      }
      System.out.println("the no.of composite numbers are :"+cc);
      System.out.println("the no.of prime numbers are :"+pc);
  }
}
