//Diseñar una clase Persona (nombre y edad) con sus atributos y métodos set/get.
// Posteriormente crear una clase principal y crear un objeto.
// Utiliza sus métodos para mostrar los valores de los atributos del objeto.
public class Persona {

    //Se declaran los atributos a usar
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}