//Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad en segundos.
// El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo.
// Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora, minuto y segundo.
// Los valores de los atributos se controlarán mediante métodos get/set.
public class Hora {

    //Se declaran los atributos a usar
    private int hora;
    private int minuto;
    private int segundo;

    //Se declara el constructor
    public Hora() {

    }

    //Se declaran los métodos
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        //Se muestra la hora actual
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public void aumentarUnSegundo (int segundos) {
        //Se comprueba si se ha añadido una cantidad válida

        if (segundos >= 0) {
            this.segundo += 1;

            //Se comprueba si el segundo es 60
            if (this.segundo > 59) {
                this.segundo = 0;
                this.minuto += 1;

                //Se comprueba si el minuto es 60
                if (this.minuto > 59) {
                    this.minuto = 0;
                    this.hora += 1;

                    //Se comprueba si la hora es 24
                    this.hora = 0;
                }
            }
        } else {
            System.out.println("No puede introducir una cantidad negativa de segundos");
        }
    }
}