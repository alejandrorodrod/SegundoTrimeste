package Formas;

public class Triangulo extends Poligono{

    public Triangulo(double lado, double altura) {
        super(lado, altura);
    }

    @Override
    public double area() {
        double area;
        area = (this.lado * this.altura) / 2;
        return area;
    }
}
