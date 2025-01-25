public class Age
{
 public static void main(String args[])
   {
     int age=23;
    if(age>=0 && age<=12)
        {
      System.out.println("child");
        }
        else
         {
          if(age>=14 && age<=19)
           {
            System.out.println("Teenager");
            }
         else
          {
           if(age>=20 && age<=59)
           {
            System.out.println("Adult");
           }
          else
           {
            System.out.println("Senior");
            }
          }
        }
    }
}