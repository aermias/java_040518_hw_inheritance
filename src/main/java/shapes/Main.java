package shapes;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square("red", 4.);
        Circle cir = new Circle("white", 3.);
        Rectangle rect = new Rectangle("blue", 4., 6.);
        Triangle tri = new Triangle("green", 6., 8., 10.);

        Shape[] myShapes = new Shape[]{sq, cir, rect, tri};

        for (int i = 0; i < myShapes.length; i++) {
            String name = myShapes[i].getClass().getSimpleName();
            double area = myShapes[i].calculateArea();
            double perimeter = myShapes[i].calculatePerimeter();

            System.out.println(name + "\n    area: " + area + "\n    perimeter: " + perimeter);
        }
    }
}
