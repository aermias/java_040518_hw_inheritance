package shapes;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String c, double s1, double s2, double s3) {
        super(c);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;

        this.perimeter = s1 + s2 + s3;
        double p = this.perimeter / 2;
        this.area = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }
}
