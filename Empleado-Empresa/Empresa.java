import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        empleado[] Empleados = new empleado[3];
        Scanner sc = new Scanner(System.in);
        int opc;

        for (int i=0; i<3;i++){
            System.out.println("Ingrese los datos del empleado"+ i+1);
            System.out.println("Nombre completo:");
            String nombre = sc.nextLine();

            System.out.println("Numero de Legajo:");
            int legajo = sc.nextInt();

            System.out.println("Sueldo a asignar:");
            double sueldo = sc.nextDouble();

            Empleados[i] = new empleado(nombre, legajo, sueldo);
        }

        do { 
             System.out.println("Elija una opcion:");
             System.out.println("1.Mostrar datos de un empleado.");
             System.out.println("2.Comparar sueldos de empleados.");
             System.out.println("0.Salir");
             System.out.println("Opcion:");
             opc = sc.nextInt();


             switch (opc){
                case 1:
                System.out.println("¿De que empleado desea mostrar los datos?");
                int aux = sc.nextInt();
                System.out.println(Empleados[aux-1]);
                break;

                case 2:
                System.out.println("Ingrese al primer empleado a comparar:");
                int emp1 = sc.nextInt();
                System.out.println("Ingrese al segundo empleado a comparar:");
                int emp2 = sc.nextInt();
                empleado empAux = Empleados[emp2 -1];
                if (Empleados[emp1-1].ganaMasQue(empAux)){
                    System.out.println("El empleado: "+ Empleados[emp1-1].getNombre() + " gana mas que el empleado: " + Empleados[emp2-1].getNombre()+"." );
                }
                else {
                    System.out.println("El empleado: "+ Empleados[emp1-1].getNombre() + " gana menos que el empleado: " + Empleados[emp2-1].getNombre()+"." );
                }
             }
        } while (opc !=0);

        
    }
}
