import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmOneTest {
    @Test
    void AlarmTestForUnder30() {
        //given
        int number = 26;

        //when
        String actual = AlarmOne.alarm(number);

        //then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }

    @Test
    void AlarmTestFor30() {
        //given
        int number = 30;

        //when
        String actual = AlarmOne.alarm(number);

        //then
        assertEquals("You're right in the middle!", actual);
    }

    @Test
    void AlarmTestForOver30() {
        //given
        int number = 65;

        //when
        String actual = AlarmOne.alarm(number);

        //then
        assertEquals("Zu viele Personen zurück", actual);
    }
}
