package com.eldermoraes.helidonmp;


import java.util.Random;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eldmorae
 */
@Readiness
public class ReadyCheck implements HealthCheck{

    @Override
    public HealthCheckResponse call() {
        if (isReady()){
            return HealthCheckResponse.up("I'm live and ready!");
        } else{
            return HealthCheckResponse.down("I'm live, but not ready...");
        }
    }
    
    private boolean isReady(){
        return new Random().nextBoolean();
    }
    
}
