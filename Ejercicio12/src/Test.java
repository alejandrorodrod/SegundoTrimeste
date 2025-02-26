import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        String cifrado = "";
        int numero;

        //Se declaran los objetos a usar
        Scanner entrada = new Scanner(System.in);

        //Se pide que introduzca el mensaje y el número para el cifrado
        System.out.println("Ingrese el mensaje: ");
        cifrado = entrada.nextLine();
        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        System.out.println(CifradoCesar.cambioCifrado(cifrado, numero));
    }
}
