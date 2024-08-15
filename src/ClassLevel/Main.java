package ClassLevel;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Cuboid
        Cuboid myCuboid = new Cuboid(5.0, 3.0, 4.0);

        // Access properties using getter methods
        System.out.println("Length: " + myCuboid.getLength());
        System.out.println("Width: " + myCuboid.getWidth());
        System.out.println("Height: " + myCuboid.getHeight());

        // Calculate and print the volume of the cuboid
        double volume = myCuboid.calculateVolume();
        System.out.println("Volume: " + volume);

        // Calculate and print the surface area of the cuboid
        double surfaceArea = myCuboid.calculateSurfaceArea();
        System.out.println("Surface Area: " + surfaceArea);
    }
}


