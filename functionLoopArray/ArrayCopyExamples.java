
import java.util.Arrays;

public class ArrayCopyExamples {
    public static void main(String[] args) {

        // use Arrays.copyOf method to copy an array to avoid modifying the original array
        String[] kingdoms = {"Mercia","Wessex","Northumbria","East Anglia"};
        String[] copyOfKingdoms = Arrays.copyOf(kingdoms, kingdoms.length);

        copyOfKingdoms[0] = "Kent";

        System.out.println("Original array: " + Arrays.toString(kingdoms));
        System.out.println("Copied array: " + Arrays.toString(copyOfKingdoms));
    }
}
