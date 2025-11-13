import java.util.Scanner;

public class MainDeportista{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("Ingrese los datos del primer deportista:");
    System.out.println("Nombre");
    String nombre1 = sc.nextLine();

    System.out.println("Edad:");
    int edad1 = sc.nextInt();

    System.out.println("Deporte:");
    String deporte1 = sc.nextLine();

    System.out.println("Cantidad de puntos:");
    int puntos1 = sc.nextInt();

    Deportista dep1 = new Deportista(nombre1, edad1, deporte1, puntos1);

    System.out.println("Ingrese los datos del segundo deportista:");
    System.out.println("Nombre");
    String nombre2 = sc.nextLine();

    System.out.println("Edad:");
    int edad2 = sc.nextInt();

    System.out.println("Deporte:");
    String deporte2 = sc.nextLine();

    System.out.println("Cantidad de puntos:");
    int puntos2 = sc.nextInt();

    Deportista dep2 = new Deportista(nombre2, edad2, deporte2, puntos2);


    System.out.println("Los deportistas son:");
    System.out.println(dep1);
    System.out.println("y:");
    System.out.println(dep2);


    if (dep1.esMasExperimentado(dep2)){
        System.out.println("El deportista: " + dep1.getNombre() + " Tiene mas puntos que: " + dep2.getNombre() +" con: " + dep1.getPuntos() +" contra: " + dep2.getPuntos());
    }
    else { 
        System.out.println("El deportista: " + dep2.getNombre() + " Tiene mas puntos que: " + dep1.getNombre() +" con: " + dep2.getPuntos() +" contra: " + dep1.getPuntos());
    }

    if (dep1.esMayordeEdad()){
        System.out.println("El deportista: "+dep1.getNombre()+" es mayor de edad.");
    }
    else {
        System.out.println("El deportista: "+dep1.getNombre()+ " es menor de edad.");
    }

    if (dep2.esMayordeEdad()){
        System.out.println("El deportista: "+dep2.getNombre()+" es mayor de edad.");
    }
    else {
        System.out.println("El deportista: "+dep2.getNombre()+ " es menor de edad.");
    }
    }
}
