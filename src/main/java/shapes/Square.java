package shapes;

public class Square extends Shape {
    private double side;

    public Square(String c, double s) {
        super(c);
        this.side = s;

        this.perimeter = s * 4;
        this.area = s * s;
    }
}