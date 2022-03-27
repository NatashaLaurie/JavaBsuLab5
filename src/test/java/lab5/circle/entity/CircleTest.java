package lab5.circle.entity;

import lab5.point.entity.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleTest {

    Circle circle;

    @BeforeClass
    public void setUp() {
        circle = new Circle(1, new Point(1, 1));
    }

    @AfterClass
    public void tearDown() {
        circle = null;
    }

    @Test
    public void testEquals() {
        Circle c1 = new Circle(1, new Point(1, 1));
        assertEquals(c1, circle);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Circle c1 = circle.clone();
        assertEquals(c1, circle);

    }

    @Test
    public void testCompareTo() {
        Circle c1 = new Circle(3);
        Assert.assertTrue(c1.compareTo(circle) > 0);
    }
}