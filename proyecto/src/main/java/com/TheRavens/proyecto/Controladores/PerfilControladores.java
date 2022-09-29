//package com.TheRavens.proyecto.Controladores;
//
//import com.TheRavens.proyecto.Entidades.Empleado;
//import com.TheRavens.proyecto.Entidades.Perfil;
//import com.TheRavens.proyecto.Servicios.EmpleadoServicios;
//import com.TheRavens.proyecto.Servicios.PerfilServicios;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class PerfilControladores {
//    @Autowired
//    PerfilServicios perfilServicios;
//
//    @PostMapping("/perfil")
//    private void crearYactualizarPerfil(@RequestBody Perfil perfil){
//        perfilServicios.crearYactualizarPerfil(perfil);
//    }
//
//    @GetMapping("/perfil")
//    private List<Perfil> verPerfil(){
//        return perfilServicios.verPerfil();
//    }
//
//    @DeleteMapping("/perfil/{id}")
//    private void eliminarPerfil(@PathVariable("id") String id){
//        perfilServicios.eliminarPerfil(id);
//
//    }
//
//    @PutMapping("/perfil")
//    private void editarPerfil(@RequestBody Perfil perfil){
//        perfilServicios.crearYactualizarPerfil(perfil);
//    }
//}
