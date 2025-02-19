package ejercicios;

public class ejercicio415 {

	    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
	   
	        int totalMinutos1 = hora1 * 60 + minuto1; //Convierte las horas a minutos
	        int totalMinutos2 = hora2 * 60 + minuto2;

	        
	        return Math.abs(totalMinutos1 - totalMinutos2); // Calcula la diferencia  en minutos
	    }

	    public static void main(String[] args) {
	        int hora1 = 10, minuto1 = 30;
	        int hora2 = 12, minuto2 = 15;

	        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);

	        System.out.println("La diferencia en minutos es: " + diferencia);
	    }
	}
