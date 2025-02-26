import java.util.Arrays;

public class Lista {

    //Se hacen los atributos
    private int[] lista;

    //Se hace el constructor
    public Lista() {
        this.lista = new int[0];
    }

    //Se hace el resto de métodos
    public int getElementosLista() {
        int elementos;
        elementos = this.lista.length;
        return elementos;
    }

    public void setElementoFinalLista(int numero) {
        int[] aux = new int[this.lista.length + 1];

        for (int i = 0; i < this.lista.length; i++) {
            aux[i] = this.lista[i];
        }
        aux[this.lista.length] = numero;
        this.lista = aux;
    }

    public void setElementoInicioLista(int numero) {
        int[] aux = new int[this.lista.length + 1];

        aux[0] = numero;
        for (int i = 1; i < aux.length; i++) {
            aux[i] = this.lista[i - 1];
        }
        this.lista = aux;
    }

    public void setElementoMitadLista(int numero, int posicion) {
        int[] aux = new int[this.lista.length + 1];

        for (int i = 1; i < aux.length; i++) {
            if (i != posicion) {
                aux[i] = this.lista[i - 1];
            }
        }
        aux[posicion] = numero;
        this.lista = aux;
    }

    public void setAniadirLista(Lista lista) {
        for (int i = 0; i < lista.getElementosLista(); i++) {
            this.setElementoFinalLista(lista.getElementoLista(i));
        }
    }

    public int getElementoLista(int posicion) {
        int pedido;
        pedido = this.lista[posicion];
        return pedido;
    }

    public int getElementoEncontrar(int pedido) {
        int indice = -1;

        for (int i = 0; i < this.lista.length; i++) {
            if (i == pedido) {
                indice = i;
                break;
            }
        }

        return indice;
    }

    public void mostrarElementosLista() {

        System.out.println(Arrays.toString(this.lista));
    }

    //Ejercicio 12, método estático
    public static Lista listaConcatenada (Lista lista1, Lista lista2) {
        Lista aux = lista1;
        aux.setAniadirLista(lista2);
        return aux;
    }

    //Ejercicio 13
    @Override
    public boolean equals(Object obj) {
        boolean igual = false;
        Lista lista2 = (Lista) obj;
        
        for (int i = 0; i < this.lista.length; i++) {
            igual = false;
            
            if (this.lista[i] ==  lista2.lista[i]) {
                igual = true;
            }
        }
        
        return igual;
    }
}
