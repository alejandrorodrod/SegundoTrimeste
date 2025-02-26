public  class HoraExacta extends Hora{

    //Se declaran los atributos
    private int segundos;

    //Se hace el constructor
    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);

        if (segundos < 0 || segundos > 59) {
            this.segundos = segundos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos > 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }

    public void inc() {
        this.segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            super.inc();
        }
    }

    public boolean horasIguales(HoraExacta hora) {
        boolean horasIguales = false;

        if (this.getHora() == hora.getHora()) {
            if  (this.getMinuto() == hora.getMinuto()) {
                if (this.segundos == hora.segundos) {
                    horasIguales = true;
                }
            }
        }

        return horasIguales;
    }
}
