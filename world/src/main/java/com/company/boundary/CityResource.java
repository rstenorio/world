package com.company.boundary;

import com.company.control.CityStore;
import com.company.entity.City;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/cities")
public class CityResource {

    @Inject
    CityStore store;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<City> allPaged(@DefaultValue("1") @QueryParam("page") int page, @DefaultValue("10") @QueryParam("size") int size) {
        return store.allPage(page, size);
    }

    @GET
    @Path("/byId/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public City findById(@PathParam("id") Long id) {
        return store.find(id).orElseThrow(() -> new NotFoundException());
    }

    @GET
    @Path("/byName/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public City findByName(@PathParam("city") String city) {
        return store.findByName(city).orElseThrow(() -> new NotFoundException());
    }

    @POST
    @Path("{code}")
    @Consumes(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public void save(@PathParam("code") String code, @Valid City entity) {
//        return Response.status(Response.Status.CREATED)
//                .entity(store.save(entity))
//                .build();
        store.save(entity);
    }
    
    

}
