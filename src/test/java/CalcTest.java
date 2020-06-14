import java.lang.Math;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest {

    public int abs(int a){
        if(a < 0)
            return -a;
        else
            return a;
    }

    public int addExact(int x, int y)
    {
        return x+y;
    }

    public int floorDiv(int x, int y){
        return x/y;
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                {56},
                {-412},
                {5}
        };
    }

    @Test(dataProvider = "test1")
    public void test_Abs(int a) throws Exception {
        Assert.assertEquals(abs(a), Math.abs(a));
    }

    @DataProvider(name = "test2")
    public Object[][] createData2() {
        return new Object[][] {
                {12, 7},
                {-346, -4365}
        };
    }

    @Test(dataProvider = "test2")
    public void test_addExact(int x, int y) {
        Assert.assertEquals(addExact(x, y), Math.addExact(x, y));
    }

    @Test(dataProvider = "test2")
    public void test_floorDiv(int x, int y) {
        Assert.assertEquals(floorDiv(x, y), Math.floorDiv(x, y));
    }

}

