package projectOne;

import java.util.Date;

public class Appointment {
    private final String appointmentID;
    private Date AppointmentDate;
    private String AppointmentDescription;

    public Appointment(String appointmentID, Date AppointmentDate, String AppointmentDescription) {
        Date currentDate = new Date();
        if (appointmentID == null || appointmentID.length() > 10) {
            throw new IllegalArgumentException("Invalid ID");
        }
        if (AppointmentDate == null || currentDate.before(AppointmentDate)) {
            throw new IllegalArgumentException("Invalid date");
        }
        if (AppointmentDescription == null || AppointmentDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }
        //inputting the values if constructor is filled.
        this.appointmentID = appointmentID;
        this.AppointmentDate = AppointmentDate;
        this.AppointmentDescription = AppointmentDescription;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public Date getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        AppointmentDate = appointmentDate;
    }

    public String getAppointmentDescription() {
        return AppointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        AppointmentDescription = appointmentDescription;
    }
}

