import java.util.Scanner;

public class ReproductorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reproductor MP = new Reproductor();
        int opc;
        Reproductor MPaux = new Reproductor();

        do {
            System.out.println("Reproductor musical:");
            System.out.println("1.Agregar una cancion a la lista");
            System.out.println("2.Reproducir siguiente en la lista");
            System.out.println("3.Reproducir anterior en la lista");
            System.out.println("0.Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                System.out.println("Ingrese el nombre de la cancion:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el nombre del Artista:");
                String Interprete = sc.nextLine();
                System.out.println("Ingrese el genero:");
                String genero = sc.nextLine();
                System.out.println("Ingrese el año de lanzamiento:");
                int año = sc.nextInt();

                temaMusical cancion = new temaMusical(nombre, Interprete, genero, año);
                if (!MP.estaLlena()){
                    MP.agregar(cancion);
                    break;
                }
                else {
                    System.out.println("La lista de reproduccion esta llena.");
                    break;
                }

                case 2:
                if (!MP.estaVacia()) {
                    temaMusical aux = MP.reproducirSig();
                    MPaux.agregar(aux);
                    System.out.println("Ahora reproduciendo: " + aux.toString());
                    break;
                }
                else {
                    System.out.println("Error, la lista esta vacia.");
                    break;
                }

                case 3:
                if(!MPaux.estaVacia()) {
                    temaMusical aux = MPaux.reproducirSig();
                    MP.agregar(aux);
                    System.out.println("Ahora reproduciendo: " + aux.toString());
                    break;
                }
                else {
                    System.out.println("Error, no hay cancion a la cual volver.");
                    break;
                }

                case 0:
                break;
            }

        }while (opc !=0);
        sc.close();
    }
}

