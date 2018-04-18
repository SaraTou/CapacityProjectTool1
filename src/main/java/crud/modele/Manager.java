package crud.modele;
import javax.xml.bind.annotation.XmlRootElement;
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
@XmlRootElement
public class Manager {
    private int pm_id;
    private String pm_code;
    private String pm_firstname;
    private String pm_lastname;
    private String pm_team;


    public int getPm_id() {
        return pm_id;
    }

    public void setPm_id(int pm_id) {
        this.pm_id = pm_id;
    }

    public String getPm_code() {
        return pm_code;
    }

    public void setPm_code(String pm_code) {
        this.pm_code = pm_code;
    }

    public String getPm_firstname() {
        return pm_firstname;
    }

    public void setPm_firstname(String pm_firstname) {
        this.pm_firstname = pm_firstname;
    }

    public String getPm_lastname() {
        return pm_lastname;
    }

    public void setPm_lastname(String pm_lastname) {
        this.pm_lastname = pm_lastname;
    }

    public String getPm_team() {
        return pm_team;
    }

    public void setPm_team(String pm_team) {
        this.pm_team = pm_team;
    }

    public Manager() {
    }

    public Manager(int PM_id,String PM_code, String PM_firstname, String PM_lastname, String PM_team) {
        this.pm_id = PM_id;
        this.pm_code= PM_code;
        this.pm_firstname = PM_firstname;
        this.pm_lastname = PM_lastname;
        this.pm_team = PM_team;
    }
}
