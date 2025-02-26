import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);

        //Se crea el objeto
        Ordenador ordenador = new Ordenador();

        //Se pide que introduzcan los datos
        System.out.println("Ingrese el modelo del ordenador: ");
        ordenador.setModelo(sc.nextLine());

        System.out.println("Ingrese la cpu del ordenador: ");
        ordenador.setCpu(sc.nextLine());

        System.out.println("Ingrese el tamaño del disco duro del ordenador: ");
        ordenador.setTamanioDiscoDuro(sc.nextInt());

        System.out.println("Ingrese el tamaño de la RAM del ordenador (en Gb solo número): ");
        ordenador.setTamanioRam(sc.nextInt());

        System.out.println("Ingrese el precio del ordenador: ");
        ordenador.setPrecio(sc.nextDouble());

        //Se muestran los valores dados
        System.out.println("El modelo es: " + ordenador.getModelo());
        System.out.println("La cpu es: " + ordenador.getCpu());
        System.out.println("El tamaño de disco duro es: " + ordenador.getTamanioDiscoDuro());
        System.out.println("El tamaño de RAM es: " + ordenador.getTamanioRam());
        System.out.println("El precio es: " + ordenador.getPrecio());
    }
}
