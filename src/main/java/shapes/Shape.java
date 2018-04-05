package shapes;

public class Shape {
    protected double area;
    protected double perimeter;
    private String color;

    public Shape(String c) {
        this.color = c;
    }

    public double calculateArea() {
        return this.area;
    }

    public double calculatePerimeter() {
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "formula=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}
