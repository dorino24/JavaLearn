
import java.util.Scanner;

public class mainDealership {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        car[] cars = new car[]{
            new car("Nissan", "Juke", 2020, "red", new String[]{"tires", "keys"}),
            new car("Dodge", "Challanger", 2019, "blue", new String[]{"tires", "keys"}),
            new car("Nissan", "X-Trail", 2017, "yellow", new String[]{"tires", "filter"}),
            new car("Honda", "NSX", 2019, "orange", new String[]{"tires", "filter"}),
            new car("Mercedes", "AMG", 2015, "jet black", new String[]{"tires", "filter", "transmission"})
        };

        dealership dealer = new dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealer);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        dealer.sellCar(index);

        scan.close();

        // Get a deep copy of the car at index 0
        car carAtIndex0 = dealer.getCar(0);
        System.out.println("Original car make: " + carAtIndex0.getMake());

        // Modify the car's make
        carAtIndex0.setMake("Toyota");
        System.out.println("Modified car make: " + carAtIndex0.getMake());

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make: " + dealer.getCar(0).getMake());

        // Create a new Car object
        car newCar = new car("BMW", "A300", 2018, "silver", new String[]{"tires", "filter", "transmission"});

        // Set the car at index 1 in the dealership to a deep copy of the newCar
        dealer.setCar(1, newCar);

        // Verify that the car at index 1 in the dealership has been updated
        System.out.println("Dealership car make at index 1: " + dealer.getCar(1).getMake());

        // Modify the newCar object
        newCar.setMake("Audi");

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make at index 1 after modifying newCar: " + dealer.getCar(1).getMake());

    }
}
