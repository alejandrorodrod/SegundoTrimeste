package Formas;

public class Cuadrado extends Poligono{

    public Cuadrado(double lado, double altura) {
        super(lado, altura);
    }

    @Override
    public double area() {
        double area;
        area = (this.lado * this.altura);
        return area;
    }
}
