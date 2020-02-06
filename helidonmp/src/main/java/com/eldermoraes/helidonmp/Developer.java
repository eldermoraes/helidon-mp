/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eldermoraes.helidonmp;

/**
 *
 * @author eldmorae
 */
class Developer {
    
    private Long id;
    private String name;
    
    public Developer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Developer() {
    }


    protected Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
    
    
    
}
