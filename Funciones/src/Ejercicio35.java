public class Ejercicio35 {
    public static void primera(int a) {
        System.out.println("Esta función es la primera");
        System.out.println(a);
    }

    public static void segunda(int a) {
        System.out.println("Esta función es la segunda");
        System.out.println(a);
    }

    public static void tercera(int a) {
        System.out.println("Esta función es la tercera");
        System.out.println(a);
    }

    public static void cuarta(int a) {
        System.out.println("Esta función es la cuarta");
        System.out.println(a);
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int cont = 1;

        for (int i = 0; i < 2; i++) {
            primera(cont);
            cont++;
            segunda(cont);
            cont++;
            tercera(cont);
            cont++;
            cuarta(cont);
            cont++;
        }
    }
}
