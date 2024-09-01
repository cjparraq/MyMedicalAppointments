package model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentNurse implements ISchedulable {

    private int id;
    private Patient patient;
    private Nurse nurse;
    private Date date;
    private String time;

    @Override
    public void schedule(Date date, String time) {
    }
}
