package com.dancingcloudservices.lesson05;

import java.util.Arrays;
import java.util.List;

public class Camera1 {

    private String make;
    private String model;

    public Camera1(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public int hashCode() {
        return 1; // Legal, and correct, but horrible!!!!
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Camera1)) {
            return false;
        }
        Camera1 oth = (Camera1) other; // Now safe
        return this.make.equals(oth.make) 
                && this.model.equals(oth.model);
    }

    @Override
    public String toString() {
        return "Camera{" + "make=" + make + ", model=" + model + '}';
    }

    public static void main(String[] args) {
        Camera1 cam1 = new Camera1("Nikon", "D700");
        Camera1 cam2 = new Camera1("Canon", "5D");
        List lc = Arrays.asList("Banana", cam1, cam2);
        System.out.println("Contains cam1? " + lc.contains(cam1));
        Camera1 cam3 = new Camera1("Nikon", "D700");
        System.out.println("Contains cam3? " + lc.contains(cam3));
    }
}
