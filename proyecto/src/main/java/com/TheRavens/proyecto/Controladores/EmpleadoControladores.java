package com.TheRavens.proyecto.Controladores;

import com.TheRavens.proyecto.Entidades.Empleado;
import com.TheRavens.proyecto.Servicios.EmpleadoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoControladores {
    @Autowired
    EmpleadoServicios empleadoServicios;

    @PostMapping("/empleado")
    private void crearYactualizarEmpleado(@RequestBody Empleado empleado){
        empleadoServicios.crearYactualizarEmpleado(empleado);
    }

    @GetMapping("/empleado")
    private List<Empleado> verEmpleado(){
        return empleadoServicios.verEmpleado();
    }

    @DeleteMapping("/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id") Long id){
        empleadoServicios.eliminarEmpleado(id);

    }

    @PutMapping("/empleado")
    private void editarEmpleado(@RequestBody Empleado empleado){
        empleadoServicios.crearYactualizarEmpleado(empleado);
    }

}
