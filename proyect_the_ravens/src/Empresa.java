package proyect_the_ravens.src;

public class Empresa {
    private String Nombre,direccion,telefono,Nit;

    public Empresa(String nombre, String direccion, String telefono, String Nit) {
        this.Nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Nit = Nit;
    }

    public Empresa() {
        this.Nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.Nit = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }
}
