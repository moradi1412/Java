import java.util.Scanner;

public class InputMismatchExceptionQuiz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    boolean done = false;
    int number1 = 0;
    int number2 = 0; 

    // Enter two integers
    System.out.print("Enter two integers: ");
        
    while (!done) {
      try {

        try {
          number1 = input.nextInt();
          number2 = input.nextInt();
          
          break;
     
      }
      catch (Exception ex) {
        
        System.out.printf("You must enter 2 integers!%n%n");
        input.nextLine(); 

      }
    }
   
    System.out.println("Sum is " + (number1 + number2));
  }
}