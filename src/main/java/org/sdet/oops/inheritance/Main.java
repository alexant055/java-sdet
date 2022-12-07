package org.sdet.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(3, 40, 5);

        Bicycle bike = new MountainBike(3, 4, 5);

        System.out.println(mountainBike.getSpeed());
        mountainBike.applyBrake(5);
        System.out.println(mountainBike.getSpeed());
        System.out.println(bike.getSpeed());
    }
}
