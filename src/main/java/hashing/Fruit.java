package hashing;

public class Fruit {
    public static enum Color { RED, GREEN, YELLOW, BLUE, ORANGE };
    private Color color;
    public Fruit(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != Fruit.class) return false;
        Fruit otherFruit = (Fruit)other;
        return otherFruit.color == color;
    }
    
    @Override
    public int hashCode() {
        return color.ordinal();
    }
    
    @Override
    public String toString() {
        return "Fruit {" + this.color + "}";
    }
}
