public class Conjunto {
    //Se crea el atributo
    private Lista lista;

    //Se crean los constructores
    public Conjunto() {
        lista = new Lista();
    }

    public int numeroElementos() {
        return this.lista.getElementosLista();
    }

    public boolean insertar(int elemento) {
        boolean insertar = false;
        if (lista.getElementoEncontrar(elemento)==-1){
            lista.setElementoFinalLista(elemento);
        }
        return insertar;
    }

    public boolean insertar(Conjunto conjunto) {
        boolean insertar = false;

        for(int i = 0; i < conjunto.lista.getElementosLista(); i++) {

            if (this.lista.getElementoEncontrar(conjunto.lista.getElementoLista(i))==-1){
                this.insertar(conjunto.lista.getElementoLista(i));
            }
        }

        return insertar;
    }

    public boolean eliminarElemento(int elemento) {
        boolean eliminar = false;
        int posicion = this.lista.getElementoEncontrar(elemento);

        if (posicion != -1) {
            eliminar = true;

            for (;posicion < this.lista.getElementosLista() - 1; posicion++) {
                this.lista.setElementoMitadLista(this.lista.getElementoLista(posicion + 1) ,posicion);
            }
        }

        if (eliminar) {
            this.lista.eliminarUltimoElemento();
        }

        return eliminar;
    }

    public boolean eliminarConjunto(Conjunto conjunto) {
        boolean eliminar = false;

        for (int i = 0; i < this.lista.getElementosLista(); i++) {
            this.eliminarElemento(conjunto.lista.getElementoLista(i));
        }

        return eliminar;
    }

    public boolean pertenece(int elemento) {
        boolean pertenece = false;
        int posicion = this.lista.getElementoEncontrar(elemento);

        if (posicion != -1) {
            pertenece = true;
        }

        return pertenece;
    }

    public void mostrar() {
        System.out.println("Conjunto:");
        this.lista.mostrarElementosLista();
    }

    @Override
    public boolean equals(Object obj) {
        Conjunto aux = (Conjunto) obj;
        return this.lista.equals(aux.lista);
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
        boolean incluido = true;

        for (int i = 0; i < c1.lista.getElementosLista(); i++) {

            if (!c2.pertenece(c1.lista.getElementoLista(i))) {
                incluido = false;
                break;
            }
        }

        return incluido;
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto union = new Conjunto();
        union.insertar(c1);
        union.insertar(c2);
        return union;
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto interseccion = new Conjunto();

        for  (int i = 0; i < c2.lista.getElementosLista(); i++) {
            if (c1.pertenece(c2.lista.getElementoLista(i))) {
                interseccion.insertar(c2.lista.getElementoLista(i));
            }
        }

        return interseccion;
    }

    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto diferente = new Conjunto();

        for  (int i = 0; i < c1.lista.getElementosLista(); i++) {
            if (!c2.pertenece(c1.lista.getElementoLista(i))) {
                diferente.insertar(c1.lista.getElementoLista(i));
            }
        }

        return diferente;
    }
}
