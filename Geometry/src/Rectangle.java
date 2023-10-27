public class Rectangle extends Geometry{
    private Point[] p;
    private double line;

    public Rectangle(Point[] p) {
        this.p = p;
    }

    public double getLength() {
        for(int i = 0; i < p.length - 1; i++) {
            line += Math.sqrt(Math.pow(p[i + 1].getX() - p[i].getX(),2) + Math.pow(p[i + 1].getY() - p[i].getY(),2));
        }
        double line2 = Math.sqrt(Math.pow(p[0].getX() - p[3].getX(),2) + Math.pow(p[0].getY() - p[3].getY(),2));
        return line + line2;
    }

    public double getArea() {
        double area = (p[0].getX() * p[1].getY() + p[1].getX() * p[2].getY() + p[2].getX() * p[3].getY() + p[3].getX() * p[0].getY())
                - (p[0].getX() * p[2].getY() + p[2].getX() * p[1].getY() + p[3].getX() * p[2].getY() + p[0].getX() * p[3].getY());
        return Math.abs(area) / 2;  // Math.abs 절대값 클래스
    }

    public String toString() {
        return "사각형 길이: " + getLength() + "\n" + "면적: " + getArea();
    }
}
