package com.uabc.edu.arquitectura.ejemploarquitectura.controller;


import com.uabc.edu.arquitectura.ejemploarquitectura.model.Empleado;
import com.uabc.edu.arquitectura.ejemploarquitectura.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping("empleado")
    @ResponseBody
    public ResponseEntity<List> getEmpleado(){

        return new ResponseEntity<List>(
                empleadoService.getEmpleados(),
                HttpStatus.OK);
    }
    @GetMapping("empleado/get/{id}")
    @ResponseBody
    public ResponseEntity<Optional<Empleado>> getEmpleado(
            @PathVariable("id")  Integer id){

        return new ResponseEntity<Optional<Empleado>>(
                empleadoService.getEmpleadoById(id),
                HttpStatus.OK);
    }

    @GetMapping("empleado/delete/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteEmpleado(
            @PathVariable("id")  Integer id){

            empleadoService.deleteEmpleado(id);

            return new ResponseEntity<String>
                    ("Todo fine",
                    HttpStatus.OK);
    }

    @PostMapping(name = "empleado/save")
    public ResponseEntity<String> saveEmpleado(
            @RequestBody Empleado emp){

        empleadoService.saveEmpleado(emp);

        return new ResponseEntity<String>
                ("Todo fine",
                        HttpStatus.OK);
    }



}
