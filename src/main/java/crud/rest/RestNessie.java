package crud.rest;
import crud.dao.Dao;
import crud.modele.Nessie;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/nessies")
public class RestNessie {
    @GET
    @Path("totalNessies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Nessie> getTousNessies() {
        Dao dao = new Dao ();
        return dao.getTousNessies();
    }
    @GET
    @Path("getNessieParId/{ne_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Nessie getNessieParId(@PathParam("ne_id") int ne_id) {
        Dao dao = new Dao();
        System.out.println(ne_id);
        return dao.getNessieParId(ne_id);
    }
    // VALIDER L'EDITION DE Nessie
    @POST
    @Path("validerEditionNessie")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Nessie validerEditionNessie(Nessie nessie) {
        Dao dao = new Dao();
        dao.validerEditionNessie(nessie);
        return nessie;
    }
    // AJOUTER UN Nessie
    @POST
    @Path("ajouterNessie")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Nessie ajouterNessie(Nessie nessie) {
        Dao dao = new Dao();
        dao.ajouterNessie(nessie);
        return nessie;
    }
    @GET
    @Path("supprimerNessieParId/{ne_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int supprimerNessieParId(@PathParam("ne_id") int ne_id) {
        Dao dao = new Dao();
        dao.supprimerNessie(ne_id);
        return 1;
    }


}

