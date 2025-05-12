import com.example.Feline;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("Питание кошки неправильное!", expectedFood, actualFood);
    }

    @Test
    public void getFamaliTest() {
        Feline feline = new Feline();
        String expectedFamali = "Кошачьи";
        String actualFamali = feline.getFamily();
        assertEquals("Семейство не относится к кошачьим", expectedFamali, actualFamali);
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals("Котята посчитаны не верно", expectedKittens, actualKittens);
    }

    @Test
    public void getKittensCountTest(){
        Feline feline = new Feline();
        int expectedKittensCount = 5;
        int actualKittensCount = feline.getKittens(5);
        assertEquals("Котята посчитаны не верно", expectedKittensCount, actualKittensCount);
    }
}
