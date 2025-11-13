import java.util.Scanner;

public class PruebaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese hasta que posicion se llevara a cabo la secuencia de Fibonacci");
        int c = scanner.nextInt();

        int a = 0, b = 1;
        int i = 0;

        while(i < c) {
            System.out.print(a + " ");
            int d = a + b;
            a = b;
            b = d;
            i++;
        }
        scanner.close();
    }
}
