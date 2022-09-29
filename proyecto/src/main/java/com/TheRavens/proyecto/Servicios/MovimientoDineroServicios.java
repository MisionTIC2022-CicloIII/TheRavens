package com.TheRavens.proyecto.Servicios;

//import com.TheRavens.proyecto.Entidades.Empleado;
import com.TheRavens.proyecto.Entidades.MovimientoDinero;
//import com.TheRavens.proyecto.Repositorios.EmpleadoRepositorio;
import com.TheRavens.proyecto.Repositorios.MovimientoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroServicios {
    @Autowired
    MovimientoDineroRepositorio movimientoDineroRepositorio;

    public void crearYactualizarMovimiento(MovimientoDinero movimientoDinero){
        movimientoDineroRepositorio.save(movimientoDinero);
    }
    public List<MovimientoDinero> verMovimientoDinero(){
        List<MovimientoDinero> movimientoDineros = new ArrayList<MovimientoDinero>();
        movimientoDineros.addAll(movimientoDineroRepositorio.findAll());
        return movimientoDineros;
    }
    public void eliminarMovimientoDinero(Long id){
        movimientoDineroRepositorio.deleteById(id);
    }
}
