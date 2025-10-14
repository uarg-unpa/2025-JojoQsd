import java.util.Scanner;

public class Test_Elector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Elector[] electores = new Elector[5];

       for (int i = 0; i < 5; i++){
         System.out.println("Ingrese los datos del Elector " + (i+1));

         System.out.println("Ingrese el Nombre");
         String nombre = sc.nextLine();

        System.out.println("Ingrese el Apellido");
        String Apellido = sc.nextLine();

        System.out.println("Ingrese la Matricula");
        int Matricula = sc.nextInt();

        System.out.println("Ingrese la Clase");
        int Clase = sc.nextInt();

        System.out.println("Ingrese el Domicilio");
        String Domicilio = sc.nextLine();

        electores[i] = new Elector(nombre, Apellido, Matricula, Clase, Domicilio);

       }

       do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Mostrar datos de un Elector");
            System.out.println("2. Modificar datos de un Elector");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                System.out.println("¿De que Elector quiere mostrar los datos?");
                int ele = sc.nextInt() - 1;
                System.out.println(electores[ele].toString());
                break;

                case 2:
                System.out.println("Seleccione un Elector");
                int seleccion = sc.nextInt() - 1;
                System.out.println(electores[seleccion].toString());
                Elector electorAModificar = electores[seleccion];

                System.out.println("¿Que dato quiere cambiar?");
                do {
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Matricula");
                    System.out.println("4. Clase");
                    System.out.println("5. Domicilio");
                    System.out.println("0. Salir");
                    opcion = sc.nextInt();

                    switch (opcion){
                     case 1:
                    System.out.println("Ingrese el Nombre a cambiar");
                    String nombre = sc.nextLine();
                    electorAModificar.setnombre(nombre);
                    break;

                     case 2:
                     System.out.println("Ingrese el Apellido a cambiar");
                    String Apellido = sc.nextLine();
                    electorAModificar.setApellido(Apellido);
                    break;

                     case 3:
                     System.out.println("Ingrese la Matricula a cambiar");
                    int Matricula = sc.nextInt();
                    electorAModificar.setMatricula(Matricula);
                    break;

                     case 4: 
                     System.out.println("Ingrese la Clase a cambiar");
                    int Clase = sc.nextInt();
                    electorAModificar.setClase(Clase);
                    break;

                     case 5:
                     System.out.println("Ingrese el Domicilio a cambiar");
                    String Domicilio = sc.nextLine();
                    electorAModificar.setDomicilio(Domicilio);
                    break;

                     case 0:
                     break;
                    }
                }while (opcion != 0);
            }
        }while (opcion != 0);
        sc.close();
    }
}
