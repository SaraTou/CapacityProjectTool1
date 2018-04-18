package crud.rest;
import crud.modele.Domain;
import crud.dao.Dao;

import java.util.List;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("domains")
public class RestDomain {
    @GET
    @Path("totalDomains")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Domain> getTousDomains() {
        Dao dao = new Dao();

        return dao.getTousDomains();
    }
    //  OBTENIR Domain PAR ID
    @GET
    @Path("getDomainParId/{d_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Domain getDomainParId(@PathParam("d_id") int d_id) {
        Dao dao = new Dao();
        System.out.println(d_id);
        return dao.getDomainParId(d_id);
    }

    // VALIDER L'EDITION Du domain
    @POST
    @Path("validerEditionDomain")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Domain validerEditionDomain(Domain domain) {
        Dao dao = new Dao();
        dao.validerEditionDomain(domain);
        return domain;
    }

    // ajouter un domain
    @POST
    @Path("ajouterDomain")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Domain ajouterDomain(Domain domain) {
        Dao dao = new Dao();
        dao.ajouterDomain(domain);
        return domain;
    }

    // SUPPRIMER UN Domain PAR ID
    @GET
    @Path("supprimerDomainParId/{d_id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int supprimerDomainParId(@PathParam("d_id") int d_id) {
        Dao dao = new Dao();
        dao.supprimerDomain(d_id);
        return 1;
    }


}
