package com.TheRavens.proyecto.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "movimientoDinero")
@AllArgsConstructor
@NoArgsConstructor

public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String concepto;

    @Column(nullable = false)
    private float monto;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleados;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresas;


}
