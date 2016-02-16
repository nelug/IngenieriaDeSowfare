/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nelug.implementacion;

import com.nelug.lists.Universidad;
import com.nelug.resourse.universidadResource;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;
 
// Set the path, version 1 of API
@Path("/v1/universidad")
public class universidadImpl implements universidadResource{
 
    @Override
    public List<Universidad> getUniversidad() {
        List<Universidad> data = new ArrayList<Universidad>();
        data.add(new Universidad("Universidad Mariano Galvez, Guatemala", "Ingenieria de Sofware", "Sabado 20 de Febrero de 2016"));
        
        return data;
    }
}