package autobox;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxExample {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(new Integer(3));
        Integer iw = (Integer)l.get(0);
        int ival = iw.intValue();
        
        //int ival2 = l.get(0); // fails; cannot unbox Object
        System.out.println(ival);
        
        l.add(7);
        iw = (Integer)l.get(1);
        ival = iw;
        System.out.println(ival);
    }
}
