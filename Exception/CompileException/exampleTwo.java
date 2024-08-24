
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class exampleTwo {

    public static void main(String[] args) {
        try {
            readFile("greeting.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(filename);
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());
        scan.close();

    }
}
