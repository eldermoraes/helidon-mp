/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.helidonmp;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author eldmorae
 */
@ApplicationScoped
public class DeveloperRepository {
    
    private final List<Developer> developers = new ArrayList<>();

    public List<Developer> getDevelopers() {
        return developers;
    }
    
    public Developer add(Developer developer){
        developers.add(developer);
        return developer;
    }
    
}
