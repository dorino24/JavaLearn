
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exampleOne{
    public static void main(String[] args){
        try {
            FileInputStream file = new FileInputStream("greeting.txt");
            Scanner scan = new Scanner(file);
            System.out.println(scan.nextLine());
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }   
    }
}