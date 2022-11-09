package Polymorphism.Shapes;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double perimeter, Double area, Double radius) {
        super(perimeter, area);
        this.radius = radius;
    }

    public final Double getRadius() {
        return radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
