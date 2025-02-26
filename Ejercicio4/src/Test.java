import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        int pagina = 0;
        boolean leido, empezar;
        Scanner sc = new Scanner(System.in);

        //Se declara el objeto
        MarcaPagina pag;

        //Se pide al usuario que diga en qué página ha dejado de leer la primera vez
        System.out.println("Ingrese el numero de la página en la que se ha quedado:");
        pagina = sc.nextInt();

        //Se da el valor inicial
        pag = new MarcaPagina(pagina);

        //Se pregunta si ha acabado la página
        System.out.println("¿Ha acabado la página?");
        leido = sc.nextBoolean();

        if (leido) {
            pag.sumarPagina();
        }

        //Se dice en que página se ha quedado
        System.out.println(pag.ultimaPagina());

        //Se pregunta si desea comenzar de cero el libro
        System.out.println("¿Desea empezar el libro de cero?");
        empezar = sc.nextBoolean();

        if (empezar) {
            pag.comenzarCero();
        }

        System.out.println(pag.ultimaPagina());
    }
}
