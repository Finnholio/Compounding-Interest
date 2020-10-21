import java.util.*;
import java.util.regex.*;

class Main {
  public static void main(String[] args) {
    boolean keepGoing = true;
    while (keepGoing){
      Scanner scan = new Scanner(System.in);

      System.out.print("Interest : ");
      double interest = scan.nextDouble();

      System.out.print("Initial Deposite : ");
      double initialDeposite = scan.nextDouble();

      System.out.print("Yearly Deposite : ");
      double yearlyDeposite = scan.nextDouble();

      System.out.print("Years Waited : ");
      int years = scan.nextInt();

      lengthPrint("Deposite", 15);
      lengthPrint("Money", 15);
      lengthPrint("Year", 15);
      System.out.println();
      for (int i = 0; i < years; i++){
        if (i == 0){
          lengthPrint(Double.toString(initialDeposite) , 15);
        }
        else {
          lengthPrint(Double.toString(yearlyDeposite) , 15);
        }
        double money = compoundInterest(interest, initialDeposite, yearlyDeposite, i+1);
        lengthPrint(Double.toString(money) , 15);
        lengthPrint(Integer.toString(i + 1) , 15);
        System.out.println();
      }

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
      if (i == 0){
        moneyAfter += initialDeposite;
      }
      else {
        moneyAfter += yearlyDeposite;
      }
      moneyAfter *= (1 + interest);
      
    }
    return moneyAfter;
  }

  public static void lengthPrint(String text, int length){
    char[] textChars = text.toCharArray();
    for (int i = 0; i < length; i++){
      if (i > textChars.length - 1){
        System.out.print(" ");
      }
      else {
        System.out.print(textChars[i]);
      }
    }
    System.out.print(" ");
  }
}