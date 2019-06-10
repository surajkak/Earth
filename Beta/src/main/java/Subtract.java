import java.util.Scanner;
 
class subtract
{
   private static Scanner in;

public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two integers to calculate");
      in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x - y;
     
      System.out.println("Answer of the integers = " + z);}
}
   