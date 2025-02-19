package ejercicios;

import java.util.Scanner;

public class ejercicio317 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce el primer número: ");
	        int a = scanner.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int b = scanner.nextInt();
	        int menor = (a < b) ? a : b;
	        int maximo_comun_divisor = 1;
	        for (int i = menor; i >= 1; i--) {
	            if (a % i == 0 && b % i == 0) {
	                maximo_comun_divisor = i;
	                break;
	            }
	        }
	        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + maximo_comun_divisor);

	        scanner.close();
	}
}
