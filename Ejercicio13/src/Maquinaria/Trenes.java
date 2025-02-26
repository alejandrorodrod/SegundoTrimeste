package Maquinaria;

import Personal.Maquinista;

public class Trenes {

    //Se declaran los atributos a usar
    private Locomotora locomotora;
    private Vagones[] vagones;
    private Maquinista maquinista;

    public Trenes(Locomotora locomotora, Vagones[] vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
    }
}
