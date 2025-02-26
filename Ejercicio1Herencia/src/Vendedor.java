public class Vendedor extends Empleado {
    private String matricula;
    private int telefonoMovil;
    private String areaDeVentas;

    public Vendedor(String nombre, String apellido, String dni, String direccion, int telefono, double salario, String matricula, int telefonoMovil, String areaDeVentas) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.matricula = matricula;
        this.telefonoMovil = telefonoMovil;
        this.areaDeVentas = areaDeVentas;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTelefonoMovil() {
        return this.telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaDeVentas() {
        return this.areaDeVentas;
    }

    public void setAreaDeVentas(String areaDeVentas) {
        this.areaDeVentas = areaDeVentas;
    }

    public void cambiarCoche(String matriculaNueva) {
        this.setMatricula(matriculaNueva);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Teléfono móvil: " + this.telefonoMovil);
        System.out.println("Area de Ventas: " + this.areaDeVentas);
    }

    public void incrementarSalario() {
        this.setSalario(this.getSalario() + this.getSalario() * 0.1);
    }
}
