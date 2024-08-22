
import java.util.Scanner;

public class scannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;

        scanner.close();
        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you " + name + " for answering all " + counter +" questions");
        System.out.println("Weekly, you spend "+ coffeeAmount * coffeePrice +" on coffee");
        System.out.println("Weekly, you spend "+ foodAmount * foodPrice+" on food");
    }

    //when using nexLine() after nextInt() or nextDouble(), the nextLine() will be skipped
    //so we need to add scanner.nextLine()to be wasted on empty space
}
