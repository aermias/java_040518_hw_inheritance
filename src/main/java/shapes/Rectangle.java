package shapes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String c, double l, double w) {
        super(c);

        this.length = l;
        this.width = w;

        this.perimeter = l * 2 + w * 2;
        this.area = l * w;
    }
}
