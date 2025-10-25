import java.util.Scanner;

public class PruebaPersona {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese los datos de la primer persona");
    
    System.out.println("Ingrese el Apellido:");
    String apellido = scanner.nextLine();
   
    System.out.println("Ingrese la edad:");
    int edad = scanner.nextInt();
    
    System.out.println("Ingrese el numero de Documento:");
    int documento = scanner.nextInt();
    
    System.out.println("Ingrese el Sexo:");
    char sexo = scanner.next().charAt(0);
    
    System.out.println("Ingrese el Peso:");
    Double peso = scanner.nextDouble();


    System.out.println("Datos de la persona: ");
    Persona p1 = new Persona(apellido,edad,documento,sexo,peso);
    System.out.println(p1.toString());
    scanner.close();
 }   
}
