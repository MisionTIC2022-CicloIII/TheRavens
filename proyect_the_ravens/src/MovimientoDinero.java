package proyect_the_ravens.src;

public class MovimientoDinero {

    private String Concepto, user, tipo ;
    private double valor ;

    public MovimientoDinero(String concepto, String user, String tipo, double valor) {
        this.Concepto = concepto;
        this.user = user;
        this.tipo = tipo;
        this.valor = valor;
    }

    public MovimientoDinero() {
        this.Concepto = "";
        this.user = "";
        this.tipo = "";
        this.valor = 0;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
