public class CifradoCesar {

    //Se declaran los métodos a usar
    public static String cambioCifrado(String cifrado, int n) {
        //Se hace un String que va a guardar solo un carácter
        String codigo = "";
        char caracter;

        //Esto se hace para sacar cada letra
        for (int i = 0; i < cifrado.length(); i++) {

            if (cifrado.charAt(i) == ' ') {
                codigo += " ";
            } else {
                caracter = cifrado.charAt(i);

                for (int j = 0; j < n; j++) {
                    caracter++;

                    if (caracter - 1 == 'z') {
                        caracter = 'a';
                    } else if (caracter - 1 == 'Z') {
                        caracter = 'A';
                    }
                }
                codigo += caracter;
            }
        }

        return codigo;
    }
}