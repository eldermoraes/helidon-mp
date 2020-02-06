/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.helidonmp;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

/**
 *
 * @author eldmorae
 */
@Path("/developers")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Tag(name = "DeveloperResource", description = "Developer methods")
public class DeveloperResource {
    
    @Inject
    private DeveloperRepository developerRepository;    
    
    @GET        
    public Response getDevelopers(){
        return Response.ok(developerRepository.getDevelopers()).build();
    }
    
    @POST
    public Response newDeveloper(Developer developer){
        return Response.ok(developerRepository.add(developer)).build();
    }
    
}
