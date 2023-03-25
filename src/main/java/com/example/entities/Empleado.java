package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;



public class Empleado implements Serializable {



    private int id;

    private String nombre;
    private String apellidos;

    private LocalDate fechaAlta;
    private Genero genero;

    private Departamento departamento;


    private List<Telefono> telefonos;

    private List<Correo> correos;

    
    public enum Genero {
        HOMBRE, MUJER, OTRO
    }
    
}
