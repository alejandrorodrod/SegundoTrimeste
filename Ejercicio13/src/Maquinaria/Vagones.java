package Maquinaria;

public class Vagones {

    //Se declaran las variables a usar
    private int numero;
    private double cargaMaxima;
    private double cargaActual;
    private String mercanciaTransporta;

    public Vagones(int numero, double cargaMaxima, double cargaActual, String mercanciaTransporta) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.mercanciaTransporta = mercanciaTransporta;
    }
}
