package crud.rest;
import crud.modele.Stake;
import crud.dao.Dao;
import java.util.List;
import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/stakeholders")
public class RestStake {
    // obtenir la liste des stakeholders
    @GET
    @Path("totalStake")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Stake> getTousStake() {
        Dao dao = new Dao();

        return dao.getTousStake();
    }
    // obtenir le stake par ID
    @GET
    @Path("getStakeParId/{st_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Stake getStakeParId(@PathParam("st_id") int st_id) {
        Dao dao = new Dao();
        System.out.println(st_id);
        return dao.getStakeParId(st_id);
    }
    //VALIDER L'EDITION de StakeHolders
    @POST
    @Path("validerEditionStake")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Stake validerEditionStake(Stake stake) {
        Dao dao = new Dao();
        dao.validerEditionStake(stake);
        return stake;
    }


    // Ajouter un Stake
    @POST
    @Path("ajouterStake")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Stake ajouterStake(Stake stake) {
        Dao dao = new Dao();
        dao.ajouterStake(stake);
        return stake;
    }
    // SUPPRIMER UN Stake PAR ID
    @GET
    @Path("supprimerStakeParId/{st_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int supprimerStakeParId(@PathParam("st_id") int st_id) {
        Dao dao = new Dao();
        dao.supprimerStake(st_id);
        return 1;
    }

}
