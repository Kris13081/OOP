package Polymorphism.Shapes;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    public Shape(Double perimeter, Double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    private void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    private void setArea(Double area) {
        this.area = area;
    }

    abstract Double calculatePerimeter();

    abstract Double calculateArea();


}
