import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5]; // arreglo de 5 posiciones
        int suma = 0;

        System.out.println("Ingresa 5 números enteros:");

        // Leer los números y sumarlos
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // acumular suma
        }

        // Mostrar resultado
        System.out.println("\nLa suma total es: " + suma);

        scanner.close();
    }
}