import java.util.*;
import java.util.regex.*;

class Main {
  public static void main(String[] args) {
    boolean keepGoing = true;
    while (keepGoing == true){
      Scanner scan = new Scanner(System.in);

      System.out.print("Interest : ");
      double interest = scan.nextDouble();

      System.out.print("Initial Deposite : ");
      double initialDeposite = scan.nextDouble();

      System.out.print("Yearly Deposite : ");
      double yearlyDeposite = scan.nextDouble();

      System.out.print("Years Waited : ");
      int years = scan.nextInt();

      System.out.println("Money : " + compoundInterest(interest, initialDeposite, yearlyDeposite, years));

      while (true){
        System.out.print("Do you want to go again? (y/n) : ");
        char[] keepGoingString = scan.next().toCharArray();
        if (keepGoingString[0] == 'y'){
          System.out.println("\n");
          break;
        }
        else if (keepGoingString[0] == 'n'){
          keepGoing = false;
          break;
        }
        else {
          System.out.println("That was not y/n. Please enter y/n.");
        }
      }
    }
  }

  public static double compoundInterest(double interest, double initialDeposite, double yearlyDeposite, int years){
    double moneyAfter = initialDeposite;

    for (int i = 0; i < years; i ++){
      moneyAfter *= (1 + 0.065);
      moneyAfter += yearlyDeposite;
    }
    return moneyAfter;
  }
}