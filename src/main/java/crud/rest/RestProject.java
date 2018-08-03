package crud.rest;
import crud.dao.Dao;
import crud.modele.Project;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path ("projects")
public class RestProject {
    @GET
    @Path("totalProject")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Project> getTousProject() {
        Dao dao = new Dao();
        return dao.getTousProject();
    }
    @POST
    @Path("ajouterProject")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Project ajouterProject(Project project) {
       Dao dao = new Dao();
        dao.ajouterProject(project);
        return project;
    }
    @POST
    @Path("validerEditionProject")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Project validerEditionProject(Project project) {
        Dao dao = new Dao();
        dao.validerEditionProject(project);
        return project;
    }
    @GET
    @Path("getProjectParId/{id_interne}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Project getProjectParId(@PathParam("id_interne") int id_interne) {
        Dao dao = new Dao();
        System.out.println(id_interne);
        return dao.getProjectParId(id_interne);
    }

}
