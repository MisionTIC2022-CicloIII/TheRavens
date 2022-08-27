package proyect_the_ravens.src;

public class Empleado {
    private String nombre, correo , empresa, rol;

    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        if(rol == "administrador" || rol == "operativo") {
            this.rol = rol;
        }else{
            this.rol = "operativo";
        }
    }

    public Empleado() {
        this.nombre = "";
        this.correo = "";
        this.empresa = "";
        this.rol="";
    }









    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}


