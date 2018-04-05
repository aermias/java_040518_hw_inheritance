package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String c, double r) {
        super(c);
        this.radius = r;

        this.perimeter = 2 * r * Math.PI;
        this.area = r * r * Math.PI;
    }
}
