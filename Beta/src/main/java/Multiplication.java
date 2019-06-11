import java.util.Scanner;

public class Multiplication
{
   private static Scanner in;

public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their multiplication");
      in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x * y;
     
      System.out.println("Multiplication of the integers = " + z);
   }
}