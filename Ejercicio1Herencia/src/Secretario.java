public class Secretario extends Empleado {
    private String despacho;
    private int fax;

    public Secretario(String nombre, String apellido, String dni, String direccion, int telefono, double salario, String despacho, int fax) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    public String getDespacho() {
        return this.despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public int getFax() {
        return this.fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + this.despacho);
        System.out.println("Fax: " + this.fax);
    }

    public void incrementarSalario() {
        this.setSalario(this.getSalario() + this.getSalario() * 0.05);
    }
}