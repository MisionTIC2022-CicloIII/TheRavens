package proyect_the_ravens.src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //empresas
        Empresa coca_cola = new Empresa("Coca-Cola", "Estados Unidos", "3125678904", "1");
        Empresa Pepsi = new Empresa("Pepsi", "Estados Unidos", "3124567809", "2");
        Empresa malta = new Empresa("Pony-Malta", "colombia", "3456127856", "3");

        //empleados
        Empleado juan_jose = new Empleado("juan jose ", "juanjoduran2003@gmail.com", "1", "operativo");
        Empleado linda = new Empleado("Linda Avendaño Bautista ", "lindajaz@hotmail.com", "3", "iooo");
        Empleado merly = new Empleado("Merly Tatiana Campo Guevara ", "merlycampogue@hotmail.com", "1", "operativo");
        Empleado alfredo = new Empleado("Alfredo ALonso Gil Cuello", "gilcuello@gmail.com", "2", "operativo");
        Empleado deiver = new Empleado("Deyber Antonio Jiménez Gordillo ", "deyberantonio@gmail.com", "2", "operativo");

        //movimientos
        MovimientoDinero primero =new MovimientoDinero("compra mc ","juanjoduran2003@gmail.com","negativo",50000);

        System.out.println(coca_cola.getDireccion());
        System.out.println(coca_cola.getNit());
        System.out.println(coca_cola.getNombre());
        coca_cola.setNombre("jet");
        System.out.println(coca_cola.getNombre());

        System.out.println(linda.getRol());
    }
}