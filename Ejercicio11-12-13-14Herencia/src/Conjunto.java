public class Conjunto {
    //Se crea el atributo
    private Lista lista;

    //Se crean los constructores
    public Conjunto() {}

    public int numeroElementos() {
        return this.lista.getElementosLista();
    }

    public boolean insertar(int elemento) {
        boolean insertar = false;
        Lista aux = new Lista();

        for  (int i = 0; i < this.lista.getElementosLista(); i++) {
            insertar = false;

            if (elemento != this.lista.getElementoLista(i)){
                insertar = true;
            }
        }

        if (insertar == true) {
            this.lista.setElementoFinalLista(elemento);
        }

        return insertar;
    }

    public boolean insertar(Conjunto conjunto) {
        boolean insertar = false;
        Lista aux = new Lista();

        aux = this.lista;
        this.lista.
    }
}
