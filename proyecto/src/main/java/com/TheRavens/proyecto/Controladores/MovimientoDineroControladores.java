package com.TheRavens.proyecto.Controladores;

import com.TheRavens.proyecto.Entidades.Empleado;
import com.TheRavens.proyecto.Entidades.MovimientoDinero;
import com.TheRavens.proyecto.Servicios.EmpleadoServicios;
import com.TheRavens.proyecto.Servicios.MovimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoDineroControladores {
    @Autowired
    MovimientoDineroServicios movimientoDineroServicios;

    @PostMapping("/movimientodinero")
    private void crearYactualizarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        movimientoDineroServicios.crearYactualizarMovimiento(movimientoDinero);
    }

    @GetMapping("/movimientodinero")
    private List<MovimientoDinero> verMovimientoDinero(){

        return movimientoDineroServicios.verMovimientoDinero();
    }

    @DeleteMapping("/movimientodinero/{id}")
    private void eliminarMovimientoDinero(@PathVariable("id") Long id){
        movimientoDineroServicios.eliminarMovimientoDinero(id);

    }

    @PutMapping("/movimientodinero")
    private void editarMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        movimientoDineroServicios.crearYactualizarMovimiento(movimientoDinero);
    }
}
