package com.uabc.edu.arquitectura.ejemploarquitectura.repository;

import com.uabc.edu.arquitectura.ejemploarquitectura.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends
        JpaRepository<Empleado,Integer> {



}
