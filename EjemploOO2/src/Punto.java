public class Punto {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(Punto p) {
        double dist = (double) Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
        return dist;
    }
}
