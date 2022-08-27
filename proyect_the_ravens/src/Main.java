package proyect_the_ravens.src;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //empresas
        Empresa coca_cola = new Empresa("Coca-Cola", "Estados Unidos", "3125678904", "1");
        Empresa Pepsi = new Empresa("Pepsi", "Estados Unidos", "3124567809", "2");
        Empresa malta = new Empresa("Pony-Malta", "colombia", "3456127856", "3");

        //empleados
        Empleado juan_jose = new Empleado("juan jose ", "juanjoduran2003@gmail.com", "1", "operativo");
        Empleado linda = new Empleado("Linda Avendaño Bautista ", "lindajaz@hotmail.com", "3", "administrador");
        Empleado merly = new Empleado("Merly Tatiana Campo Guevara ", "merlycampogue@hotmail.com", "1", "operativo");
        Empleado alfredo = new Empleado("Alfredo ALonso Gil Cuello", "gilcuello@gmail.com", "2", "operativo");
        Empleado deiver = new Empleado("Deyber Antonio Jiménez Gordillo ", "deyberantonio@gmail.com", "2", "operativo");

        //pruebas Alfredo Gil
        Empleado carlos = new Empleado("Carlos Arturo Salcedo Rivera", "carlos@gmail.com", "3", "operativo");

        //movimientos
        MovimientoDinero primero =new MovimientoDinero("compra mc ","juanjoduran2003@gmail.com","negativo",50000);
        MovimientoDinero segundo =new MovimientoDinero("compra casa", "merlycampogue@hotmail.com", "positivo", 1000000);

        //EMPRESA
        System.out.println(coca_cola.getDireccion());
        coca_cola.setDireccion("colombia");
        System.out.println(coca_cola.getDireccion());

        System.out.println(coca_cola.getNit());
        coca_cola.setNit("4");
        System.out.println(coca_cola.getNit());

        System.out.println(coca_cola.getNombre());
        coca_cola.setNombre("jet");
        System.out.println(coca_cola.getNombre());

        System.out.println(coca_cola.getTelefono());
        coca_cola.setTelefono("3148658092");
        System.out.println(coca_cola.getTelefono());


        //empleado
        System.out.println(alfredo.getRol());
        alfredo.setRol("admministrador");
        System.out.println(alfredo.getRol());

        System.out.println(alfredo.getCorreo());
        alfredo.setCorreo("alfredo@strange.com");
        System.out.println(alfredo.getCorreo());

        System.out.println(alfredo.getEmpresa());
        alfredo.setEmpresa("1");
        System.out.println(alfredo.getEmpresa());

        System.out.println(alfredo.getNombre());
        alfredo.setNombre("alferero guzman");
        System.out.println(alfredo.getNombre());

        //prueba Alfredo Gil
        System.out.println(carlos.getNombre());

        //movimiento dinero
        System.out.println(primero.getConcepto());
        primero.setConcepto("pollo");
        System.out.println(primero.getConcepto());

        System.out.println(primero.getTipo());
        primero.setTipo("positivo");
        System.out.println(primero.getTipo());

        System.out.println(primero.getUser());
        primero.setUser("juanjoduran2003@hotmail.com");
        System.out.println(primero.getUser());

        System.out.println(primero.getValor());
        primero.setValor(5000000);
        System.out.println(primero.getValor());

//<<<<<<< HEAD


//=======
        //Pruebas Merly
        System.out.println(segundo.getConcepto());
        segundo.setConcepto("carro");
        System.out.println(segundo.getConcepto());

        System.out.println(segundo.getTipo());
        segundo.setTipo("negativo");
        System.out.println(segundo.getTipo());

        System.out.println(segundo.getUser());
        segundo.setUser("micafe08@hotmail.com");
        System.out.println(segundo.getUser());
//>>>>>>> 538b4d2bd6330c0795e55845b0178fc88d06577e


        //prueba Deyber Jimenez
        System.out.println(deiver.getCorreo());
        deiver.setCorreo("deyber.jimenez@unillanos.edu.co");
        System.out.println(deiver.getCorreo());
    }
}