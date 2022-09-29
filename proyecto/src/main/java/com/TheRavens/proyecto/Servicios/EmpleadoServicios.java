//package com.TheRavens.proyecto.Servicios;
//
//import com.TheRavens.proyecto.Entidades.Empleado;
//import com.TheRavens.proyecto.Repositorios.EmpleadoRepositorio;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class EmpleadoServicios {
//    @Autowired
//    EmpleadoRepositorio empleadoRepositorio;
//
//    public void crearYactualizarEmpleado(Empleado empleado){
//        empleadoRepositorio.save(empleado);
//    }
//    public List<Empleado> verEmpleado(){
//        List<Empleado> empleados = new ArrayList<Empleado>();
//        empleados.addAll(empleadoRepositorio.findAll());
//        return empleados;
//    }
//    public void eliminarEmpleado(Long id){
//        empleadoRepositorio.deleteById(id);
//    }
//
//}
