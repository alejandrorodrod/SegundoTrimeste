//Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro.
//Deberá disponer de los métodos para incrementar la página leída, para obtener información de la última página que se ha leído y para comenzar desde
// el principio una nueva lectura del mismo libro. Escribe un programa principal donde puedas probar la clase creada.
public class MarcaPagina {

    //Se declaran los atributos a usar
    private int pagina;

    //Se hace el constructor
    public MarcaPagina(int pagina) {
        this.pagina = pagina;
    }

    public MarcaPagina() {
        this.pagina = 0;
    }

    //Se declaran los métodos a usar
    public void sumarPagina () {
        this.pagina++;
    }

    public int ultimaPagina () {
        return this.pagina;
    }

    public int comenzarCero () {
        return this.pagina = 0;
    }
}