package Polymorphism.Shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double perimeter, Double area, Double height, Double width) {
        super(perimeter, area);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    private void setWidth(Double width) {
        this.width = width;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    Double calculateArea() {
        return height * width;
    }
}
