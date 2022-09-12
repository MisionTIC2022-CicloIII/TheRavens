//package com.TheRavens.proyecto.Servicios;
//
//import com.TheRavens.proyecto.Entidades.Empleado;
//import com.TheRavens.proyecto.Entidades.Perfil;
//import com.TheRavens.proyecto.Repositorios.EmpleadoRepositorio;
//import com.TheRavens.proyecto.Repositorios.PerfilRepositorio;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class PerfilServicios {
//    @Autowired
//    PerfilRepositorio perfilRepositorio;
//
//    public void crearYactualizarPerfil(Perfil perfil){
//        perfilRepositorio.save(perfil);
//    }
//    public List<Perfil> verPerfil(){
//        List<Perfil> perfil = new ArrayList<Perfil>();
//        perfil.addAll(perfilRepositorio.findAll());
//        return perfil;
//    }
//    public void eliminarPerfil(String id){
//        perfilRepositorio.deleteById(id);
//    }
//}
