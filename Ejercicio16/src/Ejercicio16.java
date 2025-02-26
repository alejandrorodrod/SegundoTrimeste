public class Ejercicio16 {
    public static void main(String[] args) {
        //Se declaran los objetos a usar
        Garaje garaje = new Garaje();
        Coche coche1 = new Coche("Seat", "León");
        Coche coche2 = new Coche("Peugeot", "206");

        if (garaje.aceptarCoche(coche1, "motor")) {
            coche1.acumularAverias(100);
        }

        if (garaje.aceptarCoche(coche2, "aceite")) {
            System.out.println("Se ha podido aceptar");
        } else {
            System.out.println("No se ha podido aceptar");
        }

        garaje.devolverCoche();

        if (garaje.aceptarCoche(coche2, "aceite")) {
            coche2.acumularAverias(150);
            coche2.getMotor().setLitrosAceite(coche2.getMotor().getLitrosAceite() + 10);
        }

        garaje.devolverCoche();

        if (garaje.aceptarCoche(coche1, "luces")) {
            coche1.acumularAverias(50);
        }

        garaje.devolverCoche();

        if (garaje.aceptarCoche(coche2, "luna")) {
            coche2.acumularAverias(50);
        }

        System.out.println(coche1.getMotor().getLitrosAceite());
        System.out.println(coche1.getAverias());
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getModelo());

        System.out.println(coche2.getMotor().getLitrosAceite());
        System.out.println(coche2.getAverias());
        System.out.println(coche2.getMarca());
        System.out.println(coche2.getModelo());
    }
}
