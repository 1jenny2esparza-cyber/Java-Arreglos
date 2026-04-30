import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[8]; // arreglo de 8 posiciones
        
        System.out.println("Ingresa 8 números enteros:");

        // Leer los números
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorrer el arreglo
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        scanner.close();
    }
}