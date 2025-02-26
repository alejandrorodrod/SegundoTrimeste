public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Vendedor[] vendedores = new Vendedor[1];
        Empleado empleado = new Empleado("Pepe", "Dorio", "11111111H", "C/ Perico los palotes", 985432342, (double)1000.0F);
        Secretario secretario = new Secretario("A", "A", "A", "A", 987932323, (double)1500.0F, "A", 134234232);
        Secretario secretario2 = new Secretario("A", "A", "A", "A", 987932323, (double)1500.0F, "A", 134234232);
        Vendedor vendedor = new Vendedor("B", "B", "B", "B", 987682342, (double)1300.0F, "2342BBB", 234523452, "B");
        vendedores[0] = vendedor;
        JefeDeZona jefeDeZona = new JefeDeZona("C", "C", "C", "C", 492378944, (double)2300.0F, "C", secretario, vendedores, "4523VSD");
        empleado.incrementarSalario();
        vendedor.incrementarSalario();
        secretario.incrementarSalario();
        jefeDeZona.incrementarSalario();
        vendedor.cambiarCoche("4533dfs");
        jefeDeZona.cambiarSecretario(secretario2);
        jefeDeZona.cambiarCoche("2532dfw");
        empleado.imprimir();
        vendedor.imprimir();
        secretario.imprimir();
        jefeDeZona.imprimir();
    }
}