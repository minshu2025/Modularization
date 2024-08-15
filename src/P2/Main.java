package P2;

import P1.Cuboid;


public class Main {

    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(2, 3, 4);
        Cuboid cuboid2 = new Cuboid(1, 6, 4);

        System.out.println("Volume of Cuboid 1: " + cuboid1.calculateVolume());
        System.out.println("Volume of Cuboid 2: " + cuboid2.calculateVolume());

        System.out.println("Surface Area of Cuboid 1: " + cuboid1.calculateSurfaceArea());
        System.out.println("Surface Area of Cuboid 2: " + cuboid2.calculateSurfaceArea());
}
}
