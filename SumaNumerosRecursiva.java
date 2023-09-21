import java.util.Scanner;

public class SumaNumerosRecursiva {
    public static int sumaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("Brayam Edwin Quispe Apaza");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();
        int suma = sumaRecursiva(numero);
        System.out.println("La suma de los primeros " + numero + " números enteros es: " + suma);
    }
}


