public class Motor {

    //Se crean los atributos
    private int litrosAceite;
    private int caballos;

    //Se crea el constructor
    public Motor(int caballos) {
        this.caballos = caballos;
        this.litrosAceite = 0;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite += litrosAceite;
    }
}
