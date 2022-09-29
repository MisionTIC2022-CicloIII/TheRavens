//package com.TheRavens.proyecto.Entidades;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Getter
//@Setter
//@Entity
//@JsonIgnoreProperties({"empleado"})
//@Table(name = "empleado")
//@AllArgsConstructor
//@NoArgsConstructor
//public class Empleado {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String correo;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "perfil_id")
//    private Perfil perfil;
//
//    @Column(nullable = false)
//    @Enumerated(value = EnumType.STRING)
//    private Enum_RoleName rol;
//
//    @ManyToOne
//    @JoinColumn(name = "empresa_id")
//    private Empresa empresas;
//
//    @OneToMany(mappedBy = "empleados", fetch = FetchType.LAZY)
//    private List<MovimientoDinero> movimiento;
//}
