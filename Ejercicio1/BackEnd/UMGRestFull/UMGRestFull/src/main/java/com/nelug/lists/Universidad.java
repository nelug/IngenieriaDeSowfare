/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nelug.lists;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Universidad {
     
    private String nombre;
    private String curso;    
    private String fecha;

     
    public Universidad() {}
     
    public Universidad(String nombre, String curso, String fecha) {
        this.nombre = nombre;
        this.curso  = curso;
        this.fecha = fecha;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getCurso() {
        return curso;
    }
 
    public void setCurso(String curso) {
        this.curso = curso;
    }
 
    public String getFecha() {
        return fecha;
    }
 
    public void setName(String fecha) {
        this.fecha = fecha;
    }
}