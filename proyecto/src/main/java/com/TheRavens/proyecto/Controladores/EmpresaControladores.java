//package com.TheRavens.proyecto.Controladores;
//
//import com.TheRavens.proyecto.Entidades.Empleado;
//import com.TheRavens.proyecto.Entidades.Empresa;
//import com.TheRavens.proyecto.Servicios.EmpleadoServicios;
//import com.TheRavens.proyecto.Servicios.EmpresaServicios;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class EmpresaControladores {
//    @Autowired
//    EmpresaServicios empresaServicios;
//
//    @PostMapping("/empresa")
//    private void crearYactualizarEmpresa(@RequestBody Empresa empresa){
//        empresaServicios.crearYactualizarEmpresa(empresa);
//    }
//
//    @GetMapping("/empresa")
//    private List<Empresa> verEmpresa(){
//
//        return empresaServicios.verEmpresa();
//    }
//
//    @DeleteMapping("/empresa/{id}")
//    private void eliminarEmpresa(@PathVariable("id") Long id){
//        empresaServicios.eliminarEmpresa(id);
//
//    }
//
//    @PatchMapping("/empresa/{id}")
//    private void editarEmpresa(@RequestBody Empresa empresa){
//        empresaServicios.crearYactualizarEmpresa(empresa);
//    }
//
//}
