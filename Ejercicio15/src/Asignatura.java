public class Asignatura {

    //Se declaran los atributos
    private int id;
    private double nota;

    //Se crean los constructores
    public Asignatura(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
