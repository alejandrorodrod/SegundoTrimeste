public class Pila extends Lista{
    public Pila(){
        super();
    }

    public void apilar(int numero){
        this.setElementoFinalLista(numero);
    }

    public void desapilar(){
        int[] aux = new int[this.getElementosLista() - 1];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = this.getElementoLista(i);
        }
    }
}
