package initset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class initset {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("A");
        ls.add("B");
        ls.add("A");

        Set<String> ss = new HashSet<>(ls);
        System.out.println("Set contains: " + ss);
    }
}
