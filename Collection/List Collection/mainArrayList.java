
import java.util.ArrayList;
import java.util.List;

public class mainArrayList {

    public static void main(String[] args) {

        // TODO: create cities ArrayList;
        List<String> cities = new ArrayList<>();

        //list will initially be empty then if we add elements to it, it will grow 10 capacity then if size exceeds capacity, it will grow in capacity by 50% of the current capacity
        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));
        cities.set(2, "Naples");
        cities.remove(5);

    }

}
