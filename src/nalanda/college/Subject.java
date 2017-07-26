/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalanda.college;

/**
*
* @author oracle
*/
public class Subject {

    private long subjectID;
    private String subjectName;
    private int semester;
    private String subjectDesc;
    
    public void Subject() {
        
    }

    public Subject(long subjectID, String subjectName, int semester, String subjectDesc) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.semester = semester;
        this.subjectDesc = subjectDesc;
    }
    
    public long getSubjectID() {
        return subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }
        
}
