//CODE FOR CALCULATING SIMPLE INTEREST//


import java.util.Scanner;
import java.text.NumberFormat;

class sicalc{

  public static void main(String args[]){
    //principal amount
    System.out.print("Principal Amount :" );
    Scanner input = new Scanner(System.in);
    int price = input.nextInt();

    //rate
    System.out.print("Rate             :");
    double rate = input.nextDouble();

    //time
    System.out.print("Time             :");
    int time = input.nextInt();


    //final interest and amount calculation
    int interest = (price*(int)rate*time)/100;
    int amount =price + interest ;
    System.out.println("Here is your simple interest  :$" + interest);
    System.out.print("And here is your total amount  :$" + amount);

  }
}
