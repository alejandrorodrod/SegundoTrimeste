public class Punto {

    //Se declaran los atributos
    private double x;
    private double y;

    //Se declara el constructo
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Se declaran los métodos
    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double distaciaEuclidea(Punto otro) {
        double resultado;

        resultado = Math.sqrt(Math.pow(this.x - otro.x, 2.0) + Math.pow(this.y - otro.y, 2.0));

        return resultado;
    }

    public void muestra() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }
}