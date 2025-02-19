package ejercicios;

public class buscarTablas {
    public static int buscar(int[] t, int clave) {
	        for (int i = 0; i < t.length; i++) {
	            if (t[i] == clave) {
	                return i; // Devuelve la posición donde se encuentra la clave
	            }
	        }
	        return -1; // Devuelve -1 si no se encuentra la clave
	    }

	    public static void main(String[] args) {
	        int[] tabla = {3, 8, 2, 5, 9, 1}; 
	        int clave = 5;
	        
	        int resultado = buscar(tabla, clave);
	        
	        if (resultado != -1) {
	            System.out.println("Se ha encontrado el numero en la posicion: " + resultado);
	        } else {
	            System.out.println("NO se ha encontrado el numero");
	        }
	    }
	}
