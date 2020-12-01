package com.jeevan.rest.easy.service;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jeevan.rest.easy.model.Root;

@Path("/api/v1")
public interface EmployeeInterface {

    @GET
    @Path("/employee/{employeeID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    Root employeeById(@PathParam("employeeID") String empID);

    @GET
    @Path("/employees")
    @Produces({ "application/json" })
    List<Root> listEmployee();

    @POST
    @Path("/create")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    Response addEmployee(Root movie);

    @PUT
    @Path("/updatemovie")
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    Response updateMovie(Root movie);

    @DELETE
    @Path("/deletemovie")
    Response deleteMovie(@QueryParam("imdbId") String imdbId);

}
