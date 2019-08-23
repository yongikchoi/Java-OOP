public class MyCalculator {
  public static void main (String[] args) {
    int myInt = Integer.parseInt(args[0]);
    // Print out the number
    System.out.println("The number is " + myInt);
    System.out.println("The number is " + myInt++);
    System.out.println("The number is " + (++myInt));
    // Print out the digit divded by 2
    System.out.println("The result is " + myInt/2);
    // Print out the digit as a double
    System.out.println("The double is " + (double) myInt);


  }

}
