public class Line extends Geometry{
    private Point[] p;

    public Line(Point[] p) {
        this.p = p;
    }

    public double getLength() {
        double pow = Math.pow(p[1].getX() - p[0].getX(),2) + Math.pow(p[1].getY() - p[0].getY(),2);
        double root = Math.sqrt(pow);
        return root;
    }

    public double getArea() {
        return 0;
    }

    public String toString() {
        return "선 길이: " + getLength();
    }
}
