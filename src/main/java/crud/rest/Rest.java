package crud.rest;
import crud.dao.Dao;
import crud.modele.Manager;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/managers")
public class Rest {

    //  OBTENIR LA LISTE DES MANAGERS
    @GET
    @Path("totalManagers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Manager> getTousManagers() {
        Dao dao = new Dao ();

        return dao.getTousManagers ();
    }
    //  OBTENIR l'manager PAR ID
    @GET
    @Path("getManagerParId/{pm_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Manager getManagerParId(@PathParam("pm_id") int pm_id) {
        Dao dao = new Dao();
        System.out.println(pm_id);
        return dao.getManagerParId(pm_id);
    }

    // VALIDER L'EDITION DE L'ELEVE
    @POST
    @Path("validerEdition")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Manager validerEdition(Manager manager) {
        Dao dao = new Dao();
        dao.validerEdition(manager);
        return manager;
    }
    // AJOUTER UN MANAGER
    @POST
    @Path("ajouterManager")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Manager ajouterManager(Manager manager) {
        Dao dao = new Dao();
        dao.ajouterManager(manager);
        return manager;
    }

}

