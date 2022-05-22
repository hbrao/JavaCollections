package hashing;

public class FakeHashStore {

    private static final int STORE_SIZE = 10;
    private Object[][] store = new Object[STORE_SIZE][4];

    public void insert(Object o) {
        Object[] target = store[storeLocation(o)];
        int idx = 0;
        while (target[idx] != null) {
            idx++;
        }
        target[idx] = o;
    }

    public boolean contains(Object o) {
        Object[] target = store[storeLocation(o)];
        int idx = 0;
        while (target[idx] != null) {
            if (o.equals(target[idx])) {
                return true;
            }
            idx++;
        }
        return false;
    }

    private int storeLocation(Object o) {
        return Math.abs(o.hashCode()) % STORE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        for (Object o : store) {
//            if (o != null) {
//                sb.append(o).append(", ");
//            }
//        }
        for (Object [] row : store) {
            int idx = 0;
            while (row[idx] != null) {
                sb.append(row[idx]).append(", ");
                idx++;
            }
        }
        if (sb.length() >= 2) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FakeHashStore fhs = new FakeHashStore();
        fhs.insert(new Student("Sheila"));
        fhs.insert(new Student("Yi"));
        fhs.insert(new Student("Alain"));
        fhs.insert(new Student("Fred"));
        fhs.insert(new Student("Algernon"));

        System.out.println("In store are: " + fhs);
        System.out.println("Contains Alain? "
                + fhs.contains(new Student("Alain")));
        System.out.println("Contains Marmaduke? "
                + fhs.contains(new Student("Marmaduke")));

        fhs.insert(new Fruit(Fruit.Color.GREEN));
        fhs.insert(new Fruit(Fruit.Color.BLUE));
        System.out.println("In store are: " + fhs);

        fhs.insert(new Student("Michelangelo"));
//        fhs.insert(new Fruit(Fruit.Color.YELLOW));
        System.out.println("In store are: " + fhs);
        
        System.out.println("Contains Student Yi? " 
                + fhs.contains(new Student("Yi")));
        System.out.println("Contains BLUE Fruit? " 
                + fhs.contains(new Fruit(Fruit.Color.BLUE)));
        System.out.println("Contains Student Michelangelo? " 
                + fhs.contains(new Student("Michelangelo")));
        System.out.println("Contains Student Mo? " 
                + fhs.contains(new Student("Mo")));
    }
}
