/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nelug.umgrestfull;

import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;
 
 
@ApplicationPath("/")
public class restTarea1 extends PackagesResourceConfig {
 
    public restTarea1() {
        super("com.nelug.restTarea1.v1.implementacion");
    }
}