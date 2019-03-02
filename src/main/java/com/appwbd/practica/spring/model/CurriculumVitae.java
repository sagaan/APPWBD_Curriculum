package com.appwbd.practica.spring.model;

import lombok.Data;
import java.util.List;

@Data
public class CurriculumVitae {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String direccion;
    private String telefono;
    private String email;
    private String imagen;
    private List<Estudios> estudiosList;
    private List<Experiencia> experienciaList;
    private List<String> conocimientosList;

}
