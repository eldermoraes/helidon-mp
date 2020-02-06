/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.helidonmp;

import java.util.HashSet;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author eldmorae
 */
@Path("/developers")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DeveloperResource {
    
    @Inject
    private DeveloperRepository developerRepository;
    
    
    @GET        
    public Response getDevelopers(){
        System.out.println("developerRepository.getDevelopers(): " + developerRepository.getDevelopers());
        return Response.ok(developerRepository.getDevelopers()).build();
    }
    
    @POST
    public Response newDeveloper(Developer developer){
        System.out.println("developer: " + developer);
        return Response.ok(developerRepository.add(developer)).build();

    }
    
}
