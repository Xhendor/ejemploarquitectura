package com.uabc.edu.arquitectura.ejemploarquitectura.service;

import com.uabc.edu.arquitectura.ejemploarquitectura.model.Empleado;
import com.uabc.edu.arquitectura.ejemploarquitectura.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {


    @Autowired
    private EmpleadoRepository repo;


    public List<Empleado> getEmpleados(){

        return repo.findAll();
    }

    public Optional<Empleado> getEmpleadoById(Integer id){

        return repo.findById(id);
    }

    public void saveEmpleado(Empleado emp){

        repo.save(emp);
    }

    public void deleteEmpleado(Integer id){

        repo.deleteById(id);
    }
}
