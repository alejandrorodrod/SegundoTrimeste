public abstract class  Instrumento {
    //Se declaran los atributos a usar
    private String[] notasMelodia;


    //Se declaran los métodos
    public void add(Notas nota) {
        String[] notaMas = new String[this.notasMelodia.length + 1];

        for (int i = 0; i < this.notasMelodia.length; i++) {
            notaMas[i] = this.notasMelodia[i];
        }
        notaMas[this.notasMelodia.length] = String.valueOf(nota);

        this.notasMelodia = notaMas;
    }

    public abstract void interpretar();

    public String[] getNotasMelodia() {
        return notasMelodia;
    }
}
