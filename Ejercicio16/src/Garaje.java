public class Garaje {

    //Se declaran los atributos
    private Coche coche;
    private String averia;
    private int numeroCoches;

    //Se declaran los métodos
    public boolean aceptarCoche(Coche c, String averia) {
        boolean aceptado = false;

        if (this.coche == null) {
            this.coche = c;
            this.averia = averia;
            aceptado = true;
            this.numeroCoches++;
        }

        return aceptado;
    }

    public void devolverCoche() {
        this.coche = null;
    }
}
