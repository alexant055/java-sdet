package org.sdet.oops.interfacedemo;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(5,3, 36);
        System.out.println(mountainBike.getGear());
        mountainBike.speedUp(5);

    }
}
