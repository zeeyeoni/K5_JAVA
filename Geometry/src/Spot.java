public class Spot extends Geometry{
    private Point p;

    public Spot(Point p) {
        this.p = p;
    }

    public Spot() {
        this(new Point(0, 0));
    }

    public double getLength() {
        if(p.getX() <= p.getY()) {
            return p.getY() - p.getX();
        } else {
            return p.getX() - p.getY();
        }
    }

    public double getArea() {
        return 0;
    }

    public String toString() {
        return "점 사이의 길이: " + getLength();
    }
}
