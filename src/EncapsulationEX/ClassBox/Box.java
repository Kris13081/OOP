package EncapsulationEX.ClassBox;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);

    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Surface Area - ").append(calculateSurfaceArea()).append(System.lineSeparator());
        sb.append("Lateral Surface Area - ").append(calculateLateralSurfaceArea()).append(System.lineSeparator());
        sb.append("Volume - ").append(calculateVolume()).append(System.lineSeparator());

        return sb.toString();
    }
}
