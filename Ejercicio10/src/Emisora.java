public class Emisora {
    //Se declaran los atributos a usar
    private double frecuencia;

    //Se genera el constructo
    public Emisora() {
        this.frecuencia = 80;
    }

    //Se declaran los métodos a usar
    public void subirFrecuencia() {
        this.frecuencia += 0.5;

        if (this.frecuencia > 108) {
            this.frecuencia = 80;
        }
    }

    public void bajarFrecuencia() {
        this.frecuencia -= 0.5;

        if (this.frecuencia < 80) {
            this.frecuencia = 108;
        }
    }

    public void mostrarFrecuencia() {
        System.out.printf("%.2fMHz\n",this.frecuencia);
    }
}