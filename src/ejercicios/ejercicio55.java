package ejercicios;

import java.util.Scanner;

public class ejercicio55 {
    public static int[] insertarOrdenado(int[] arreglo, int valor) {
        int n = arreglo.length;
        int[] nuevoArreglo = new int[n + 1];
        int i = 0;
        while (i < n && arreglo[i] < valor) {
            i++;
        }
        
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, i);
        nuevoArreglo[i] = valor;
        System.arraycopy(arreglo, i, nuevoArreglo, i + 1, n - i);
        return nuevoArreglo;
}
    
    public static void mostrarArreglo(int[] arreglo) {
    	for (int num : arreglo) {
    		System.out.println (num);
    	}
    	System.out.println();
    	}
    
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7};
        System.out.println("Introduce un nuevo valor");
        Scanner sc = new Scanner(System.in);
        int nuevoValor = sc.nextInt();

        System.out.println("Antes de insertar:");
        mostrarArreglo(numeros);

        numeros = insertarOrdenado(numeros, nuevoValor);

        System.out.println("Después de insertar:");
        mostrarArreglo(numeros);
    }
    }

        	
        