package de.haegerconsulting.quarkus.userservice.resource;

import de.haegerconsulting.quarkus.userservice.model.User;
import de.haegerconsulting.quarkus.userservice.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    private UserService userService;

    @GET
    public Response list() {
        return Response.ok(userService.getAllUsers()).build();
    }
    
    @GET
    @Path("/{id}")
    public Response find(@PathParam("id") Long id){
        return Response.status(Response.Status.OK).entity(userService.getUserById(id)).build();
    }
    
    @POST
    public Response add(User user){
        userService.addUser(user);
        return Response.status(Response.Status.OK).entity(user).build();
    }
    
    @DELETE
    public Response delete(User user){
        userService.deleteUser(user);
        return Response.status(Response.Status.OK).build();
    }
}
