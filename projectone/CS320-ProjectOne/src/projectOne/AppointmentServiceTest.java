package projectOne;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppointmentServiceTest extends AppointmentService{
    Date currentDate = new Date();
    @Test
    void AppointmentDeleteTest() {
        AppointmentService.addAppointment("90197", currentDate, "description");
        AppointmentService.deleteAppointment("90197");
        assertFalse(appointments.equals("90197"));
    }
    @Test
    void AppointmentAddTest() {
        AppointmentService.addAppointment("8080808", currentDate, "unique description");
        assertFalse(appointments.equals("8080808"));
    }
}