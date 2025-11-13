import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Empleado[] Empleados = new Empleado[3];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3;i++){
            System.out.println("Ingrese los datos del empleado"+ i+1);
            System.out.println("Nombre completo:");
            String nombre = sc.nextLine();

            System.out.println("Numero de Legajo:");
            int legajo = sc.nextInt();

            System.out.println("Sueldo a asignar:");
            double sueldo = sc.nextDouble();

            Empleados[i] = new Empleado(nombre, legajo, sueldo);
        }

        for (int i=0; i<3;i++){
            System.out.println(Empleados[i]);
        }

        System.out.println("Ingrese al primer empleado a comparar:");
        int emp1 = sc.nextInt();
        System.out.println("Ingrese al segundo empleado a comparar:");
        int emp2 = sc.nextInt();
        Empleado empAux = Empleados[emp2 -1];
        if (Empleados[emp1-1].ganaMasQue(empAux)){
            System.out.println("El empleado: "+ Empleados[emp1-1].getNombre() + " gana mas que el empleado: " + Empleados[emp2-1].getNombre()+"." );
        }
        else {
            System.out.println("El empleado: "+ Empleados[emp1-1].getNombre() + " gana menos que el empleado: " + Empleados[emp2-1].getNombre()+"." );
        }
      
    }
}
