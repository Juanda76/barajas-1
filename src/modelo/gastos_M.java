package modelo;

// @author Software_Max M_O
public class gastos_M {

    private int id;
    private String fecha;
    private String concepto;
    private int valor;
    private String registra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getRegistra() {
        return registra;
    }

    public void setRegistra(String registra) {
        this.registra = registra;
    }

}
