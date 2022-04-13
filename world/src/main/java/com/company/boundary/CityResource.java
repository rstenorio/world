package com.company.boundary;

import com.company.control.CityStore;
import com.company.entity.City;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
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
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public City find(@PathParam("id") Long id) {
        return store.find(id).orElseThrow(() -> new NotFoundException());
    }
    
}
