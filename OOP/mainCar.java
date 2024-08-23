
import java.util.Arrays;

public class mainCar {
    public static void main(String[] args) {
        car toyota = new car("Toyota", "Corolla", 2020, "Red",new String[]{"Engine","Tire","Brake"});
        car nissan = new car("Nissan", "Juke", 2023, "white",new String[]{"Exhaust","Belt","Battery"});

        car toyota2 = new car(toyota); // copy constructor
        toyota2.setModel("Fortuner");
        carPrint(toyota2);
        carPrint(toyota);

        toyota.setYear(2024);
        carPrint(toyota);
        toyota.setColor("Black");
        carPrint(toyota);
        toyota.drive();

        System.out.println();
        carPrint(nissan);
        nissan.setModel("X-Trail");
        carPrint(nissan);
        nissan.setColor("Yellow");
        carPrint(nissan);  
        nissan.drive();

        System.out.println(toyota);
        toyota.getColor();

    }   

    public static void carPrint(car car){
        System.out.println("This "+car.getMake()+" Model is a "+car.getModel()+" Year "+car.getYear()+" Color "+car.getColor()+" with Parts "+ Arrays.toString(car.getparts()));
    }
}
