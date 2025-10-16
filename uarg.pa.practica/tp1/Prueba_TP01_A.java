//Prueba punto 1) TP01

public class Prueba_TP01_A {
    public static void main(String[] args) {
        
        int A, B, R1;
        double C , D , R2;
        A = 5;
        B = 3;
        C = 2.5;
        D = 2.0;

        R1 = (A / B);
        R2 = (A / C);

        System.out.println("R1= " + R1);
        System.out.println("R2= " + R2);

        R2 = A * D;
        R1 = A * (int) D;

        System.out.println("R2= " + R2);
        System.out.println("R1= " + R1);

        R1 = (int) (C*D);
        System.out.println("R1= " + R1);

        R1 = A * (int) D;
        System.out.println("R1= " + R1);

        A = A++;
        B = A++;

        System.out.println("A = " + A);
        System.out.println("B = " + B);


    }
    
    }

