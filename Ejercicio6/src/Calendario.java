public class Calendario {

    //Se declaran los atributos
    private int anno;
    private int mes;
    private int dia;

    //Se declara el constructo
    public Calendario(int dia, int mes, int anno) {
        if (fechaCorrecta(dia, mes, anno)) {
            this.dia = dia;
            this.mes = mes;
            this.anno = anno;
        } else {
            this.anno = 1;
            this.mes = 1;
            this.dia = 1;
        }

    }

    private boolean fechaCorrecta(int dia, int mes, int anno) {
        boolean correcta;

        if (1<= dia && dia <= diasMes(mes) && anno != 0) {
            correcta = true;
        } else {
            correcta = false;
        }

        return correcta;
    }

    //Se usa esta función para comprobar la fecha
    private static int diasMes(int mes) {
        int result = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            default -> {
                yield -1;
            }
        };
        return result;
    }


    //Se declaran los métodos a usar
    public void incrementarDia() {
        if (this.dia >= diasMes(mes)) {
            this.dia = 1;
            incrementarMes();
        } else {
            this.dia++;
        }
    }

    public void incrementarMes() {
        if (this.mes >= 12) {
            this.mes = 1;
            incrementarAnno();
        } else if (this.mes == 1 && this.dia >= 28) {
            this.mes = 3;
        }
    }

    public void incrementarAnno() {
        this.anno++;

        if (this.anno == 0) {
            this.anno = 1;
        }
    }

    public void mostrar() {
        System.out.println("Día: " + this.dia);
        System.out.println("Mes: " + this.mes);
        System.out.println("Año: " + this.anno);
    }

    public boolean iguales(Calendario otraFecha) {
        boolean iguales = false;

        if (this.anno == otraFecha.anno && this.mes == otraFecha.mes && this.dia == otraFecha.dia) {
            iguales = true;
        }

        return iguales;
    }
}