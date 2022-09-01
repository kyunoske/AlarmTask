import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmOneTest {

    @Test
    void AlarmTestForUnder30() {
        //given
        int number = 26;

        //when
        int actual = AlarmOne.alarm(number);

        //then
        assertEquals(26, actual);
    }

    @Test
    void AlarmTestForOver30() {
        //given
        int number = 65;

        //when
        int actual = AlarmOne.alarm(number);

        //then
        assertEquals(65, actual);
    }
}
