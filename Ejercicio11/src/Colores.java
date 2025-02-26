import java.util.Random;

public class Colores {

    //Se declaran los atributos a usar
    private String[] color = new String[13];

    //Se crea el constructo
    public Colores() {
        this.color[0] = "Pistacho";
        this.color[1] = "Verde";
        this.color[2] = "Azul";
        this.color[3] = "Aquamarina";
        this.color[4] = "Carmesí";
        this.color[5] = "Cian";
        this.color[6] = "Marrón";
        this.color[7] = "Negro";
        this.color[8] = "Blanco";
        this.color[9] = "Amarillo";
        this.color[10] = "Gris";
        this.color[11] = "Magenta";
        this.color[12] = "Rosa";
    }

    //Se declaran los metodos a usar
    public void añadeColor(String color) {
        if (!estaColor(this.color, color)) {
            String[] colores = new String [this.color.length + 1];
            for (int i = 0; i < this.color.length; i++) {
                colores[i] = this.color[i];
            }
            colores[colores.length - 1] = color;
            this.color = colores;
        }
    }

    private boolean estaColor(String[] colores, String color) {
        boolean esta = false;
        for (int i = 0; i < this.color.length; i++) {
            if (this.color[i].equals(color)) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    public String[] coloresUsar(int n) {
        //Se crea un array para los colores a devolver y otro para saber si los declarados se han usado
        String[] color = new String[n];
        boolean[] usado = new boolean[this.color.length];
        int num;

        //Se usa el objeto Ramdon para elegir al azar el color
       Random r = new Random();

       if (n > this.color.length) {
           n = this.color.length;
       }

        for (int i = 0; i < n; i++) {
            num = r.nextInt(this.color.length);

            if (usado[num] == false) {
                color[i] = this.color[num];
                usado[num] = true;
            } else {
                i--;
            }
        }

        return color;
    }
}