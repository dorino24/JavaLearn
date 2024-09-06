
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class mainSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            set.add("A" + i);
        }

        for (String s : set) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();

        Set<String> sethash = new LinkedHashSet<>();
        for (int i = 0; i < 30; i++) {
            sethash.add("A" + i);
        }

        for (String s : sethash) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();

        Set<String> setTree = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            setTree.add("A" + i);
        }

        for (String s : setTree) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();

    }
}
