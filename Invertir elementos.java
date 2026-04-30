import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6]; // arreglo de 6 posiciones

        System.out.println("Ingresa 6 números enteros:");

        // Leer los números
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar arreglo invertido
        System.out.println("\nArreglo invertido:");

        for (int i = 5; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}