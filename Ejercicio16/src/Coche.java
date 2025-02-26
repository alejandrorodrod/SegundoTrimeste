public class Coche {
    //Se declaran los atributos a usar
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAverias;

    //Se crean los constructores
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(200);
        this.precioAverias = 0.0;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getAverias() {return this.precioAverias;
    }

    //Se hacen los métodos
    public void acumularAverias(double averia) {
        this.precioAverias += averia;
    }
}
