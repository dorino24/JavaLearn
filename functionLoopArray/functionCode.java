public class functionCode {
    public static void main(String[] args) {
        functionWithNoParameters();
        functionWithParameters(1.5, 30.9);
        double sum = functionWithReturn(1.5, 30.9);
        String language = functionString("Java");
        
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println(language);


        //built-in functions
        String str = "Hello World";
        int lengthStr = str.length();
        System.out.println(lengthStr);

        String STR = str.toUpperCase();
        System.out.println(STR);

        boolean doesStartWithHello = str.startsWith("Hello");
        System.out.println(doesStartWithHello);
    }

    /**
     * function name : functionWithNoParameters
     * @return (void)
     */
    public static void functionWithNoParameters() {
        System.out.println("This is a function with no parameters");
    }

    /**
     * function name : functionWithParameters
     * @param a (double)
     * @param b (double)
     * @return (void)
     */

    public static void functionWithParameters(double a, double b){
        System.out.println("The sum of the two numbers is: " + (a + b));
    }

    /**
     * function name : functionWithReturn
     * @param a (double)
     * @param b (double)
     * @return (double)
     * 
     * This function returns the sum of two numbers
     */
   
    public static double functionWithReturn(double a, double b){
        return a + b;
    }

    /**
     * function name : functionString
     * @param language (String)
     * @return (String)
     * 
     * This function returns the description of the programming language
     */
    public static String functionString(String language){
        switch (language) {
            case ("Java"): return "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.";
            case ("Python"): return "Python is an interpreted, high-level, general-purpose programming language.";
            case ("C++"): return "C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or 'C with Classes'.";
            default:
               return "Language not found";
        }
    }

    

}