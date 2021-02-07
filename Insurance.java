import java.util.Scanner;

class Main {
  public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Scanner user_input = new Scanner(System.in);

    
    System.out.println("What is your age? O.o ");
    double ageOldness = keyboard.nextDouble();

    
    double calculation = 5 * ageOldness + 300;

    
    System.out.println("Your insurance is going to cost you.. $" + calculation + " A year.");

  }
}