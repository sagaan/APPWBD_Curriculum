package com.appwbd.practica.spring.controller;


import com.appwbd.practica.spring.model.CurriculumVitae;
import com.appwbd.practica.spring.model.Estudios;
import com.appwbd.practica.spring.model.Experiencia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Controller
@RequestMapping("/curriculum")
public class CVController {

    @GetMapping("/datos")
    public String obtenerDatos(Model model){
        CurriculumVitae cv = new CurriculumVitae();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yyyy");

        cv.setNombre("Andrés");
        cv.setApellidoPaterno("Salgado");
        cv.setApellidoMaterno("Garzón");
        cv.setEdad(21);
        cv.setDireccion("Margaritas #127");
        cv.setEmail("salgadoa@uabc.edu.mx");
        cv.setTelefono("6461968561");
        cv.setImagen("/img/Imagen2.jpeg");

        Estudios estudios = new Estudios();
        cv.setEstudiosList(new ArrayList<>());
        estudios.setEscuela("Colegio Niños Heroes");
        estudios.setGrado("Primaria");
        estudios.setAnyoInicio(2004);
        estudios.setAnyoFin(2010);
        cv.getEstudiosList().add(estudios);

        estudios = new Estudios();
        estudios.setEscuela("Patria");
        estudios.setGrado("Secundaria");
        estudios.setAnyoInicio(2010);
        estudios.setAnyoFin(2013);
        cv.getEstudiosList().add(estudios);

        estudios = new Estudios();
        estudios.setEscuela("Patria");
        estudios.setGrado("Preparatoria");
        estudios.setAnyoInicio(2013);
        estudios.setAnyoFin(2016);
        cv.getEstudiosList().add(estudios);

        estudios = new Estudios();
        estudios.setEscuela("Universidad Autonoma de Baja California Sur");
        estudios.setGrado("Licenciatura");
        estudios.setAnyoInicio(2016);
        estudios.setAnyoFin(2020);
        cv.getEstudiosList().add(estudios);

        Experiencia experience = new Experiencia();
        cv.setExperienciaList(new ArrayList<>());
        experience.setEmpresa("Soluciones En Informatica A.C.");
        experience.setPuesto("Becario");
        experience.setSuperior("Jonathan Montaño Rojas");
        experience.setEmail("contacto@SIAC.org");
        experience.setTelefono("6861995302");
        try {
            experience.setInicio(simpleDateFormat.parse("10/2019"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            experience.setFin(simpleDateFormat.parse("01/2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        experience.setRazonSalida("Termine mis estudios y me mude de la ciudad");
        cv.getExperienciaList().add(experience);

        experience = new Experiencia();
        experience.setEmpresa("Consultoria de Software Aplicado S.A. de C.V.");
        experience.setPuesto("Analista");
        experience.setSuperior("Antonio Lecuanda Lizarraga");
        experience.setEmail("recursoshumanos@CSA.com.mx");
        experience.setTelefono("6461968516");
        try {
            experience.setInicio(simpleDateFormat.parse("04/2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            experience.setFin(simpleDateFormat.parse("12/2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        experience.setRazonSalida("Falta de oportunidades de crecimiento");
        cv.getExperienciaList().add(experience);

        cv.setConocimientosList(new ArrayList<>());
        cv.getConocimientosList().add("Ingles Hablado 85% Escrito 95%");
        cv.getConocimientosList().add("DataCamp SQL");
        cv.getConocimientosList().add("Lenguajes de Programacion: PHP, C#, C++, C, HTML, CSS, Java, SQL");

        model.addAttribute("cv",cv);

        return "Curriculum";
    }

}
