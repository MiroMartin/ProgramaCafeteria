package logica;

public class Articulos {
    public int codigo;
    public String nombreArt;
    public int precio;

    public Articulos() {
    }

    public Articulos(int codigo, String nombreArt, int precio) {
        this.codigo = codigo;
        this.nombreArt = nombreArt;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "codigo=" + codigo +
                ", nombreArt='" + nombreArt + '\'' +
                ", precio=" + precio +
                '}';
    }
}
