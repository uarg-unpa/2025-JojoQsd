import java.util.Scanner; //importo un fichero de java

public class Prueba_Scanner {   //se declara el archivo TP01 como una clase publica
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //declaro la funcion scanner

        System.out.print("Como te llamas?"); //se muestra en consola una pregunta
        String nombre = scanner.nextLine();  //se declara nombre como string y se escanea de la consola

        System.out.println("Tu Nombre es " + nombre); //mostrar en consola texto y variable

        scanner.close(); //cierre de scanner



    }
 
}

