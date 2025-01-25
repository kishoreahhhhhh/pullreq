import java.util.Scanner;
class AreaOfRectangle
{
  public static void main(String args[])
   {
     Scanner obj = new Scanner(System.in);
    System.out.println("Enter the base of the rectangle : ");
     int base = obj.nextInt();
    System.out.println("Enter the height of the rectangle : ");
      int height = obj.nextInt();
     int area = base*height;
    System.out.print("The area of the rectangle is : "+area);
   }
}