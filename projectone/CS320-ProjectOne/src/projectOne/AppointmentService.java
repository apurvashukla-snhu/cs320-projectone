package projectOne;

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {

    static ArrayList<Appointment> appointments = new ArrayList<>(0);

    //unique ID code
    public static String generateUniqueId() {
        String uniqueId;
        String appointmentId;
        if (appointments.isEmpty()) {
            appointmentId = "000000000";
        }
        //not empty case
        else {
            int arraySize = appointments.size();
            appointmentId = appointments.get(arraySize - 1).getAppointmentID();
        }
        int temp = Integer.parseInt(appointmentId) + 1;
        uniqueId = Integer.toString(temp);
        return uniqueId;
    }
    //add appointment code
    public static void addAppointment(String id, Date date, String description) {
        id = generateUniqueId();
        Appointment appointmentnew = new Appointment(id, date, description);
        appointments.add(appointmentnew);
    }
    //delete appointment code
    public static void deleteAppointment(String uniqueId) {
        for (int i = 0; i < appointments.size(); i++) {
            if(uniqueId.compareTo(appointments.get(i).getAppointmentID()) == 0) {
                appointments.remove(i);
            }
        }
    }
}
