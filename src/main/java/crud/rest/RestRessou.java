package crud.rest;

import crud.modele.Ressource;
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

@Path ( "/ressources" )
public class RestRessou {
    @GET
    @Path ("totalRes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ressource> getTousRessources() {
        Dao dao = new Dao();
        return dao.getTousRessources();
    }
}
