import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeOfDayTest {

    @Test
    void morning() {
       TimeOfDay timeOfDay  = new TimeOfDay();
       assertEquals(6,timeOfDay.timeOfTheDay(6));
    }

    @Test
    void afternoon() {
        TimeOfDay timeOfDay = new TimeOfDay();
        assertEquals(13,timeOfDay.timeOfTheDay(13));
    }

    @Test
    void evening() {
        TimeOfDay timeOfDay = new TimeOfDay();
        assertEquals(17,timeOfDay.timeOfTheDay(17));
    }

    @Test
    void night() {
        TimeOfDay timeOfDay = new TimeOfDay();
        assertEquals(23,timeOfDay.timeOfTheDay(23));
    }

}