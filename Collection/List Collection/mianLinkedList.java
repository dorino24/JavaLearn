import java.util.LinkedList;
import java.util.List;

public class mianLinkedList {
    public static void main(String[] args) {

        List<String> cities = new LinkedList<>();

        //linked list is a list that is implemented as a double linked list. It is slower than array list but it is faster in adding and removing elements
        //when we add element it store in a node and each node has a reference to the next node and the previous node

        //if we have 8 node and we want to retrieve the 6th node, linked list will measure the distant to decided where to begin.. then because its 6th node, it will start from the tail node and traverse the list until it reaches the 6th node  


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
