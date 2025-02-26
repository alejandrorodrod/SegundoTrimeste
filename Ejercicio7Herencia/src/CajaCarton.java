public class CajaCarton extends Caja {
    //Se declaran los atributos a usar
    private String unidad;

    public CajaCarton(int ancho, int alto, int fondo, String unidad) {
        super(ancho, alto, fondo, "cm");
    }

    @Override
    public double getVolumen() {
        double volumen;
        volumen = super.getVolumen() * 0.8;
        volumen = volumen * Math.pow(10,6);
        return volumen;
    }

    public int getSuperficie() {
        int superficie;
        int ancho = super.getANCHO();
        int alto = super.getALTO();
        int fondo = super.getFONDO();

        superficie = 2*ancho*alto + 2*alto*fondo + 2*ancho*fondo;

        return superficie;
    }
}
