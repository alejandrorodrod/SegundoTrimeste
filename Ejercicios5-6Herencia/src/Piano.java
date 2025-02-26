public class Piano extends Instrumento {
    public Piano() {
        super();
    }

    public void interpretar() {
        for  (int i = 0; i < this.getNotasMelodia().length; i++) {
            System.out.println(this.getNotasMelodia()[i]);
        }
    }
}
