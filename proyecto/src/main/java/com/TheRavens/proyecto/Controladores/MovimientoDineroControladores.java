package com.TheRavens.proyecto.Controladores;

//import com.TheRavens.proyecto.Entidades.Empleado;

import com.TheRavens.proyecto.Entidades.MovimientoDinero;
import com.TheRavens.proyecto.Entidades.User;
import com.TheRavens.proyecto.Servicios.MovimientoDineroServicios;
import com.TheRavens.proyecto.Servicios.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.lang.Long;

@Controller
public class MovimientoDineroControladores{
    @Autowired
    MovimientoDineroServicios movimientoDineroServicios;

    UserService userService;

    public MovimientoDineroControladores(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal != null) {
            User user = this.userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        }
        return "index";
    }

    @GetMapping("/movimientodinero")
    private String verMovimientoDinero(Model model){
        model.addAttribute("movimientos", movimientoDineroServicios.verMovimientoDinero());
        return "movimientodinero";
    }
    @GetMapping("/nuevomovimiento")
    private String nuevoRegistroMovimiento(MovimientoDinero movimientodinero){
        return "nuevomovimiento";
    }

    @PostMapping("/movimientodinero")
    private String crearYactualizarMovimiento(MovimientoDinero movimientoDinero){
        movimientoDineroServicios.crearYactualizarMovimiento(movimientoDinero);
        return "redirect:/movimientodinero";
    }

    @GetMapping("/movimientodinero/borrar/{id}")
    private String eliminarMovimientoDinero(@PathVariable("id") Long id){
        movimientoDineroServicios.eliminarMovimientoDinero(id);
        return "redirect:/movimientodinero";
    }

//    @GetMapping("/movimientodinero/editar/{id}")
//    private String verMovimientoDinero(@PathVariable("id") Long id, Model model){
//        MovimientoDinero movimientodinero = movimientoDineroServicios.verMovimientoDinero(id);
//        model.addAttribute("movimientodinero", movimientodinero);
//        return "editarmovimiento";
//    }
//
//    @PostMapping("/movimientodinero/actualizar/{id}")
//    private String editarMovimientoDinero(@PathVariable("id") Long id, MovimientoDinero movimientoDinero){
//        movimientoDineroServicios.crearYactualizarMovimiento(movimientoDinero);
//        return "redirect:/movimientodinero";
//    }
}
