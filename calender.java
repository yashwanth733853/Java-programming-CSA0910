import java.io.*;
import java.util.*;
class calender
{
    public static void main(String[]args)
    {
       try
       {
            Scanner sc = new Scanner(System.in);
            int years,days,weeks,months,days1;
            System.out.println("Enter the number of days: ");
            days=sc.nextInt();
            if(days > 0)
            {
                years=days/365;
                weeks=days/7;
                days=days%365;
                days1=days%7;
                System.out.println("The number of years: "+years);
                System.out.println("the number of weeks: "+weeks);
                System.out.println("The number of days: "+days1);
            }
            else
            {
                  System.out.println("negative value not accepted: ");
            }
       }
       catch(Exception e)
       {
           System.out.println("floating point/string exception");
       }
   }
}