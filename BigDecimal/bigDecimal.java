import java.math.BigDecimal;

public class bigDecimal{
     public static void main(String[] args) {
        
        // BigDecimal is more precise than double 

        double x = 0.1;
        double y = 0.2;
        double z = x + y;

        System.out.println(z);
        // Output: 0.30000000000000004

        BigDecimal x1 = new BigDecimal("0.1");
        BigDecimal y1 = new BigDecimal("0.2");

        System.out.println(x1.add(y1));
        // Output: 0.3


    }
}