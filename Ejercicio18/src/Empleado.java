public class Empleado {
    //Se declaran los atributos
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtra;
    private double irpf;
    private boolean casado;
    private int numHijos;
    private static double importeHoraExtra;

    //Se hacen los constructores
    public Empleado() {}

    public Empleado(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public static double getImporteHoraExtra() {
        return importeHoraExtra;
    }

    public static void setImporteHoraExtra(double importeHoraExtra) {
        Empleado.importeHoraExtra = importeHoraExtra;
    }

    public double importeHoraExtra(int horasExtra) {
        double pago;

        pago = horasExtra * importeHoraExtra;

        return pago;
    }

    public double sueldoTotal(double pagoHorasExtra) {
        double sueldoTotal;

        sueldoTotal = this.sueldoBase + pagoHorasExtra;

        return sueldoTotal;
    }

    public double retencionIRPF(double sueldoTotal) {
        double retencionIRPF;
        double porcentaje;

        //Este if quita dos puntos si está casado
        if (casado) {
            this.irpf -= 2.0;
        }

        //Este quita 1 punto por hijo
        for (int i = 0; i < numHijos; i++) {
            this.irpf -= 1.0;
        }

        //Ahora se quita el IRPF
        porcentaje = this.irpf / 100;
        retencionIRPF = sueldoTotal * porcentaje;
        retencionIRPF = sueldoTotal - retencionIRPF;

        return retencionIRPF;
    }

    @Override
    public String toString() {
        String info;

        info = this.nif + " " + this.nombre + "\n"+ "Sueldo Base: " + this.sueldoBase + "\n" +
                "Horas Extras: " + this.horasExtra + "\n" + "Tipo IRPF: " + this.irpf + "\n" +
                "Casado: " + (this.casado ? "S":"N") + "\n" + "Número de Hijos: " + this.numHijos + "\n";

        return info;
    }
}
