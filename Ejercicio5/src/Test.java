public class Test {
    public static void main(String[] args) {
        //Se declaran los objetos a usar
        Punto p1 = new Punto(-1, 1);
        Punto p2 = new Punto(5, 2);
        double euclides;

        p1.desplazaX(1);
        p1.desplazaY(-1);

        p2.desplaza(-2, 2);

        euclides = p1.distaciaEuclidea(p2);

        p1.muestra();
        p2.muestra();
        System.out.println(euclides);
    }
}
