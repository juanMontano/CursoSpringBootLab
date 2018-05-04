package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher {
    @Id
     //evita que se persista el field / attributo id en base de datos
    private String id;

    private  long ci;

    private  String name;

    private String direccion;

    // fix error adding default constructor
    public Teacher(){

    }
    public Teacher(long ci, String name, String direccion) {
        this.ci = ci;
        this.name = name;
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
