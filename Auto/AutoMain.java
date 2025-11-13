import java.util.Scanner;

public class AutoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del primer auto:");
        System.out.println("Marca:");
        String marca1 = sc.nextLine();

        System.out.println("Modelo:");
        String modelo1 = sc.nextLine();

        System.out.println("Año:");
        int año1 = sc.nextInt();

        System.out.println("Velocidad Maxima (en Km/h):");
        int VelMax1 = sc.nextInt();

        Auto auto1 = new Auto(marca1, modelo1, año1, VelMax1);

        System.out.println("Ingrese los datos del segundo auto:");
        System.out.println("Marca:");
        String marca2 = sc.nextLine();

        System.out.println("Modelo:");
        String modelo2 = sc.nextLine();

        System.out.println("Año:");
        int año2 = sc.nextInt();

        System.out.println("Velocidad Maxima (en Km/h):");
        int VelMax2 = sc.nextInt();

        Auto auto2 = new Auto(marca2, modelo2, año2, VelMax2);

        System.out.println("Ingrese los datos del tercer auto:");
        System.out.println("Marca:");
        String marca3 = sc.nextLine();

        System.out.println("Modelo:");
        String modelo3 = sc.nextLine();

        System.out.println("Año:");
        int año3 = sc.nextInt();

        System.out.println("Velocidad Maxima (en Km/h):");
        int VelMax3 = sc.nextInt();

        Auto auto3 = new Auto(marca3, modelo3, año3, VelMax3);

        if (auto1.esMasRapidoQue(auto2)){
            if (auto1.esMasRapidoQue(auto3)){
                System.out.println("El auto N°1 es el mas rapido de los 3 con una velocidad maxima de: " + auto1.getVelocidadMax());
            }
        }
        else {
            if (auto2.esMasRapidoQue(auto3)){
                System.out.println("El auto N°2 es el mas rapido de los 3 con una velocidad maxima de: " + auto2.getVelocidadMax());
            }
            else {
                System.out.println("El auto N°3 es el mas rapido de los 3 con una velocidad maxima de: " + auto3.getVelocidadMax());
            }
        }


        if (auto1.esAutoClasico()){
            System.out.println("el Auto N°1 es un auto clasico");
        }
        if (auto2.esAutoClasico()){
            System.out.println("el Auto N°2 es un auto clasico");
        }
        if (auto3.esAutoClasico()){
            System.out.println("el Auto N°3 es un auto clasico");
        }
    }
}
