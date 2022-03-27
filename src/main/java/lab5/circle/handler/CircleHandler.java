package lab5.circle.handler;

import lab5.circle.entity.Circle;
import lab5.point.entity.Point;
import lab5.point.operation.PointOperation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CircleHandler {

    public static Circle getMaxRadiusCircle(Circle[] array) {
        return Arrays.stream(array).max(Circle::compareTo).orElseThrow(NoSuchElementException::new);
    }

    public static Circle getMinRadiusCircle(Circle[] array) {
        return Arrays.stream(array).min(Circle::compareTo).orElseThrow(NoSuchElementException::new);
    }

    public static List<Circle> getCirclesOnTheLine(Circle[] array, Point p1, Point p2) {
        Stream<Circle> circleStream = Arrays.stream(array);
        return circleStream
                .filter(a -> PointOperation.areOnLine(a.getCenter(), p1, p2))
                .collect(Collectors.toList());
    }
}
