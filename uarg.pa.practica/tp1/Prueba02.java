//prueba comparador
import java.util.Scanner;

public class Prueba02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Porfavor ingrese su edad: ");
        byte edadUser = scanner.nextByte();

        if (edadUser > 18) {
            System.out.println("Usted es mayor de edad");
        }
         else {
            System.out.println("Usted no tiene la mayoria de edad");
         }
    scanner.close();
 }
    
}

