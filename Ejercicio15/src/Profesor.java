import java.util.Random;

public class Profesor {



    //Se crean los métodos
    public void ponerNotas(Alumno alumno) {
        Random rand = new Random();

        alumno.getAsignatura1().setNota(rand.nextDouble(1.0, 10.1));
        alumno.getAsignatura2().setNota(rand.nextDouble(1.0, 10.1));
        alumno.getAsignatura3().setNota(rand.nextDouble(1.0, 10.1));

    }

    public double calcularMedia(Alumno alumno) {
        double media = 0;

        media = (alumno.getAsignatura1().getNota() + alumno.getAsignatura2().getNota() + alumno.getAsignatura3().getNota()) / 3.0;

        return media;
    }
}
