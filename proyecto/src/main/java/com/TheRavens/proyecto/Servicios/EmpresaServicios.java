//package com.TheRavens.proyecto.Servicios;
//
//import com.TheRavens.proyecto.Entidades.Empleado;
//import com.TheRavens.proyecto.Entidades.Empresa;
//import com.TheRavens.proyecto.Repositorios.EmpleadoRepositorio;
//import com.TheRavens.proyecto.Repositorios.EmpresaRepositorio;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class EmpresaServicios {
//    @Autowired
//    EmpresaRepositorio empresaRepositorio;
//
//    public void crearYactualizarEmpresa(Empresa empresa){
//        empresaRepositorio.save(empresa);
//    }
//    public List<Empresa> verEmpresa(){
//        List<Empresa> empresa = new ArrayList<Empresa>();
//        empresa.addAll(empresaRepositorio.findAll());
//        return empresa;
//    }
//    public void eliminarEmpresa(Long id){
//        empresaRepositorio.deleteById(id);
//    }
//
//}
