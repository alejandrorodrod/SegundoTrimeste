public class Conjunto extends Lista {
    //Se crean los constructores
    public Conjunto() {
        super();
    }

    public int numeroElementos() {
        return this.getElementosLista();
    }

    public boolean insertar(int elemento) {
        boolean insertar = false;
        if (this.getElementoEncontrar(elemento) == -1) {
            this.setElementoFinalLista(elemento);
            insertar = true;
        }
        return insertar;
    }

    public boolean insertar(Conjunto conjunto) {
        boolean insertar = false;

        for (int i = 0; i < conjunto.numeroElementos(); i++) {

            if (this.getElementoEncontrar(conjunto.getElementoLista(i)) == -1) {
                this.insertar(conjunto.getElementoLista(i));
                insertar = true;
            }
        }

        return insertar;
    }

    public boolean eliminarElemento(int elemento) {
        boolean eliminar = false;
        int posicion = this.getElementoEncontrar(elemento);

        if (posicion != -1) {
            eliminar = true;

            for (; posicion < this.numeroElementos() - 1; posicion++) {
                this.setElementoMitadLista(this.getElementoLista(posicion + 1), posicion);
            }
        }

        if (eliminar) {
            this.eliminarUltimoElemento();
        }

        return eliminar;
    }

    public boolean eliminarConjunto(Conjunto conjunto) {
        boolean eliminar = false;

        for (int i = 0; i < this.numeroElementos(); i++) {
            this.eliminarElemento(conjunto.getElementoLista(i));
            eliminar = true;
        }

        return eliminar;
    }

    public boolean pertenece(int elemento) {
        boolean pertenece = false;
        int posicion = this.getElementoEncontrar(elemento);

        if (posicion != -1) {
            pertenece = true;
        }

        return pertenece;
    }

    public void mostrar() {
        System.out.println("Conjunto:");
        this.mostrarElementosLista();
    }
}
