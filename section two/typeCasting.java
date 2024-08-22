public class typeCasting {
    public static void main(String[] args) {
        int ants = 2000;
        int purchasedBlockOfCheese = 1;

        System.out.println("The ants are " + ants + " and " + purchasedBlockOfCheese + " block of cheese");  
        System.out.println("Each ant will get " + ((double) purchasedBlockOfCheese / ants) + " block of cheese");

        double salary = 531.25;
        int roundedSalary = (int) salary;
        System.out.println("The salary is " + salary + " and the rounded salary is " + roundedSalary);
    }
}
