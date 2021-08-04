package classes;

import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.slf4j.Logger;


public class RectangleTest {
    private Logger logger = LoggerFactory.getLogger(RectangleTest.class);
    @Test
    void testSquare() {
        logger.debug(Thread.currentThread().getStackTrace()[1].getMethodName());
        Rectangle rectangle = new Rectangle(3, 5);
        Assert.assertEquals(15, rectangle.getSquare());
        Assert.assertEquals(16, rectangle.getPerimeter());

        Assert.assertEquals(15, Rectangle.getSquare(3, 5));
        Assert.assertEquals(16, Rectangle.getPerimeter(3, 5));
    }

    @Test
    void testCompare() {
        logger.debug(Thread.currentThread().getStackTrace()[1].getMethodName());
        Rectangle rectangle_1 = new Rectangle(5, 5);
        Rectangle rectangle_2 = new Rectangle(5, 5);
        System.out.println(rectangle_1.equals(rectangle_2));
    }
}
