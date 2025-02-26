public class Ordenador {

    //Se declaran los atributos a usar
    private String modelo;
    private String cpu;
    private int tamanioDiscoDuro;
    private int tamanioRam;
    private double precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getTamanioDiscoDuro() {
        return tamanioDiscoDuro;
    }

    public void setTamanioDiscoDuro(int tamanioDiscoDuro) {
        this.tamanioDiscoDuro = tamanioDiscoDuro;
    }

    public int getTamanioRam() {
        return tamanioRam;
    }

    public void setTamanioRam(int tamanioRam) {
        this.tamanioRam = tamanioRam;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}