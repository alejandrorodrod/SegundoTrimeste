import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        int isbn;
        String titulo, autor;

        //Se crea el objeto
        Scanner sc = new Scanner(System.in);
        Libro[] lib = new Libro[0];

        do {
            //Se pide que ingrese los datos
            System.out.println("Ingrese el ISBN (-1 para terminar): ");
            isbn = sc.nextInt();
            if (isbn != -1){
                sc.nextLine();

                System.out.println("Ingrese el titulo: ");
                titulo = sc.nextLine();

                System.out.println("Ingrese el autor: ");
                autor = sc.nextLine();

                //Se crea un array auxiliar y un objeto auxiliar
                Libro l = new Libro(isbn, titulo, autor);
                Libro[] auxiliar = new Libro[lib.length + 1];

                for (int i = 0; i < lib.length; i++) {
                    auxiliar[i] = lib[i];
                }
                auxiliar[auxiliar.length - 1] = l;
                lib = auxiliar;
            }
        } while (isbn != -1);

        //Se imprimen los datos
        for (int i = 0; i < lib.length; i++) {
            System.out.println("El ISBN es: " + lib[i].getIsbn());
            System.out.println("El titulo es: " + lib[i].getTitulo());
            System.out.println("El autor es: " + lib[i].getAutor());
        }

    }
}
