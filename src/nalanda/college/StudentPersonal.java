/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalanda.college;

/**
 *
 * @author arvijayv
 */
public class StudentPersonal {
   private long studentId;
   private long mentorId;
   private Subject subjectPref;
   private String eca[];
   private String studentConduct;

    public StudentPersonal(long studentId, long mentorId, Subject subjectPref, String[] eca, String studentConduct) {
        this.studentId = studentId;
        this.mentorId = mentorId;
        this.subjectPref = subjectPref;
        this.eca = eca;
        this.studentConduct = studentConduct;
    }

    public long getStudentId() {
        return studentId;
    }

    public long getMentorId() {
        return mentorId;
    }

    public void setMentorId(long mentorId) {
        this.mentorId = mentorId;
    }

    public Subject getSubjectPref() {
        return subjectPref;
    }

    public void setSubjectPref(Subject subjectPref) {
        this.subjectPref = subjectPref;
    }

    public String[] getEca() {
        return eca;
    }

    public void setEca(String[] eca) {
        this.eca = eca;
    }

    public String getStudentConduct() {
        return studentConduct;
    }

    public void setStudentConduct(String studentConduct) {
        this.studentConduct = studentConduct;
    }
   
    
   
}
