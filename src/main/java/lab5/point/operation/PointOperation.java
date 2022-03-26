package lab5.point.operation;

import lab5.point.entity.Point;

public class PointOperation {
    public static boolean areOnLine(Point p0, Point p1, Point p2) {
        final double eps = 1e-20;
        double d = det(p2.getX() - p1.getX(), p2.getY() - p1.getY(), p0.getX() - p1.getX(), p0.getY() - p1.getY());
        return Math.abs(d) < eps;
    }

    private static double det(double a, double b, double c, double d) {
        return a * d - b * c;
    }

}
