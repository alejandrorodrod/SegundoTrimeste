public class Cuenta {

    //Se declaran los atributos
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Se crean los constructores
    public Cuenta() {}

    public Cuenta(String nombre, String numero, double interes, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numero;
        this.tipoInteres = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta cuenta) {
        this.nombre = cuenta.nombre;
        this.numeroCuenta = cuenta.numeroCuenta;
        this.tipoInteres = cuenta.tipoInteres;
        this.saldo = cuenta.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numero) {
        this.numeroCuenta = numero;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double interes) {
        this.tipoInteres = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double ingreso) {
        boolean ingresoPosible = false;

        if (ingreso > 0) {
            this.saldo += ingreso;
            ingresoPosible = true;
        }

        return ingresoPosible;
    }

    public boolean reintegro(double reintegro) {
        boolean reintegroPosible = false;

        if (reintegro > 0 && reintegro < saldo) {
            this.saldo -= reintegro;
            reintegroPosible = true;
        }

        return reintegroPosible;
    }

    public void transferencia(Cuenta cuenta, double importe) {

        if (importe <= this.saldo) {
            this.setSaldo(this.saldo - importe);
            cuenta.setSaldo(cuenta.getSaldo() + importe);
        }
    }
}
