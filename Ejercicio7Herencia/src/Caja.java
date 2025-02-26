public class Caja {
    //Se crean los atributos
    private final int ANCHO;
    private final int ALTO;
    private final int FONDO;
    private String unidad;
    private String etiqueta;

    //Se hace el constructor
    public Caja(int ancho, int alto, int fondo, String unidad) {
        this.ANCHO = ancho;
        this.ALTO = alto;
        this.FONDO = fondo;
        this.etiqueta = "";
        unidad = unidad.toLowerCase();
        if (unidad.equals("cm") || unidad.equals("m")) {
            this.unidad = unidad;
        } else {
            this.unidad = "cm";
        }
    }

    //Se hacen los otros métodos
    public double getVolumen(){
        double volumen = 0;

        volumen= ANCHO * ALTO * FONDO;

        if(this.unidad.equals("cm")) {
            volumen = volumen / Math.pow(10, 6);
        }

        return volumen;
    }

    public void setEtiqueta(String etiqueta){
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            this.etiqueta = etiqueta.substring(0, 30);
        }
    }

    @Override
    public String toString(){
        String datos = "Ancho: " + ANCHO + "\n" + "Alto: " + ALTO + "\n" + "Fondo: " + FONDO + "\n" + "Unidad: " + unidad;

        return datos;
    }

    public int getANCHO() {
        return ANCHO;
    }

    public int getALTO() {
        return ALTO;
    }

    public int getFONDO() {
        return FONDO;
    }
}
