public class Ejercicio17 {
    public static void main(String[] args) {
        //Se declaran los objetos a usar
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Los días", "Pepe", 2);

        libro1.setAutor("Juan");
        libro1.setTitulo("Rodolfo");
        libro1.setNumEjemplares(3);

        System.out.println(libro2.estaPrestado());
        System.out.println(libro1.estaPrestado());
        System.out.println(libro2.estaPrestado());
        System.out.println(libro2.estaPrestado());

        System.out.println(libro1.devolucion());
        System.out.println(libro2.devolucion());
        System.out.println(libro1.devolucion());

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
}
