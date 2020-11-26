package com.curso.dominios.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("factura")
public class Factura {
    private @Id
    Integer id;
    private String lineasFactura;

    public String getDescripcion() {
        return lineasFactura;
    }

    public void setDescripcion(String descripcion) {
        this.lineasFactura = descripcion;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
