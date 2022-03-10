import static org.junit.Assert.*;
import org.junit.Test;

public class WatermelonTest {

    @Test
    public void wmt(){

        Watermelon wm = new Watermelon();

        assertEquals(wm.watermelon(-1),null);
        assertEquals(wm.watermelon(1),"NO"); //1 + 0
        assertEquals(wm.watermelon(2),"NO"); //1 + 1 or 2 + 0
        assertEquals(wm.watermelon(3),"NO"); //1 + 2
        assertEquals(wm.watermelon(4),"YES"); //2 + 2
        assertEquals(wm.watermelon(6),"YES"); //4 + 2
        assertEquals(wm.watermelon(7),"NO"); //4 + 3 or 2 + 5 or 1 + 6


    }
}