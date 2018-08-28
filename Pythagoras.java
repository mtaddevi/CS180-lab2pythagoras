import java.util.Scanner;
/**
 *  cs180 - Lab 02
 *  This class is sued to calculate C given sides A and B of a triangle.
 *  @author Mike Taddeucci, <mtaddevi@purdue.edu>
 * */
public class Pythagoras {
  public static void main(String[] argv) {

    Pythagoras p = new Pythagoras();
    Scanner scanner = new Scanner(System.in); //creates a scanner object
    //prompt user for input
    System.out.println("Enter side 'a' : ");
    //Read the users input
    int a = scanner.nextInt(); //reads an integer from the standard input
    System.out.println("Enter side 'b' : ");
    int b = scanner.nextInt(); //reads an integer from the standard input
    double h;
    h = p.getHypotenuse(a,b);
    System.out.println("Hypotenuse: " + h);
  }
      public double getHypotenuse( int a, int b) {
      double h = Math.sqrt(a*a+b*b);
      return h;
    }
}