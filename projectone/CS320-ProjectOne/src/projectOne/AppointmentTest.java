package projectOne;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AppointmentTest {
    private static final long MILLIS_IN_A_DAY = 1000*60*60*24;
    Date currentDate = new Date();

    Date pastDate = new Date();

    private static Date setPastDate(Date date) {
        return new Date(date.getTime() - MILLIS_IN_A_DAY);
    }

    @Test
    void testAppointmentClass() {
        Appointment newAppointment = new Appointment("12345678", currentDate, "stub appointment added");
        assertEquals("12345678", newAppointment.getAppointmentID());
        assertEquals(newAppointment.getAppointmentDate(), currentDate);
        assertEquals("stub appointment added", newAppointment.getAppointmentDescription());
    }
    @Test
    void testLongId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678900", currentDate, "stub description added");
        });
    }
    @Test
    void testNullId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, currentDate, "stub description added");
        });
    }
    @Test
    void testNullDate() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678", null, "stub description added");
        });
    }
    @Test
    void testPastDate() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678", setPastDate(pastDate), "stub description added");
        });
    }
    @Test
    void testLongDescribe() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("1234567", currentDate, "stub description added, very very very long description here, this should throw an error.");
        });
    }
    @Test
    void testNullDescribe() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("1234567", currentDate, null);
        });
    }
}
