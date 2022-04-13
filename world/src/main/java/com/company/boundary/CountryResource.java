/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.boundary;

import com.company.control.CountryStore;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author tss
 */
@Path("/countries")

public class CountryResource {
    
    @Inject
    CountryStore store;
    
/*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Country> allPage(@DefaultValue("1") @QueryParam("page") int page, @DefaultValue("10") @QueryParam("size") int size){
        return store.allPage(page, size);
    }
*/
}
