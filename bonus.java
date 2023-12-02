import java.io.*;
import java.util.*;
class bonus
{
   public static void main(String[]args)
   {
      try
      {
         double salary;
         double bonus;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the grade of an employee: ");
         char g=sc.next().charAt(0);
         System.out.println("enter the salary of an employee: ");
         salary = sc.nextDouble();
         if(salary < 10000)
         {
             bonus = 0.02;
             salary = salary+salary*bonus;
         }
         if(g=='A')
         {
            bonus = 0.05;
            salary = salary+salary*bonus;
            System.out.println("the total salary of employee is : "+salary);
         }
         if(g=='B')
         {
            bonus = 0.1;
            salary = salary + salary*bonus;
            System.out.println("the total salary of employee is : "+salary);
         } 
          if(salary <=0)
          {
             System.out.println("enter the valid salary : ");
          }
          if(g!='A' && g!='B')
          {
              System.out.println("enter the correct grade of employee: ");
          }
       }
       catch(Exception e)
       { 
            System.out.println("enter valid salary and grade of an employee");
       }
   }
}