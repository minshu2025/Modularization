package P1;


public class Cuboid {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
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


