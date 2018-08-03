package crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import crud.connexion.Connexion;
import crud.modele.*;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

public class Dao {

    public List<Manager> getTousManagers() {
        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from managers" );
            System.out.println ( ps );
            List<Manager> al = new ArrayList<Manager> ();
            ResultSet rs = ps.executeQuery ();
            boolean found = false;
            while (rs.next ()) {
                Manager m = new Manager ();
                // System.out.println(rs.getString("pm_firstname"));
                m.setPm_id ( rs.getInt ( "pm_id" ) );
                m.setPm_code ( rs.getString ( "pm_code" ) );
                m.setPm_firstname ( rs.getString ( "pm_firstname" ) );
                m.setPm_lastname ( rs.getString ( "pm_lastname" ) );
                m.setPm_team ( rs.getString ( "pm_team" ) );
                al.add ( m );
                found = true;
            }
            System.out.println ( al );
            rs.close ();
            if (found) {
                return al;
            } else {
                return null; // Pas de data trouvé
            }
        } catch (Exception e) {
            System.out.println ( "Erreur avec  getTousManagers() -->" + e.getMessage () );
            return (null);
        }


    }

    public List<Domain> getTousDomains() {
        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from domains" );
            System.out.println ( ps );
            List<Domain> al = new ArrayList<Domain> ();
            ResultSet rs = ps.executeQuery ();
            boolean found = false;
            while (rs.next ()) {
                Domain d = new Domain ();
                //System.out.println ( rs.getString ( "D_Dept" ) );
                d.setD_id ( rs.getInt ( "d_id" ) );
                d.setD_dept ( rs.getString ( "d_dept" ) );
                d.setD_domain ( rs.getString ( "d_domain" ) );
                d.setD_description ( rs.getString ( "d_description" ) );
                d.setD_unit ( rs.getString ( "d_unit" ) );
                al.add ( d );
                found = true;
            }
            System.out.println ( al );
            rs.close ();
            if (found) {
                return al;
            } else {
                return null; // Pas de data trouvé
            }
        } catch (Exception e) {
            System.out.println ( "Erreur avec  getTousDomains() -->" + e.getMessage () );
            return (null);
        }
    }

    public List<Nessie> getTousNessies() {
        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from nessies" );
            System.out.println ( ps );
            List<Nessie> al = new ArrayList<Nessie> ();
            ResultSet rs = ps.executeQuery ();
            boolean found = false;
            while (rs.next ()) {
                Nessie n = new Nessie ();
                // System.out.println(rs.getString("pm_firstname"));
                n.setNe_id ( rs.getInt ( "ne_id" ) );
                n.setIpp_tag ( rs.getString ( "ipp_tag" ) );
                n.setNe_code_otp ( rs.getString ( "ne_code_otp" ) );
                n.setNe_work_order ( rs.getString ( "ne_work_order" ) );
                n.setNe_title ( rs.getString ( "ne_title" ) );
                n.setNe_d_begin ( rs.getDate ( "ne_d_begin" ) );
                n.setNe_d_end ( rs.getDate ( "ne_d_end" ) );

                al.add ( n );
                found = true;
            }
            System.out.println ( al );
            rs.close ();
            if (found) {
                return al;
            } else {
                return null; // Pas de data trouvé
            }
        } catch (Exception e) {
            System.out.println ( "Erreur avec  getTousNessies() -->" + e.getMessage () );
            return (null);
        }


    }


    public List<Stake> getTousStake() {
        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from stakeholders" );
            System.out.println ( ps );
            List<Stake> al = new ArrayList<Stake> ();
            ResultSet rs = ps.executeQuery ();
            boolean found = false;
            while (rs.next ()) {
                Stake s = new Stake ();
                // System.out.println(rs.getString("pm_firstname"));
                s.setSt_id ( rs.getInt ( "st_id" ) );
                s.setSt_code ( rs.getString ( "st_code" ) );
                s.setSt_team ( rs.getString ( "st_team" ) );
                s.setSt_staff_size ( rs.getInt ( "st_staff_size" ) );
                s.setSt_build_rate_default ( rs.getInt ( "st_build_rate_default" ) );
                s.setSt_run_rate_default ( rs.getInt ( "st_run_rate_default" ) );
                s.setSt_team_manager_name ( rs.getString ( "st_team_manager_name" ) );
                s.setSt_division_level ( rs.getString ( "st_division_level" ) );

                al.add ( s );
                found = true;
            }
            System.out.println ( al );
            rs.close ();
            if (found) {
                return al;
            } else {
                return null; // Pas de data trouvé
            }
        } catch (Exception e) {
            System.out.println ( "Erreur avec  getTousStake() -->" + e.getMessage () );
            return (null);
        }
    }

    public List<Project> getTousProject() {
        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from projects" );
            System.out.println ( ps );
            List<Project> al = new ArrayList<Project>();
            ResultSet rs = ps.executeQuery ();
            boolean found = false;
            while (rs.next ()) {
                Project p = new Project ();
                p.setId_interne ( rs.getInt ( "id_interne" ) );
                p.setPm_code ( rs.getString ( "pm_code" ) );
                p.setD_domain ( rs.getString ( "d_domain" ) );
                p.setCodeto ( rs.getString ( "codeto" ) );
                p.setStage ( rs.getString ( "stage" ) );
                p.setPm_lastname ( rs.getString ( "pm_lastname" ) );
                p.setPm_firstname ( rs.getString ( "pm_firstname" ) );
                p.setNe_code_otp ( rs.getString ( "ne_code_otp" ) );
                p.setStatus ( rs.getString ( "status" ) );
                p.setNe_title ( rs.getString ( "ne_title" ) );
                p.setPname ( rs.getString ( "pname" ) );

                al.add ( p );
                found = true;
            }
            System.out.println ( al );
            rs.close ();
            if (found) {
                return al;
            } else {
                return null; // Pas de data trouvé
            }
        } catch (Exception e) {
            System.out.println ( "Erreur avec  getTousProject() -->" + e.getMessage () );
            return (null);
        }
    }

    public List<Ressource> getTousRessources() {
        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from ressources" );
            System.out.println ( ps );
            List<Ressource> al = new ArrayList<Ressource> ();
            ResultSet rs = ps.executeQuery ();
            boolean found = false;
            while (rs.next ()) {
                Ressource r = new Ressource ();
                // System.out.println(rs.getString("pm_firstname"));
                r.setF_pl_id ( rs.getInt ( "F_pl_id" ) );
                r.setWeek_selected ( rs.getString ( "Week_selected" ) );
                r.setWeek_number ( rs.getString ( "Week_number" ) );
                r.setResource_type ( rs.getString ( "Resource_type" ) );
                r.setMd_forecast ( rs.getString ( "Md_forecast" ) );
                r.setMd_arbitration ( rs.getString ( "Md_arbitration" ) );
                r.setMd_delivred ( rs.getString ( "Md_delivred" ) );
                r.setCritical_level ( rs.getString ( "Critical_level" ) );
                r.setComment ( rs.getString ( "Comment" ) );


                al.add ( r );
                found = true;
            }
            System.out.println ( al );
            rs.close ();
            if (found) {
                return al;
            } else {
                return null; // Pas de data trouvé
            }
        } catch (Exception e) {
            System.out.println ( "Erreur avec  getTousRessources() -->" + e.getMessage () );
            return (null);
        }


    }


    public Manager getManagerParId(int pm_id) {
        System.out.println ( pm_id );

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from managers WHERE pm_id = ?" );
            ps.setInt ( 1, pm_id );
            Manager m = new Manager ();
            ResultSet rs = ps.executeQuery ();

            while (rs.next ()) {

                m.setPm_id ( rs.getInt ( "pm_id" ) );
                m.setPm_code ( rs.getString ( "pm_code" ) );
                m.setPm_firstname ( rs.getString ( "pm_firstname" ) );
                m.setPm_lastname ( rs.getString ( "pm_lastname" ) );
                m.setPm_team ( rs.getString ( "pm_team" ) );

            }
            rs.close ();
            return m;

        } catch (Exception e) {
            System.out.println ( "Erreur avec  getManagerParId() -->" + e.getMessage () );
            return (null);
        }
    }

    public Domain getDomainParId(int d_id) {
        System.out.println ( d_id );

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from domains WHERE d_id = ?" );
            ps.setInt ( 1, d_id );
            Domain d = new Domain ();
            ResultSet rs = ps.executeQuery ();

            while (rs.next ()) {

                d.setD_id ( rs.getInt ( "d_id" ) );
                d.setD_dept ( rs.getString ( "d_dept" ) );
                d.setD_domain ( rs.getString ( "d_domain" ) );
                d.setD_description ( rs.getString ( "d_description" ) );
                d.setD_unit ( rs.getString ( "d_unit" ) );

            }
            rs.close ();
            return d;

        } catch (Exception e) {
            System.out.println ( "Erreur avec  getDomainParId() -->" + e.getMessage () );
            return (null);
        }
    }

    public Nessie getNessieParId(int ne_id) {
        System.out.println ( ne_id );

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from nessies WHERE ne_id = ?" );
            ps.setInt ( 1, ne_id );
            Nessie n = new Nessie ();
            ResultSet rs = ps.executeQuery ();

            while (rs.next ()) {

                n.setNe_id ( rs.getInt ( "ne_id" ) );
                n.setIpp_tag ( rs.getString ( "ipp_tag" ) );
                n.setNe_code_otp ( rs.getString ( "ne_code_otp" ) );
                n.setNe_work_order ( rs.getString ( "ne_work_order" ) );
                n.setNe_title ( rs.getString ( "ne_title" ) );
                n.setNe_d_begin ( rs.getDate ( "ne_d_begin" ) );
                n.setNe_d_end ( rs.getDate ( "ne_d_end" ) );
            }
            rs.close ();
            return n;

        } catch (Exception e) {
            System.out.println ( "Erreur avec  getNessieParId() -->" + e.getMessage () );
            return (null);
        }
    }

    public Stake getStakeParId(int st_id) {
        System.out.println ( st_id );

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from stakeholders WHERE st_id = ?" );
            ps.setInt ( 1, st_id );
            Stake s = new Stake ();
            ResultSet rs = ps.executeQuery ();

            while (rs.next ()) {

                s.setSt_id ( rs.getInt ( "st_id" ) );
                s.setSt_code ( rs.getString ( "st_code" ) );
                s.setSt_team ( rs.getString ( "st_team" ) );
                s.setSt_staff_size ( rs.getInt ( "st_staff_size" ) );
                s.setSt_build_rate_default ( rs.getInt ( "st_build_rate_default" ) );
                s.setSt_run_rate_default ( rs.getInt ( "st_run_rate_default" ) );
                s.setSt_team_manager_name ( rs.getString ( "st_team_manager_name" ) );
                s.setSt_division_level ( rs.getString ( "st_division_level" ) );

            }
            rs.close ();
            return s;

        } catch (Exception e) {
            System.out.println ( "Erreur avec  getStakeParId() -->" + e.getMessage () );
            return (null);
        }
    }

    public Project getProjectParId(int id_interne) {
        System.out.println ( id_interne );

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "select * from projects WHERE id_interne = ?" );
            ps.setInt ( 1, id_interne );
            Project p = new Project ();
            ResultSet rs = ps.executeQuery ();

            while (rs.next ()) {

                p.setId_interne ( rs.getInt ( "id_interne" ) );
                p.setPm_code ( rs.getString ( "pm_code" ) );
                p.setD_domain ( rs.getString ( "d_domain" ) );
                p.setCodeto ( rs.getString ( "codeto" ) );
                p.setStage ( rs.getString ( "stage" ) );
                p.setPm_lastname ( rs.getString ( "pm_lastname" ) );
                p.setPm_firstname ( rs.getString ( "pm_firstname" ) );
                p.setNe_code_otp ( rs.getString ( "ne_code_otp" ) );
                p.setStatus ( rs.getString ( "status" ) );
                p.setPrj_type ( rs.getString ( "prj_type" ) );
                p.setSponsor_name ( rs.getString ( "sponsor_name" ) );
                p.setType ( rs.getString ( "type" ) );
                p.setTeam ( rs.getString ( "team" ) );
                p.setPrio_week ( rs.getString ( "prio_week" ) );
                p.setCountry ( rs.getString ( "country" ) );
                p.setIpp_tag ( rs.getString ( "ipp_tag" ) );
                p.setBegin ( rs.getString ( "begin" ) );
                p.setEnd ( rs.getString ( "end" ) );
                p.setPrio ( rs.getString ( "prio" ) );
                p.setGolive ( rs.getString ( "golive" ) );
                p.setRisk_level( rs.getString ( "risk_level" ) );
                p.setInit_forecast ( rs.getString ( "init_forecast" ) );
                p.setBuild_rate ( rs.getString ( "build_rate" ) );
                p.setChg_live ( rs.getString ( "chg_live" ) );
                p.setDev ( rs.getString ( "dev" ) );
                p.setRci ( rs.getString ( "rci" ) );
                p.setRce ( rs.getString ("rce") );
                p.setRct ( rs.getString ("rct") );
                p.setProd ( rs.getString ("prod") );
                p.setDrs ( rs.getString ("drs") );
                p.setTestdrs ( rs.getString ("testdrs") );
                p.setDevd ( rs.getString ("devd") );
                p.setRcid ( rs.getString ("rcid") );
                p.setRced ( rs.getString ("rced") );
                p.setRctd ( rs.getString ("rctd") );
                p.setPprodd ( rs.getString ("pprodd") );
                p.setProdd ( rs.getString ("prodd") );
                p.setComment ( rs.getString ("comment") );
               p.setPname ( rs.getString ( "pname" ) );





            }
            rs.close ();
            return p;

        } catch (Exception e) {
            System.out.println ( "Erreur avec  getProjectParId() -->" + e.getMessage () );
            return (null);
        }
    }

    public void validerEdition(Manager manager) {

        try {
            System.out.println ( "Edition du manager avec le prenom: " + manager.getPm_lastname () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " UPDATE managers SET pm_firstname = ?, pm_lastname = ?, pm_code = ?, pm_team = ? WHERE pm_id = ?";
            System.out.println ( query );
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, manager.getPm_firstname () );
            ps.setString ( 2, manager.getPm_lastname () );
            ps.setString ( 3, manager.getPm_code () );
            ps.setString ( 4, manager.getPm_team () );
            ps.setInt ( 5, manager.getPm_id () );

            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec validerEdition() -->" + e.getMessage () );

        }
    }

    public void validerEditionDomain(Domain domain) {

        try {
            System.out.println ( "Edition du domain avec le dept: " + domain.getD_dept () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " UPDATE domains SET d_dept = ?, d_domain = ?, d_description = ?, d_unit = ? WHERE d_id = ?";
            System.out.println ( query );
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, domain.getD_dept () );
            ps.setString ( 2, domain.getD_domain () );
            ps.setString ( 3, domain.getD_description () );
            ps.setString ( 4, domain.getD_unit () );
            ps.setInt ( 5, domain.getD_id () );

            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec validerEditionDomain() -->" + e.getMessage () );

        }
    }

    public void validerEditionNessie(Nessie nessie) {

        try {
            System.out.println ( "Edition du nessie avec le ipp_tag: " + nessie.getIpp_tag () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " UPDATE nessies SET ipp_tag = ?, ne_code_otp = ?, ne_work_order = ?, ne_title = ?, ne_d_begin = ?, ne_d_end = ? WHERE ne_id = ?";
            System.out.println ( query );
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, nessie.getIpp_tag () );
            ps.setString ( 2, nessie.getNe_code_otp () );
            ps.setString ( 3, nessie.getNe_work_order () );
            ps.setString ( 4, nessie.getNe_title () );
            ps.setDate ( 5, (Date) nessie.getNe_d_begin () );
            ps.setDate ( 6, (Date) nessie.getNe_d_end () );
            ps.setInt ( 7, nessie.getNe_id () );

            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec validerEditionNessie() -->" + e.getMessage () );

        }
    }

