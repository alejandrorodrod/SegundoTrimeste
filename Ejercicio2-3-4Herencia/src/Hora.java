public class Hora {
    //Se declaran los atributos
    private int hora;
    private int minuto;

    //Se crea el constructor
    public Hora(int hora, int minuto) {
        if  (hora < 0 || hora > 23) {
            this.hora = hora;
        }

        if (minuto < 0 || minuto > 59) {
            this.minuto = minuto;
        }
    }

    //Se hacen los métodos
    public void inc() {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            if (this.hora < 24) {
                this.hora++;
            } else if (this.hora == 24) {
                this.hora = 0;
            }
        }
    }

    public boolean setMinuto(int minuto) {
        boolean valido = false;

        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
            valido = true;
        }

        return valido;
    }

    public boolean setHora(int hora) {
        boolean valido = false;

        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            valido = true;
        }

        return valido;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    @Override
    public String toString() {
        String res = "";

        res += this.hora + ":" + this.minuto;

        return res;
    }
}
