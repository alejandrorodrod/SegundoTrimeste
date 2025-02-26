package Personal;

public class Maquinista {

    //Se declaran los atributos a utilizar
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;

    //Se hace el constructo
    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
}
