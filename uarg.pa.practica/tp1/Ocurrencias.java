import java.util.Scanner;

public class Ocurrencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pruebapila pila = new pruebapila();
        pruebapila pilaaux = new pruebapila();
        int opc;

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. agregar un elemento a la pila");
            System.out.println("2. eliminar el elemento de la cima de la pila");
            System.out.println("3.Buscar cantidad de ocurrencias de un elemento en la pila");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                if (!pila.estaLlena()){
                    System.out.println("Ingrese el elemento para la pila.");
                    int e = sc.nextInt();
                    pila.meter(e);
                    System.out.println("Se añadio el elemento");
                    break;
                }
                else {
                    System.out.println("La pila ya esta llena");
                    break;
                }

                case 2:
                if (!pila.estaVacia()){
                    pila.sacar();
                    System.out.println("Se saco el elemento:"+pila.aux);
                    break;
                }
                else {
                    System.out.println("La pila ya esta vacia");
                    break;
                }

                case 3:
                if (!pila.estaVacia()){
                    System.out.println("Ingrese el elemento a buscar:");
                    int ele = sc.nextInt();
                    pila.cantOcurrencias(ele);
                }
                
                System.out.println("El elemento se encontro" + pila.contOcurr + "veces en la pila");
                break;
            }

        }while (opc!=0);
        sc.close();
    }
}


