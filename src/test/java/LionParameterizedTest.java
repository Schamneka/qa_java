import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    String sex;
    boolean hasMane;

    public LionParameterizedTest (String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Mock
    Feline feline;

    @Parameterized.Parameters()
    public static Object[][] getData(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest () throws Exception {
        Lion lion = new Lion(sex,feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}
