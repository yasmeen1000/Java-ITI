import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LabOne {
    public static void main(String[] args) {
        // A
        List<String> a = new LinkedList<>();
        a.add("Appel");
        a.add("Articale");
        a.add("Aswan");
        Collections.sort(a);

        // B
        List<String> b = new LinkedList<>();
        b.add("Book");
        b.add("Box");
        b.add("Ballon");
        Collections.sort(b);
        // C
        List<String> c = new LinkedList<>();
        c.add("Car");
        c.add("Carpentar");
        c.add("Center");
        Collections.sort(b);

        
        Map<String, List<String>> map = new HashMap<>();
        map.put("A", a);
        map.put("B", b);
        map.put("C", c);
        Collections.sort(b);

        System.out.println("List Words of key 'A': " + map.get("A"));
        System.out.println("List Words of key 'B': " + map.get("B"));
        System.out.println("List Words of key 'C': " + map.get("C"));
    }
}
