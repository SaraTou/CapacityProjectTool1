package crud.modele;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
public class Domain {
    private int d_id;
    private String d_dept;
    private String d_domain;
    private String d_description;
    private String d_unit;

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_dept() {
        return d_dept;
    }

    public void setD_dept(String d_dept) {
        this.d_dept = d_dept;
    }

    public String getD_domain() {
        return d_domain;
    }

    public void setD_domain(String d_domain) {
        this.d_domain = d_domain;
    }

    public String getD_description() {
        return d_description;
    }

    public void setD_description(String d_description) {
        this.d_description = d_description;
    }

    public String getD_unit() {
        return d_unit;
    }

    public void setD_unit(String d_unit) {
        this.d_unit = d_unit;
    }
}
