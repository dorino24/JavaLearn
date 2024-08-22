
public class variables{
    public static void main(String[] args){
        int myNum = 5;               // Integer (whole number)          (4 bytes)
        long myLong = 1500000000L;   // Long (storage larger number)    (8 bytes)
        float myFloatNum = 5.99f;    // Floating  (decimal number)      (4 bytes)
        double myDoubleNum = 19.99d; // Double (large than float)       (8 bytes) 
        char myLetter = 'D';         // Character (single character)    (2 bytes)
        boolean myBool = true;       // Boolean  (true or false)        (1 bit)
        String myText = "Hello";     // String   (text)                 (based on length)
        System.out.println(myNum);
        System.out.println(myLong);
        System.out.println(myDoubleNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    }
}