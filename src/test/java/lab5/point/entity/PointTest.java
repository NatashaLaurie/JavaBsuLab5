package lab5.point.entity;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class PointTest {
    Point point;

    @BeforeClass
    public void setUp() {
        point = new Point(1,1);
    }

    @AfterClass
    public void tearDown() {
        point = null;
    }

    @Test
    public void testEquals() {
        Point p1 = new Point(1,1);
        assertEquals(point, p1);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        Point p1 = point.clone();
        Assert.assertEquals(p1,point);

    }
}