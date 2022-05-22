package com.dancingcloudservices.lesson05;

public class Tire {

    int diameter, width;

    public Tire(int diameter, int width) {
        this.diameter = diameter;
        this.width = width;
    }

    @Override
    public boolean equals(Object other) {
//        if (!(other instanceof Tire)) {
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Tire t2 = (Tire) other;
        return this.diameter == t2.diameter
                && this.width == t2.width;
    }

    @Override
    public String toString() {
        return "Tire{" + "diameter=" + diameter + ", width=" + width + '}';
    }

    public static void main(String[] args) {
        Tire t1 = new Tire(14, 175);
        Tire t2 = new Tire(14, 175);
        Tire t3 = new Tire(15, 185);

        System.out.println("t1.equals(t2) " + t1.equals(t2));
        System.out.println("t2.equals(t1) " + t2.equals(t1));
        System.out.println("t1.equals(t3) " + t1.equals(t3));
        System.out.println("t3.equals(t2) " + t3.equals(t2));

        Tire tt1 = new TruckTire(1000, 15, 185);
        Tire tt2 = new TruckTire(15000, 15, 185);
        System.out.println("tt1.equals(tt2) " + tt1.equals(tt2));
        Tire tt3 = new TruckTire(1000, 15, 185);
        System.out.println("tt1.equals(tt3) " + tt1.equals(tt3));
        System.out.println("---------------------------------");
        System.out.println("t3.equals(tt3) " + t3.equals(tt3));
        System.out.println("tt3.equals(t3) " + tt3.equals(t3));
    }
}

class TruckTire extends Tire {

    int loadCapacity;

    @Override
    public boolean equals(Object other) {
//        if (!(other instanceof TruckTire)) {
        if (other.getClass() != this.getClass()) {
            return false;
        }
        TruckTire t = (TruckTire)other;
        return this.width == t.width
                && this.diameter == t.diameter
                && this.loadCapacity == t.loadCapacity;
    }

    public TruckTire(int loadCapacity, int diameter, int width) {
        super(diameter, width);
        this.loadCapacity = loadCapacity;
    }

}
