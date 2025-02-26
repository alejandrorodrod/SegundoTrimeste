package Maquinaria;

import Personal.Mecanico;

public class Locomotora {

    //Se declaran las variables a usar
    private int matricula;
    private int potencia;
    private String antiguedad;
    private Mecanico mecanico;

    public Locomotora(int matricula, int potencia, String antiguedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }
}
