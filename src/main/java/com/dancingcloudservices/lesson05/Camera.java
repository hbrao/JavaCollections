package com.dancingcloudservices.lesson05;

import java.util.Arrays;
import java.util.List;

public class Camera {

    private String make;
    private String model;

    public Camera(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public int hashCode() {
        return 1; // Legal, and correct, but horrible!!!!
    }

    @Override
    public boolean equals(Object other) {
        Camera oth = (Camera) other; // VERY BAD!!!
        return this.make.equals(oth.make) 
                && this.model.equals(oth.model);
    }

    @Override
    public String toString() {
        return "Camera{" + "make=" + make + ", model=" + model + '}';
    }

    public static void main(String[] args) {
        Camera cam1 = new Camera("Nikon", "D700");
        Camera cam2 = new Camera("Canon", "5D");
        List<Camera> lc = Arrays.asList(cam1, cam2);
        System.out.println("Contains cam1? " + lc.contains(cam1));
        Camera cam3 = new Camera("Nikon", "D700");
        System.out.println("Contains cam3? " + lc.contains(cam3));
    }
}
