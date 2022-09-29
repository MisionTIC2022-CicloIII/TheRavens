//package com.TheRavens.proyecto.Entidades;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.apache.catalina.User;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Getter
//@Setter
//@Entity
//@JsonIgnoreProperties({"perfil"})
//@Table(name = "perfil")
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class Perfil {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String id;
//
//    @Column(nullable = false)
//    private String imagen;
//
//    @Column(nullable = false)
//    private String telefono;
//
//    @Column(nullable = false)
//    private User usuario;
//
//    @Column(nullable = false)
//    private Date createdAt;
//
//    @Column(nullable = false)
//    private Date updatedAt;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "empleado_id")
//    private Empleado empleado;
//
//
//}
