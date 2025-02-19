package ejercicios;

public class ejercicio417 {

	    
	    public static int sumaDivisores(int numero) { // Esto calcula la suma de los divisores
	        int suma = 0;
	        for (int i = 1; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                suma += i;
	            }
	        }
	        return suma;
	    }

	    
	    public static boolean sonAmigos(int a, int b) { // Esto verifica si los numeros son amigos o no
	        return sumaDivisores(a) == b && sumaDivisores(b) == a;
	    }

	    public static void main(String[] args) {
	        int numero1 = 220;
	        int numero2 = 284;

	        if (sonAmigos(numero1, numero2)) {
	            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
	        } else {
	            System.out.println(numero1  + "y " + numero2 + " no son números amigos.");
	        }
	    }
	}
