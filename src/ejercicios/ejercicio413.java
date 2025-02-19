package ejercicios;

public class ejercicio413 {

	    public static void muestraPares(int n) {
	        int contador = 0;
	        int numero = 0;
	        
	        while (contador < n) {
	            if (numero % 2 == 0) { // Mira si el número es par
	                System.out.println(numero);
	                contador++; 
	            }
	            numero++; 
	        }
	    }

	    public static void main(String[] args) {
	        muestraPares(5);
	    }
	}
