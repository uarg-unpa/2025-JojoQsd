import java.util.Scanner;

public class colaPromedio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        pruebaCola cola = new pruebaCola();
        int opc;
        

        do { 
            System.out.println("Elija una opcion:");
            System.out.println("1.Agregar un elemento a la cola");
            System.out.println("2.Eliminar un elemento de la cola");
            System.out.println("3.Sacar un promedio de los elementos de la cola");
            System.out.println("0. Salir");
            System.out.println("opcion:");
            opc = sc.nextInt();

            switch (opc) {
            case 1:
            System.out.println("Ingrese el elemento a agregar:");
            if (!cola.estaLlena()){
                int ele = sc.nextInt();
                cola.encolar(ele);
                break;
            }
            else {
                System.out.println("La cola ya esta llena.");
                break;
            }
            
            
            case 2:
            if (!cola.estaVacia()){
                cola.desencolar();
                System.out.println("Se desencolo el elemento: " + cola.aux);
                break;
            }
            else {
                System.out.println("La cola ya esta vacia.");
                break;
            }

            case 3:
            if (!cola.estaVacia()){
                cola.promCola();
                System.out.println("El promedio de los elementos en la cola es de " +cola.promCola() );
                break;
            }
        }
        }while (opc != 0);
    }
}
            

            
            

