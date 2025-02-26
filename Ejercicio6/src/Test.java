import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int dia, mes, anno;
        boolean iguales;

        //Se declara el objeto a usar
        Calendario fecha;
        Calendario fecha2 = new Calendario(1,2, 2);

        //Se pide introduzca la fecha
        System.out.println("Ingrese el día: ");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        anno = sc.nextInt();

        fecha = new Calendario(dia, mes, anno);

        fecha.mostrar();
        fecha2.mostrar();

        fecha.incrementarDia();
        fecha.incrementarMes();
        fecha.incrementarAnno();
        fecha2.incrementarDia();

        fecha.mostrar();
        fecha2.mostrar();

        iguales = fecha.iguales(fecha2);

        System.out.println(iguales);
    }
}
