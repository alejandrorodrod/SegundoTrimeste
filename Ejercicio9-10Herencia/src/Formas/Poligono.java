package Formas;

public abstract class Poligono {
    protected double lado;
    protected double altura;

    public Poligono(double lado, double altura) {
        setLado(lado);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0)
            this.lado = lado;
    }

    public abstract double area();
}
