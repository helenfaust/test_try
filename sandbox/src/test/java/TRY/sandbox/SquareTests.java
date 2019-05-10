package TRY.sandbox;

import TRY.sandbox.Square;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(4);
    Assert.assertEquals(s.area(), 16.0);
  }
}
