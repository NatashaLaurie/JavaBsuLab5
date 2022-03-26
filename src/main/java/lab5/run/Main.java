package lab5.run;

import lab5.circle.entity.Circle;
import lab5.circle.handler.CircleHandler;
import lab5.point.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
 //*9.  Определить класс Окружность на плоскости. Определить площадь и периметр.
// Создать массив/список/множество объектов и определить  группы окружностей, центры которых лежат на одной прямой.
// Определить наибольший и наименьший по площади (периметру) объект.

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Circle[] circles = new Circle[11];
        circles[0] = new Circle(1, new Point(10, 10));
        circles[1] = new Circle(2, new Point(10, 10));
        circles[2] = new Circle(3, new Point(5, 5));
        circles[3] = new Circle(5, new Point(-2, 10));
        circles[4] = new Circle(2, new Point(-5, 10));
        circles[5] = new Circle(3, new Point(-10, 5));
        circles[6] = new Circle(1, new Point(-2, 4));
        circles[7] = new Circle(2, new Point(8, 8));
        circles[8] = new Circle(3, new Point(-4, 8));
        circles[9] = new Circle(1, new Point(7, 4));
        circles[10] = new Circle(1, new Point(20, 20));

        logger.log(Level.INFO, "Groups of circles lying on the line  P1P2 (with collinear centers):");
        List<Circle> circlesOnTheLine = CircleHandler.getCirclesOnTheLine(circles, new Point(10, 10), new Point(1, 1));
        logger.log(Level.INFO, circlesOnTheLine);
        logger.log(Level.INFO, "Max radius circle: " + CircleHandler.getMaxRadiusCircle(circles));
        logger.log(Level.INFO, "Min radius circle: " + CircleHandler.getMinRadiusCircle(circles));
    }
}
