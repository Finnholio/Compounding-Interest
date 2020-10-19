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
          System.out.println(keepGoingString + " is not y/n. Please enter y/n.");
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

  public static char getInputFromUser(){
    Scanner scan = new Scanner(System.in);
    double input = scan.nextDouble();
    return input;
  }









  public static double getInputFromUser(){
    while (true){
      try {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        return input;
      }
      catch (Exception e){
        System.out.println("That is not a double. Please enter double.");
      }
    }
  }

  public static int getInputFromUser(){
    while (true){
      try {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
      }
      catch (Exception e){
        System.out.println("That is not a int. Please enter int.");
      }
    }
  }

  public static String getInputFromUser(){
    while (true){
      try {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextString();
        return input;
      }
      catch (Exception e){
        System.out.println("That is not a string. Please enter string.");
      }
    }
  }
}