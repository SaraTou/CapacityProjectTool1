package crud.modele;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
// from http://www.vogella.com/articles/REST/
// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON

public class Project {
    private int id_interne;
    private String pm_code;
    private String d_domain;
    private String codeto;
    private String stage;
    private String pm_lastname;
    private String pm_firstname;
    private String ne_code_otp;
    private String status;
    private String prj_type;
    private String sponsor_name;
    private String type;
    private String team;
    private String prio_week;
    private String country;
    private String ipp_tag;
    private String begin;
    private String end;
    private String prio;
    private String golive;
    private String risk_level;
    private String init_forecast;
    private String build_rate;
    private String chg_live;
    private String dev;
    private String rci;
    private String rce;
    private String rct;
    private String pprod;
    private String prod;
    private String drs;
    private String testdrs;
    private String devd;
    private String rcid;
    private String rced;
    private String rctd;
    private String pprodd;
    private String prodd;
    private String drsd;
    private String testdrsd;
    private String comment;
    private String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPrio() {
        return prio;

    }

    public void setPrio(String prio) {
        this.prio = prio;
    }

    public String getGolive() {
        return golive;
    }

    public void setGolive(String golive) {
        this.golive = golive;
    }

    public String getRisk_level() {
        return risk_level;
    }

    public void setRisk_level(String risk_level) {
        this.risk_level = risk_level;
    }

    public String getInit_forecast() {
        return init_forecast;
    }

    public void setInit_forecast(String init_forecast) {
        this.init_forecast = init_forecast;
    }

    public String getBuild_rate() {
        return build_rate;
    }

    public void setBuild_rate(String build_rate) {
        this.build_rate = build_rate;
    }

    public String getChg_live() {
        return chg_live;
    }

    public void setChg_live(String chg_live) {
        this.chg_live = chg_live;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getRci() {
        return rci;
    }

    public void setRci(String rci) {
        this.rci = rci;
    }

    public String getRce() {
        return rce;
    }

    public void setRce(String rce) {
        this.rce = rce;
    }

    public String getRct() {
        return rct;
    }

    public void setRct(String rct) {
        this.rct = rct;
    }

    public String getPprod() {
        return pprod;
    }

    public void setPprod(String pprod) {
        this.pprod = pprod;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getDrs() {
        return drs;
    }

    public void setDrs(String drs) {
        this.drs = drs;
    }

    public String getTestdrs() {
        return testdrs;
    }

    public void setTestdrs(String testdrs) {
        this.testdrs = testdrs;
    }

    public String getDevd() {
        return devd;
    }

    public void setDevd(String devd) {
        this.devd = devd;
    }

    public String getRcid() {
        return rcid;
    }

    public void setRcid(String rcid) {
        this.rcid = rcid;
    }

    public String getRced() {
        return rced;
    }

    public void setRced(String rced) {
        this.rced = rced;
    }

    public String getRctd() {
        return rctd;
    }

    public void setRctd(String rctd) {
        this.rctd = rctd;
    }

    public String getPprodd() {
        return pprodd;
    }

    public void setPprodd(String pprodd) {
        this.pprodd = pprodd;
    }

    public String getProdd() {
        return prodd;
    }

    public void setProdd(String prodd) {
        this.prodd = prodd;
    }

    public String getDrsd() {
        return drsd;
    }

    public void setDrsd(String drsd) {
        this.drsd = drsd;
    }

    public String getTestdrsd() {
        return testdrsd;
    }

    public void setTestdrsd(String testdrsd) {
        this.testdrsd = testdrsd;
    }





    public String getPrj_type() {
        return prj_type;
    }

    public void setPrj_type(String prj_type) {
        this.prj_type = prj_type;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSponsor_name() {
        return sponsor_name;
    }

    public void setSponsor_name(String sponsor_name) {
        this.sponsor_name = sponsor_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrio_week() {
        return prio_week;
    }

    public void setPrio_week(String prio_week) {
        this.prio_week = prio_week;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIpp_tag() {
        return ipp_tag;
    }

    public void setIpp_tag(String ipp_tag) {
        this.ipp_tag = ipp_tag;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    private String ne_title;




    public int getId_interne() {
        return id_interne;
    }

    public void setId_interne(int id_interne) {
        this.id_interne = id_interne;
    }

    public String getPm_code() {
        return pm_code;
    }

    public void setPm_code(String pm_code) {
        this.pm_code = pm_code;
    }

    public String getD_domain() {
        return d_domain;
    }

    public void setD_domain(String d_domain) {
        this.d_domain = d_domain;
    }

    public String getCodeto() {
        return codeto;
    }

    public void setCodeto(String codeto) {
        this.codeto = codeto;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getPm_lastname() {
        return pm_lastname;
    }

    public void setPm_lastname(String pm_lastname) {
        this.pm_lastname = pm_lastname;
    }

    public String getPm_firstname() {
        return pm_firstname;
    }

    public void setPm_firstname(String pm_firstname) {
        this.pm_firstname = pm_firstname;
    }

    public String getNe_code_otp() {
        return ne_code_otp;
    }

    public void setNe_code_otp(String ne_code_otp) {
        this.ne_code_otp = ne_code_otp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNe_title() {
        return ne_title;
    }

    public void setNe_title(String ne_title) {
        this.ne_title = ne_title;
    }

    public Project() {
    }

}
