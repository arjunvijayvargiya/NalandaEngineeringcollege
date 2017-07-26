package nalanda.college;
import java.util.Calendar;

/**
 *
 * @author lparas
 */
public class Faculty {
    private long facId;
    private String facName;
    private String qualification;
    private Calendar DOJ;

    public Faculty(long facId, String facName, String qualification, Calendar DOJ) {
        this.facId = facId;
        this.facName = facName;
        this.qualification = qualification;
        this.DOJ = DOJ;
    }

    public long getFacId() {
        return facId;
    }

    public void setFacId(long facId) {
        this.facId = facId;
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Calendar getDOJ() {
        return DOJ;
    }

    public void setDOJ(Calendar DOJ) {
        this.DOJ = DOJ;
    }
    
}
