public class GeometryTest {
    public static void main(String[] args) {

        Point[] p = {new Point(0, 1),
                new Point(0, 5),
                new Point(3, 2),
                new Point(4, 5)};

        Spot spot = new Spot(new Point(10, 20));
        System.out.println(spot);

        Line line = new Line(p);
        System.out.println(line);

        Triangle triangle = new Triangle(p);
        System.out.println(triangle);

        Rectangle rectangle = new Rectangle(p);
        System.out.println(rectangle);
    }
}
