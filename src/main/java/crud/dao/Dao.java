package crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import crud.connexion.Connexion;
import crud.modele.Domain;
import crud.modele.Manager;
import crud.modele.Nessie;

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
            System.out.println ( "Erreur avec  getManagerParId() -->" + e.getMessage () );
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

    public void ajouterManager(Manager manager) {

        try {
            System.out.println ( "Ajout du manager avec le prenom: " + manager.getPm_lastname () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " INSERT INTO managers (pm_firstname, pm_lastname, pm_code, pm_team)" + " values (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement ( query );
            ps.setString ( 1, manager.getPm_firstname () );
            ps.setString ( 2, manager.getPm_lastname () );
            ps.setString ( 3, manager.getPm_code () );
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
            ps.setString ( 2, domain.getD_unit () );
            ps.executeUpdate ();
            ps.close ();
        } catch (Exception e) {
            System.out.println ( "Erreur avec ajouterDomain() -->" + e.getMessage () );

        }

    }

    public void ajouterNessie(Nessie nessie) {

        try {
            System.out.println ( "Ajout du nessie avec le ipp tag: " + nessie.getIpp_tag () );
            Connection con = Connexion.getConnection ();

            // L'insert avec mysql
            String query = " INSERT INTO nessies (ipp_tag, ne_code_otp, ne_work_order,ne_title,ne_d_begin,ne_d_end)" + " values (?, ?, ?, ?, ?, ?)";
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
}
