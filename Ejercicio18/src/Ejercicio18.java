import java.util.Scanner;

public class Ejercicio18 {
    //Se hace un atributo estático para guardar todos los empleados que se hagan
    private static Empleado[] empleados;;
    public static void main(String[] args) {
        //Se declaran las variables a usar
        int numEmpleados;


        //Se declaran los objetos a usar
        Scanner sc = new Scanner(System.in);

        //Se pregunta por el número de empleados de la empresa
        System.out.println("Cuantos empleados hay: ");
        numEmpleados = sc.nextInt();
        if (numEmpleados > 20) {
            System.out.println("El numero de empleados es mayor que 20, vuelva a introducir el numero de empleados");
            numEmpleados = sc.nextInt();
        }
        sc.nextLine();
        empleados = new Empleado[numEmpleados];

        for (int i = 0; i < empleados.length; i++) {

            //Se pide que introduzca los datos del empleado
            Empleado emp = new Empleado();
            System.out.println("Ingrese el NIF del empleado: ");
            emp.setNif(sc.nextLine());
            System.out.println("Ingrese el nombre del empleado: ");
            emp.setNombre(sc.nextLine());
            System.out.println("Ingrese el sueldo base del empleado: ");
            emp.setSueldoBase(sc.nextDouble());
            System.out.println("Ingrese las horas extra del empleado: ");
            emp.setHorasExtra(sc.nextInt());
            System.out.println("Ingrese el IRPF del empleado: ");
            emp.setIrpf(sc.nextDouble());
            System.out.println("Ingrese si el empleado está casado: ");
            emp.setCasado(sc.nextBoolean());
            System.out.println("Ingrese el número de hijos del empleado: ");
            emp.setNumHijos(sc.nextInt());

            //Ahora se añade este empleado a una posición del array
            empleados[i] = emp;
        }

        //Se pide que introduzca el precio de la hora extra
        System.out.println("Indique el precio de la hora extra");
        Empleado.setImporteHoraExtra(sc.nextDouble());

        Empleado empMasCobra = empleados[0];
        Empleado empMenosCobra = empleados[0];

        for (int i = 0; i < empleados.length; i++) {

            if (empleados[i].sueldoTotal(empleados[i].importeHoraExtra(empleados[i].getHorasExtra())) >
                    empMasCobra.sueldoTotal(empMasCobra.importeHoraExtra(empMasCobra.getHorasExtra()))) {
                empMasCobra = empleados[i];
            }

            if (empleados[i].sueldoTotal(empleados[i].importeHoraExtra(empleados[i].getHorasExtra())) <
                    empMenosCobra.sueldoTotal(empMenosCobra.importeHoraExtra(empMenosCobra.getHorasExtra()))) {
                empMenosCobra = empleados[i];
            }
        }

        System.out.println("El empleado que más cobra es: ");
        empMasCobra.toString();
        System.out.println("El empleado que menos cobra es: ");
        empMenosCobra.toString();

        Empleado empMasCobraHoraExtra = empleados[0];
        Empleado empMenosCobraHoraExtra = empleados[0];

        for (int i = 0; i < empleados.length; i++) {

            if (empleados[i].importeHoraExtra(empleados[i].getHorasExtra()) >
                    empMasCobraHoraExtra.importeHoraExtra(empMasCobraHoraExtra.getHorasExtra())) {
                empMasCobraHoraExtra = empleados[i];
            }

            if (empleados[i].importeHoraExtra(empleados[i].getHorasExtra()) <
                    empMenosCobraHoraExtra.importeHoraExtra(empMenosCobraHoraExtra.getHorasExtra())) {
                empMenosCobraHoraExtra = empleados[i];
            }
        }

        System.out.println("El empleado que más gana por hora extra es: ");
        empMasCobra.toString();
        System.out.println("El empleado que menos gana por hora extra es es: ");
        empMenosCobra.toString();

        Empleado aux = empleados[0];
        int tam = empleados.length;
        for (int i = 0; i < tam; i++) {
            if (empleados[i].getSueldoBase() > empleados[i + 1].getSueldoBase()) {
                aux = empleados[i];
                empleados[i] = empleados[i + 1];
                empleados[i + 1] = aux;
            }
            tam--;
        }

        for (int i = 0; i < empleados.length; i++) {
            empleados[i].toString();
        }
    }
}
