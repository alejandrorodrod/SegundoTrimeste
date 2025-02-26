import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //Se crean los objetos a usar
        Scanner sc = new Scanner(System.in);
        Asignatura a1 = new Asignatura(1);
        Asignatura a2 = new Asignatura(2);
        Asignatura a3 = new Asignatura(3);
        Alumno a = new Alumno(a1, a2, a3);
        Profesor p = new Profesor();

        p.ponerNotas(a);

        System.out.println(p.calcularMedia(a));
    }
}
