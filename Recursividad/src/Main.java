public class Main {
    public static void main(String[] args) {
        hanoi("palo1", "palo2", "palo3", 3);

    }

    public static void hanoi(String paloinicio, String palomedio, String palofin, int cantidaddisco) {

        if (cantidaddisco == 1) {
            System.out.println("Mueve el disco del palo " + paloinicio + " al palo " + palofin);
        } else {
            hanoi(paloinicio, palofin, palomedio, cantidaddisco - 1);
            System.out.println("Mueve el disco del palo " + paloinicio + " al palo " + palofin);
            hanoi(palomedio, paloinicio, palofin, cantidaddisco - 1);
        }

    }
}