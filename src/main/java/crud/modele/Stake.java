package crud.modele;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON

public class Stake {
    private int st_id;
    private String st_code;
    private String st_team;
    private int st_staff_size;
    private int st_build_rate_default;
    private int st_run_rate_default;
    private String st_team_manager_name;
    private String st_division_level;

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public String getSt_code() {
        return st_code;
    }

    public void setSt_code(String st_code) {
        this.st_code = st_code;
    }

    public String getSt_team() {
        return st_team;
    }

    public void setSt_team(String st_team) {
        this.st_team = st_team;
    }

    public int getSt_staff_size() {
        return st_staff_size;
    }

    public void setSt_staff_size(int st_staff_size) {
        this.st_staff_size = st_staff_size;
    }

    public int getSt_build_rate_default() {
        return st_build_rate_default;
    }

    public void setSt_build_rate_default(int st_build_rate_default) {
        this.st_build_rate_default = st_build_rate_default;
    }

    public int getSt_run_rate_default() {
        return st_run_rate_default;
    }

    public void setSt_run_rate_default(int st_run_rate_default) {
        this.st_run_rate_default = st_run_rate_default;
    }

    public String getSt_team_manager_name() {
        return st_team_manager_name;
    }

    public void setSt_team_manager_name(String st_team_manager_name) {
        this.st_team_manager_name = st_team_manager_name;
    }

    public String getSt_division_level() {
        return st_division_level;
    }

    public void setSt_division_level(String st_division_level) {
        this.st_division_level = st_division_level;
    }
}
