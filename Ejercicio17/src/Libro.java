public class Libro {
    //Se crean los atributos
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    //Se hacen los constructores
    public Libro() {}

    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    //Se crean los métodos a usar
    public boolean estaPrestado() {
        boolean prestado;

        if (this.numEjemplaresPrestados < this.numEjemplares) {
            this.numEjemplaresPrestados++;
            prestado = true;
        } else {
            prestado = false;
        }
        return prestado;
    }

    public boolean devolucion() {
        boolean devolver;

        if (this.numEjemplaresPrestados > 0) {
            this.numEjemplaresPrestados--;
            devolver = true;
        } else {
            devolver = false;
        }
        return devolver;
    }

    @Override
    public String toString() {
        String info = "";

        info += this.getAutor() + " ";
        info += this.getTitulo() + " ";
        info += this.getNumEjemplares() + " ";
        info += this.getNumEjemplaresPrestados() + " ";

        return info;
    }
}
