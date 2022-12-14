import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTwoTest {
    @Test
    void AlarmRed() {
        //given
        String value = "red";

        //when
        String actual = AlarmTwo.alarm(value);

        //then
        assertEquals("keine Personen erlaubt", actual);
    }

    @Test
    void AlarmYellow() {
        //given
        String value = "yellow";

        //when
        String actual = AlarmTwo.alarm(value);

        //then
        assertEquals("max 30 Personen erlaubt", actual);
    }

    @Test
    void AlarmGreen() {
        //given
        String value = "green";

        //when
        String actual = AlarmTwo.alarm(value);

        //then
        assertEquals("max 60 Personen erlaubt", actual);
    }
}
