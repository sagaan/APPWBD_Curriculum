package com.appwbd.practica.spring.model;

import lombok.Data;
import java.util.Date;

@Data
public class Experiencia {

    private String empresa;
    private String puesto;
    private String superior;
    private String telefono;
    private String email;
    private Date inicio;
    private Date fin;
    private String razonSalida;

}
