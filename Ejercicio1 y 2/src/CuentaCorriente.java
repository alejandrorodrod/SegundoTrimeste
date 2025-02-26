public class CuentaCorriente {

    //Se declaran los atributos a usar
    private String dni;
    private String nombre;
    private double saldo;

    public CuentaCorriente(String DNI, String nombre) {
        this.dni = DNI;
        this.nombre = nombre;
        this.saldo = 0;
    }

    //Ejercicio 2
    //Se crean constructores que sobrecargan el objeto
    //Solo DNI y saldo
    public CuentaCorriente(String DNI, double saldo) {
        this.dni = DNI;
        this.saldo = saldo;
    }

    //Pide todo
    public CuentaCorriente(String DNI, String nombre, double saldo) {
        this.dni = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Ejercicio 1
    //Se crea el método para sacar dinero
   public boolean sacarDinero(double sacar) {
        //Se hace un boolean para ver si se puede sacar dinero
       boolean sePuedeSacar = false;

        if (this.saldo >= sacar) {
            sePuedeSacar = true;
            this.saldo -= sacar;
        }

        return sePuedeSacar;
   }

   //Se crea el método ingresar dinero
    public void ingresarDinero(double saldo) {
        this.saldo += saldo;
    }

    //Se crea el método que da la información de la cuenta
    public void informacionCuentaCorriente() {
        //Se imprimen los datos de la cuenta

        System.out.println("El DNI del titular de la cuenta es: " + this.dni + "\n"
            + "El nombre del titular de la cuenta es: " + this.nombre + "\n"
            + "El saldo de la cuenta es: " + this.saldo);

    }
}