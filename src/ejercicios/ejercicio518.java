package ejercicios;
import java.util.Scanner;
public class ejercicio518 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        
	        System.out.println("Introduce los 16 valores de la matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Valor" + " " + i + " " + j + ": ");
	                matriz[i][j] = sc.nextInt();
	            }
	        }
	        int sumaReferencia = 0;
	        for (int j = 0; j < 4; j++) {
	            sumaReferencia += matriz[0][j];
	        }

	        boolean esMagica = true;
	        for (int i = 1; i < 4; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < 4; j++) {
	                sumaFila += matriz[i][j];
	            }
	            if (sumaFila != sumaReferencia) {
	                esMagica = false;
	                break;
	            }
	        }
	        if (esMagica) {
	            for (int j = 0; j < 4; j++) {
	                int sumaColumna = 0;
	                for (int i = 0; i < 4; i++) {
	                    sumaColumna += matriz[i][j];
	                }
	                if (sumaColumna != sumaReferencia) {
	                    esMagica = false;
	                    break;
	                }
	            }
	        }
	        if (esMagica) {
	            System.out.println("La matriz SÍ es mágica.");
	        } else {
	            System.out.println("La matriz NO es mágica.");
	        }

	        sc.close();
	    }
	}
