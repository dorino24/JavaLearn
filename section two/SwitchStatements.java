public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "sunny";
        switch (weather) {
            case "sunny":  System.out.println("It's a nice day for a walk.");
            case "cloudy": System.out.println("It's cloudy.");
            case "rainy": System.out.println("Bring an umbrella!");
            case "snowly": System.out.println("Wear a coat!");
            default:
                System.out.println("Not sure what to do in this weather.");
        }

      
    }
}
