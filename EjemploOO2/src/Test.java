public class Test {

    public static void main(String[] args) {
        Punto p = new Punto();

        p.setX(5);
        p.setY(5);

        Punto p2 = new Punto();
        p2.setX(15);
        p2.setY(15);

        double distancia = p.distancia(p2);

        System.out.println(distancia);
    }
}
