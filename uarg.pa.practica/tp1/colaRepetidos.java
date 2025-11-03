import java.util.Scanner;

public class colaRepetidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pruebaCola cola = new pruebaCola();
        pruebaCola colaAux = new pruebaCola();
        int opc;

        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Agregar un elemento a la cola");
            System.out.println("2. Eliminar el elemento del frente de la cola");
            System.out.println("3. Buscar cantidad de ocurrencias de un elemento en la cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    if (!cola.estaLlena()) {
                        System.out.println("Ingrese el elemento para la cola:");
                        int e = sc.nextInt();
                        cola.encolar(e);
                        System.out.println("Se añadió el elemento.");
                        break;
                    }
                    else {
                        System.out.println("La cola ya está llena.");
                        break;
                    }

                case 2:
                    if (!cola.estaVacia()) {
                        int eliminado = cola.desencolar();
                        System.out.println("Se eliminó el elemento: " + eliminado);
                        break;
                    } 
                    else {
                        System.out.println("La cola ya está vacía.");
                        break;
                    }

                case 3:
                    if (!cola.estaVacia()) {
                        System.out.println("Ingrese el elemento a buscar:");
                        int ele = sc.nextInt();
                        int ocurrencias = 0;

                        while (!cola.estaVacia()) {
                            int actual = cola.desencolar();
                            if (actual == ele) {
                                ocurrencias++;
                            }
                            colaAux.encolar(actual);
                        }

                        while (!colaAux.estaVacia()) {
                            cola.encolar(colaAux.desencolar());
                        }

                        System.out.println("El elemento se encontró " + ocurrencias + " veces en la cola.");
                        break;
                    } 
                    else {
                        System.out.println("Error, la cola está vacía.");
                        break;
                    }
                    

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opc != 0);

        sc.close();
    }
}

