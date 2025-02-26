public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private String matricula;

    public JefeDeZona(String nombre, String apellido, String dni, String direccion, int telefono, double salario, String despacho, Secretario secretario, Vendedor[] vendedores, String matricula) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.matricula = matricula;
    }

    public String getDespacho() {
        return this.despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return this.secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Vendedor[] getVendedores() {
        return this.vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + this.despacho);
        System.out.println("Secretario: " + String.valueOf(this.secretario));
        System.out.println("Vendedores: ");

        for(int i = 0; i < this.vendedores.length; ++i) {
            this.vendedores[i].imprimir();
        }

        System.out.println("Matricula: " + this.matricula);
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.setSecretario(nuevoSecretario);
    }

    public void cambiarCoche(String matriculaNueva) {
        this.setMatricula(matriculaNueva);
    }

    public void incrementarSalario() {
        this.setSalario(this.getSalario() + this.getSalario() * 0.2);
    }
}