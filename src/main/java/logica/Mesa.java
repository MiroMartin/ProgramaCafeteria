package logica;

public class Mesa {
    private int numMesa;
    private String nomCamarero;
    private Articulos articulos;

    public Mesa() {
    }

    public Mesa(int numMesa, String nomCamarero, Articulos articulos) {
        this.numMesa = numMesa;
        this.nomCamarero = nomCamarero;
        this.articulos = articulos;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getNomCamarero() {
        return nomCamarero;
    }

    public void setNomCamarero(String nomCamarero) {
        this.nomCamarero = nomCamarero;
    }

    public Articulos getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulos articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero de Mesa=" + numMesa +
                ", Nombre del Camarero='" + nomCamarero + '\'' +
                ", articulos: " + articulos +
                '}';
    }
}
