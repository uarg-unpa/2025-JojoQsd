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
                }
                else {
                    System.out.println("La pila ya esta llena");
                }

                case 2:
                if (!pila.estaVacia()){
                    System.out.println("Se saco el elemento:"+pila.elementos[pila.cima]);
                    pila.sacar();
                }
                else {
                    System.out.println("La pila ya esta vacia");
                }

                case 3:
                if (!pila.estaVacia()){
                    System.out.println("Ingrese el elemento a buscar:");
                    int ele = sc.nextInt();
                    for (int i =0; i<pila.cima; i++){
                        pila.sacar();
                    if (pila.aux == ele){
                        pila.cantOcurrencias();
                    }
                    pilaaux.meter(pila.aux); //armar la pila auxiliar con cada elemento que se saca de la original
                }
                for (int i=0; i<pilaaux.cima; i++){
                    pilaaux.sacar();
                    pila.meter(pilaaux.aux);  //restaurar la pila original
                }
                System.out.println("El elemento se encontro" + pila.contOcurr + "veces en la pila");
            }
                case 0:
                break;
        }
    }
    while (opc!=0);
    sc.close();
}
}

