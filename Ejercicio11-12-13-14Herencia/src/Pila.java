public class Pila extends Lista{
    public Pila(){
        super();
    }

    public void apilar(int numero){
        this.setElementoFinalLista(numero);
    }

    public int desapilar(){
        int ultimo = this.getElementoLista(this.getElementosLista() - 1);
        this.eliminarUltimoElemento();
        return ultimo;
    }
}