public void validerEditionStake(Stake stake) {

        try {
            System.out.println ( "Edition du Stake avec le ST: " + stake.getSt_id () );
            Connection con = Connexion.getConnection ();
            // Insert avec MYSQL

            String query = " UPDATE stakeholders SET st_code = ?, st_team = ?, st_staff_size = ?, st_build_rate_default = ?, st_run_rate_default = ?, st_team_manager_name = ?, st_division_level = ?  WHERE st_id = ?";
            System.out.println ( query );
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1,stake.getSt_code () );
            ps.setString ( 2,stake.getSt_team () );
            ps.setInt(3,stake.getSt_staff_size ());
            ps.setInt(4,stake.getSt_build_rate_default ());
            ps.setInt(5,stake.getSt_run_rate_default ());
            ps.setString ( 6,stake.getSt_team_manager_name () );
            ps.setString ( 7,stake.getSt_division_level () );
            ps.setInt(8,stake.getSt_id ());
            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec validerEdition() -->" + e.getMessage () );

        }
        }

    public void validerEditionProject(Project project) {

        try {
            System.out.println ( "Edition du project avec le id_interne: " + project.getId_interne () );
            Connection con = Connexion.getConnection ();
            // Insert avec MYSQL

            String query = " UPDATE projects SET pm_code = ?, d_domain = ?, codeto = ?, stage = ?, pm_lastname = ?, pm_firstname = ?, ne_code_otp = ?, status = ?, prj_type= ?, sponsor_name = ?, type = ?, team = ?, prio_week=?, country = ?, ipp_tag = ?, begin = ?, end = ?, prio = ?, golive = ?, risk_level = ?, init_forecast = ?, build_rate = ?, chg_live = ?, dev = ?, rci = ?, rce = ?, rct = ?, pprod = ?, prod = ?, drs = ?, testdrs =?, devd = ?, rcid = ?, rced = ?, rctd = ?, pprodd = ?, prodd = ?, comment =?,  pname =?  WHERE  id_interne = ?";
            System.out.println ( query );
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, project.getPm_code () );
            ps.setString ( 2,project.getD_domain () );
            ps.setString ( 3,project.getCodeto () );
            ps.setString ( 4,project.getStage () );
            ps.setString ( 5,project.getPm_lastname () );
            ps.setString ( 6,project.getPm_firstname () );
            ps.setString ( 7,project.getNe_code_otp () );
            ps.setString ( 8,project.getStatus () );
            ps.setString ( 9,project.getPrj_type () );
            ps.setString ( 10,project.getSponsor_name () );
            ps.setString ( 11,project.getType () );
            ps.setString ( 12,project.getTeam () );
            ps.setString ( 13,project.getPrio_week () );
            ps.setString ( 14,project.getCountry () );
            ps.setString ( 15,project.getIpp_tag () );
            ps.setString ( 16,project.getBegin () );
            ps.setString ( 17,project.getEnd () );
            ps.setString ( 18,project.getPrio () );
            ps.setString ( 19,project.getGolive () );
            ps.setString ( 20,project.getRisk_level () );
            ps.setString ( 21, project.getInit_forecast () );
            ps.setString ( 22,project.getBuild_rate () );
            ps.setString(23,project.getChg_live ());
            ps.setString ( 24,project.getDev () );
            ps.setString ( 25,project.getRci () );
            ps.setString ( 26,project.getRce () );
            ps.setString ( 27,project.getRct () );
            ps.setString ( 28,project.getPprod () );
            ps.setString ( 29,project.getProd () );
            ps.setString ( 30,project.getDrs () );
            ps.setString ( 31,project.getTestdrs () );
            ps.setString ( 32,project.getDevd () );
            ps.setString ( 33,project.getRcid () );
            ps.setString ( 34,project.getRced () );
            ps.setString ( 35,project.getRctd () );
            ps.setString (  36,project.getPprodd () );
            ps.setString ( 37,project.getProdd () );
            ps.setString ( 38,project.getComment () );
            ps.setString ( 39,project.getPname () );
            ps.setInt ( 40,project.getId_interne () );


            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec validerEdition() -->" + e.getMessage () );

        }
    }



    public void ajouterManager(Manager manager) {

        try {
            System.out.println ( "Ajout du manager avec le prenom: " + manager.getPm_lastname () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " INSERT INTO managers ( pm_code,pm_firstname, pm_lastname, pm_team)" + " values (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, manager.getPm_code () );
            ps.setString ( 2, manager.getPm_firstname () );
            ps.setString ( 3, manager.getPm_lastname () );
            ps.setString ( 4, manager.getPm_team () );

            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec ajouterManager() -->" + e.getMessage () );

        }
    }

    public void ajouterDomain(Domain domain) {

        try {
            System.out.println ( "Ajout du domain avec le D dept: " + domain.getD_dept () );
            Connection con = Connexion.getConnection ();
            // L'insert avec mysql
            String query = "INSERT INTO domains (d_dept, d_domain, d_description, d_unit)" + " values(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, domain.getD_dept () );
            ps.setString ( 2, domain.getD_domain () );
            ps.setString ( 3, domain.getD_description () );
            ps.setString ( 4, domain.getD_unit () );
            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec ajouterDomain() -->" + e.getMessage () );

        }

    }

    public void ajouterNessie(Nessie nessie) {

        try {
            System.out.println ( "Ajout du nessie avec le NE Code otp: " + nessie.getNe_code_otp () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " INSERT INTO nessies (ipp_tag, ne_code_otp, ne_work_order,ne_title, ne_d_begin, ne_d_end)" + " values (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, nessie.getIpp_tag () );
            ps.setString ( 2, nessie.getNe_code_otp () );
            ps.setString ( 3, nessie.getNe_work_order () );
            ps.setString ( 4, nessie.getNe_title () );
            ps.setDate ( 5, (Date) nessie.getNe_d_begin () );
            ps.setDate ( 6, (Date) nessie.getNe_d_end () );

            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec ajouterNessie() -->" + e.getMessage () );

        }
    }

    public void ajouterStake(Stake stake) {

        try {
            System.out.println ( "Ajout du stake avec le St_code: " + stake.getSt_code () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " INSERT INTO stakeholders (st_code, st_team, st_staff_size,st_build_rate_default, st_run_rate_default, st_team_manager_name, st_division_level)" + " values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, stake.getSt_code () );
            ps.setString ( 2, stake.getSt_team () );
            ps.setInt ( 3, stake.getSt_staff_size () );
            ps.setInt ( 4, stake.getSt_build_rate_default () );
            ps.setInt ( 5,  stake.getSt_run_rate_default () );
            ps.setString ( 6,  stake.getSt_team_manager_name () );
            ps.setString ( 7,  stake.getSt_division_level () );

            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec ajouterStake() -->" + e.getMessage () );

        }
    }
   public void ajouterProject(Project project) {
        try {
            System.out.println("ajout du project avec le Id_interne " + project.getId_interne ());
            Connection con = Connexion.getConnection ();
             //L'insert avec mysql
            String query = " INSERT INTO projects (pm_code, d_domain, codeto, stage, pm_lastname, pm_firstname, ne_code_otp, status, prj_type, sponsor_name, type , team, prio_week, country, ipp_tag, begin, end, prio, golive, risk_level, init_forecast,build_rate,chg_live,dev,rci,rce,rct,pprod,prod,drs,testdrs,devd,rcid,rced,rctd,pprodd,prodd,comment,pname)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, project.getPm_code () );
            ps.setString ( 2,project.getD_domain () );
            ps.setString ( 3,project.getCodeto () );
            ps.setString ( 4,project.getStage () );
            ps.setString ( 5,project.getPm_lastname () );
            ps.setString ( 6,project.getPm_firstname () );
            ps.setString ( 7,project.getNe_code_otp () );
            ps.setString ( 8,project.getStatus () );
            ps.setString ( 9,project.getPrj_type () );
            ps.setString ( 10,project.getSponsor_name () );
            ps.setString ( 11,project.getType () );
            ps.setString ( 12,project.getTeam () );
            ps.setString ( 13,project.getPrio_week () );
            ps.setString ( 14,project.getCountry () );
            ps.setString ( 15,project.getIpp_tag () );
            ps.setString ( 16,project.getBegin () );
            ps.setString ( 17,project.getEnd () );
            ps.setString ( 18,project.getPrio () );
            ps.setString ( 19,project.getGolive () );
            ps.setString ( 20,project.getRisk_level () );
            ps.setString ( 21, project.getInit_forecast () );
            ps.setString ( 22,project.getBuild_rate () );
            ps.setString(23,project.getChg_live ());
            ps.setString ( 24,project.getDev () );
            ps.setString ( 25,project.getRci () );
            ps.setString ( 26,project.getRce () );
            ps.setString ( 27,project.getRct () );
            ps.setString ( 28,project.getPprod () );
            ps.setString ( 29,project.getProd () );
            ps.setString ( 30,project.getDrs () );
            ps.setString ( 31,project.getTestdrs () );
            ps.setString ( 32,project.getDevd () );
            ps.setString ( 33,project.getRcid () );
            ps.setString ( 34,project.getRced () );
            ps.setString ( 35,project.getRctd () );
            ps.setString (  36,project.getPprodd () );
            ps.setString ( 37,project.getProdd () );
            ps.setString ( 38,project.getComment () );
            ps.setString ( 39,project.getPname () );



            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec ajouterProject() -->" + e.getMessage () );
        }
    }


    public void supprimerDomain(int d_id) {

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "DELETE from domains WHERE d_id = ?" );
            ps.setInt ( 1, d_id );
            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Error In supprimerDomainParId() -->" + e.getMessage () );

        }
    }

    public void supprimerNessie(int ne_id) {

            try {
                Connection con = Connexion.getConnection ();
                PreparedStatement ps = con.prepareStatement ( "DELETE from nessies WHERE ne_id = ?" );
                ps.setInt ( 1, ne_id );
                ps.executeUpdate ();
                ps.close ();
            } catch (Exception e) {
                System.out.println ( "Error In supprimerNessieParId() -->" + e.getMessage () );

            }

    }

    public void supprimerStake(int st_id) {

        try {
            Connection con = Connexion.getConnection ();
            PreparedStatement ps = con.prepareStatement ( "DELETE from stakeholders WHERE st_id = ?" );
            ps.setInt ( 1, st_id );
            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Error In supprimerStakeParId() -->" + e.getMessage () );

        }

    }

    }

