package ejercicios;
import java.util.Scanner;

public class ejercicio514 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int maxPersonas = 100; // 
		        int[] salarios = new int[maxPersonas];
		        int contador = 0; 

		        while (true) {
		            System.out.print("Introduce el salario (o -1 para terminar): ");
		            int salario = sc.nextInt();

		            if (salario == -1) {
		                break;
		            }

		            if (contador < maxPersonas) {
		                salarios[contador] = salario;
		                contador++;
		            } else {
		                System.out.println("Se ha alcanzado el límite de 100 salarios.");
		                break;
		            }
		        }

		        sc.close();

		        if (contador == 0) {
		            System.out.println("No se introdujeron salarios.");
		            return;
		        }

		        for (int i = 0; i < contador - 1; i++) {
		            for (int j = 0; j < contador - 1 - i; j++) {
		                if (salarios[j] < salarios[j + 1]) {
		                    int temp = salarios[j];
		                    salarios[j] = salarios[j + 1];
		                    salarios[j + 1] = temp;
		                }
		            }
		        }

		        int salarioMaximo = salarios[0];
		        int salarioMinimo = salarios[contador - 1];
		        int sumaSalarios = 0;

		        for (int i = 0; i < contador; i++) {
		            sumaSalarios += salarios[i];
		        }

		        double salarioMedio = (double) sumaSalarios / contador;

	
		        System.out.println("Salarios ordenados de forma decreciente:");
		        for (int i = 0; i < contador; i++) {
		            System.out.print(salarios[i] + " ");
		        }
		        System.out.println(" ");
		        System.out.println("Salario máximo: " + salarioMaximo);
		        System.out.println("Salario mínimo: " + salarioMinimo);
		        System.out.println("Salario medio: " + salarioMedio);
		    }
		}
