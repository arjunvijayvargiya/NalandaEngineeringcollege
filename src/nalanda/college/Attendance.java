package nalanda.college;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lparas
 */
public class Attendance {
    private long stuId;
    private long subId;
    private Calendar date;
    private boolean present;

    public Attendance(long stuId, long subId, Calendar date, boolean present) {
        this.stuId = stuId;
        this.subId = subId;
        this.date = date;
        this.present = present;
    }

    public Attendance() {
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
    
    
}
