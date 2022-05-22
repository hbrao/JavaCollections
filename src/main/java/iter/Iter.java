package iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("One");
        ls.add("Two");
        ls.add("Three");
        
        Iterator<String> is = ls.iterator();
        while(is.hasNext()) {
            System.out.println("> " + is.next());
        }
        is.next(); // one too many!
    }
}
