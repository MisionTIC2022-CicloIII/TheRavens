package com.TheRavens.proyecto.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String documento;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "empresas", fetch = FetchType.LAZY)
    private List<MovimientoDinero> movimiento;
}
