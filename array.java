import java.io.*;
import java.util.*;
class array
{
  public static void main(String[] args)
  {
     int a[]=new int[60];
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of array: ");
     int s = sc.nextInt();
     System.out.println("enter the elements array: ");
     for(int i=0;i<s;i++)
     {
        a[i]=sc.nextInt();
     }
     for(int i=0;i<s;i++)
     {
         for(int j=i+1;j<s;j++)
         {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
         }
     }
     System.out.println("enter the m value :");
     int m=sc.nextInt();
     System.out.println("enter the n value :");
     int n=sc.nextInt();
     System.out.println("the "+m+"th maximum of array is :"+a[m-1]);
     System.out.println("the "+n+"th minimum of array is :"+a[n-1]);
  }
}
