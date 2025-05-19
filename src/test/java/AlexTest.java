import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception{
        Alex alex = new Alex(feline);
        List<String> friends = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void testGetPalacOfLiving() throws Exception{
        Alex alex = new Alex(feline);
        String placeOfLiving = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", placeOfLiving);
    }

    @Test
    public void testGetKittens() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Alex alex = new Alex(feline);
        assertTrue(alex.doesHaveMane());
    }
}
