import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        int segundosSumar;
        Scanner sc = new Scanner(System.in);

        //Se declara el objeto a usar
        Hora h = new Hora();

        //Se pide que ingrese la hora, el minuto y el segundo
        System.out.println("Ingrese la hora: ");
        h.setHora(sc.nextInt());
        System.out.println("Ingrese el minuto: ");
        h.setMinuto(sc.nextInt());
        System.out.println("Ingrese el segundo: ");
        h.setSegundo(sc.nextInt());



        //Se pide que ingresen cuantos segundos quieren aumentar
        System.out.println("Cuantos segundos quiere sumar: ");
        segundosSumar = sc.nextInt();

        System.out.println(h.toString());

        for (int i = 0; i < segundosSumar; i++) {
            h.aumentarUnSegundo(1);
            System.out.println(h.toString());
        }
    }
}
