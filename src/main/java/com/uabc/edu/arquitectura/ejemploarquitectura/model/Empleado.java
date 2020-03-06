package com.uabc.edu.arquitectura.ejemploarquitectura.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity(name = "EMPLEADO")
public class Empleado {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEmpleado;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column( name = "apellido_paterno",nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno",nullable = false)
    private String apellidoMaterno;

    @Column(name = "correo",nullable = false)
    private String email;

}
