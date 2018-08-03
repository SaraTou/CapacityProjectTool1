package crud.modele;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON

public class Ressource {
    private int f_pl_id;
    private String week_selected;
    private String week_number;
    private String resource_type;
    private String md_forecast;
    private String md_arbitration;
    private String md_delivred;
    private String critical_level;
    private String comment ;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWeek_number() {
        return week_number;
    }

    public void setWeek_number(String week_number) {
        this.week_number = week_number;
    }

    public int getF_pl_id() {
        return f_pl_id;

    }

    public void setF_pl_id(int f_pl_id) {
        this.f_pl_id = f_pl_id;
    }

    public String getWeek_selected() {
        return week_selected;
    }

    public void setWeek_selected(String week_selected) {
        this.week_selected = week_selected;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getMd_forecast() {
        return md_forecast;
    }

    public void setMd_forecast(String md_forecast) {
        this.md_forecast = md_forecast;
    }

    public String getMd_arbitration() {
        return md_arbitration;
    }

    public void setMd_arbitration(String md_arbitration) {
        this.md_arbitration = md_arbitration;
    }

    public String getMd_delivred() {
        return md_delivred;
    }

    public void setMd_delivred(String md_delivred) {
        this.md_delivred = md_delivred;
    }

    public String getCritical_level() {
        return critical_level;
    }

    public void setCritical_level(String critical_level) {
        this.critical_level = critical_level;
    }
}
