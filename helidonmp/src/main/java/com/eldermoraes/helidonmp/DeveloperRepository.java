/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.helidonmp;

import java.util.HashSet;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Metered;

/**
 *
 * @author eldmorae
 */
@ApplicationScoped
public class DeveloperRepository {
    
    private final HashSet<Developer> developers = new HashSet<>();

    @Metered
    public HashSet<Developer> getDevelopers() {
        return developers;
    }
    
    @Counted
    public Developer add(Developer developer){
        developers.add(developer);
        return developer;
    }
    
}
