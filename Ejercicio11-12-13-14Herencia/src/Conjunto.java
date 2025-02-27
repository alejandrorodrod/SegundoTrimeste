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

        for  (int i = 0; i < this.lista.getElementosLista(); i++) {
            insertar = false;

            if (elemento != this.lista.getElementoLista(i)){
                insertar = true;
            }
        }

        if (insertar) {
            this.lista.setElementoFinalLista(elemento);
        }

        return insertar;
    }

    public boolean insertar(Conjunto conjunto) {
        boolean insertar = false;
        Lista aux = conjunto.lista;

        for  (int i = 0; i < this.lista.getElementosLista(); i++) {

            for (int j = 0; j < this.lista.getElementosLista(); j++) {
                insertar = false;
                if (aux.getElementoLista(i) != this.lista.getElementoLista(j)) {
                    insertar = true;
                    break;
                }
            }
        }

        if (insertar) {
            this.lista.setAniadirLista(aux);
        }

        return insertar;
    }

    public boolean eliminarElemento(int elemento) {
        boolean eliminar = false;
        int posicion = this.lista.getElementoEncontrar(elemento);
        Lista aux;

        if (posicion != -1) {
            eliminar = true;
            for (;posicion < this.lista.getElementosLista() - 1; posicion++) {
                this.lista.setElementoMitadLista(this.lista.getElementoLista(posicion + 1) ,posicion);
            }
        }

        //for para reducir el número del conjunto

        return eliminar;
    }
}
