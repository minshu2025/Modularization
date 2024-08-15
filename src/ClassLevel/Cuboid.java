package ClassLevel;
public class Cuboid {
    // Private instance variables for the dimensions of the cuboid
    private double length;
    private double width;
    private double height;

    // Constructor to initialize the cuboid's dimensions
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cuboid
    public double calculateVolume() {
        return length * width * height;
    }

    // Method to calculate the surface area of the cuboid
    public double calculateSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}

