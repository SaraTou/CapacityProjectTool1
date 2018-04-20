package crud.modele;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON

public class Nessie {
    private int ne_id;
    private String ipp_tag;
    private String ne_code_otp;
    private String ne_work_order;
    private String ne_title;
    private Date ne_d_begin;
    private Date ne_d_end;

    public int getNe_id() {
        return ne_id;
    }

    public void setNe_id(int ne_id) {
        this.ne_id = ne_id;
    }

    public String getIpp_tag() {
        return ipp_tag;
    }

    public void setIpp_tag(String ipp_tag) {
        this.ipp_tag = ipp_tag;
    }

    public String getNe_code_otp() {
        return ne_code_otp;
    }

    public void setNe_code_otp(String ne_code_otp) {
        this.ne_code_otp = ne_code_otp;
    }

    public String getNe_work_order() {
        return ne_work_order;
    }

    public void setNe_work_order(String ne_work_order) {
        this.ne_work_order = ne_work_order;
    }

    public String getNe_title() {
        return ne_title;
    }

    public void setNe_title(String ne_title) {
        this.ne_title = ne_title;
    }

    public Date getNe_d_begin() {
        return ne_d_begin;
    }

    public void setNe_d_begin(Date ne_d_begin) {
        this.ne_d_begin = ne_d_begin;
    }

    public Date getNe_d_end() {
        return ne_d_end;
    }

    public void setNe_d_end(Date ne_d_end) {
        this.ne_d_end = ne_d_end;
    }
}
