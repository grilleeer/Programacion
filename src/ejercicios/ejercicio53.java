package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio53 {
    public static void main(String[] args) {
    	
        int sumaPositivos = 0; 
        int sumaNegativos = 0;
        int cuentaPositivos = 0;
        int cuentaNegativos = 0;
        int cuentaCeros = 0;
        
        System.out.print("Introduce la cantidad de números: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cuentaPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }
        sc.close();
        
        int mediaPositivos = (cuentaPositivos > 0) ? (int) sumaPositivos / cuentaPositivos : 0;
        int mediaNegativos = (cuentaNegativos > 0) ? (int) sumaNegativos / cuentaNegativos : 0;

        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros introducidos: " + cuentaCeros);

        System.out.println(Arrays.toString(numeros));
        
    }
}
