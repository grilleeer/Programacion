package ejercicios;

import java.util.Random;

public class ejercicio418 {
	

	   
	    public static int generarNumeroAleatorio(int minimo, int maximo) {  // Genera un numero aleatorio en el rango escrito por el usuario
	        Random random = new Random();
	        return random.nextInt((maximo - minimo) + 1) + minimo;
	    }

	    public static void main(String[] args) {
	        int cantidad = 10;
	        int minimo = 1;    
	        int maximo = 100;  

	       
	        for (int i = 0; i < cantidad; i++) {  // Con esto, generamos y mostramos el/los numeros aleatorios
	            int numeroAleatorio = generarNumeroAleatorio(minimo, maximo);
	            System.out.println(numeroAleatorio);
	        }


    }

}
