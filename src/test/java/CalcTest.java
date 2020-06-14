import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    public Calc calc = new Calc();

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(10, calc.sum(7,3));
    }
}