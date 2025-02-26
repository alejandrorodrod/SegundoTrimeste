import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        int ingresar, sacar;
        Scanner entrada = new Scanner(System.in);

        //Se declara el objeto
        CuentaCorriente cc = new CuentaCorriente("11111111H", "Pepe");
        CuentaCorriente cc2 = new CuentaCorriente("2222222I", 22.12);
        CuentaCorriente cc3 = new CuentaCorriente("3333333J", "José",33.33);

        //Se pide cuanto quiere sacar
        System.out.println("Ingrese cuanto quiere sacar:");
        sacar = entrada.nextInt();

        System.out.println("Ha podido usted sacar dinero: " + cc.sacarDinero(sacar));

        //Se pregunta cuanto quiere ingresar
        System.out.println("Ingrese cuanto quiere ingresar:");
        ingresar = entrada.nextInt();

        cc.ingresarDinero(ingresar);

        cc.informacionCuentaCorriente();
    }
}
