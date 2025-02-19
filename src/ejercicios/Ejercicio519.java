package ejercicios;

import java.util.Scanner;

public class Ejercicio519 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] dorsales = new int[100];
	        int[] menoresEdad = new int[100];
	        int[] expulsados = new int[100];
	        int[] noPagados = new int[100];
	        int countDorsales = 0;
	        int countMenores = 0;
	        int countExpulsados = 0;
	        int countNoPagados = 0;

	        System.out.println("Introduce el dorsal de cada corredor al llegar a meta (-1 para finalizar):");
	        int dorsal;
	        do {
	            dorsal = scanner.nextInt();
	            if (dorsal >= 0) {
		            if (dorsal != -1) {
		                dorsales[countDorsales++] = dorsal;
		            }
	            }
		         else if (dorsal !=-1 && dorsal<0){ 
		            	System.out.println("Tu dorsal no puede ser negativo");
		          }
	            
	        } while (dorsal != -1);

	        System.out.println("Introduce los dorsales de los corredores menores de edad (-1 para finalizar):");
	        int dorsalMenor;
	        do {
	        	
	       dorsalMenor = scanner.nextInt();
	         if (dorsalMenor >= 0) {
	            boolean existe = false;
	            	for (int i = 0; i < countDorsales; i++) {
	            		if (dorsales[i] == dorsalMenor) {
	            			existe = true;
	            			break;
	            			}
	            	}
	            		if (existe) {
	            			menoresEdad[countMenores++] = dorsalMenor;
	            		} else if (dorsalMenor != -1) {
	            			System.out.println("El dorsal " + dorsalMenor + " no existe en la lista de llegados a meta.");
	            		}
	           	}        
	         else if (dorsalMenor !=-1 && dorsalMenor<0) {
	        	 System.out.println("El dorsal no puede tener un numero negativo");
	         }
	            
	        } while (dorsalMenor != -1);

	        for (int i = 0; i < countMenores; i++) {
	            for (int j = 0; j < countDorsales; j++) {
	                if (dorsales[j] == menoresEdad[i] && j > 0) {
	                    int temp = dorsales[j];
	                    dorsales[j] = dorsales[j - 1];
	                    dorsales[j - 1] = temp;
	                }
	            }
	        }

	        System.out.println("Introduce los dorsales de los corredores expulsados (-1 para finalizar):");
	        int dorsalExpulsado;
	        do {
	            dorsalExpulsado = scanner.nextInt();
	            if (dorsalExpulsado>0) {
	            	boolean existe = false;
	            		for (int i = 0; i < countDorsales; i++) {
	            			if (dorsales[i] == dorsalExpulsado) {
	            				existe = true;
	            				break;
	            			}
	            		}
	            	if (existe) {
	            		expulsados[countExpulsados++] = dorsalExpulsado;
	            } else if (dorsalExpulsado != -1) {
	                System.out.println("El dorsal " + dorsalExpulsado + " no existe en la lista de llegados a meta.");
	            	}
	            }
	            else if (dorsalExpulsado !=-1 && dorsalExpulsado<0) {
	            	System.out.println("Tu dorsal no puede ser negativo");
	            }
	        } while (dorsalExpulsado != -1);

	        int newCountDorsales = 0;
	        for (int i = 0; i < countDorsales; i++) {
	            boolean encontrado = false;
	            for (int j = 0; j < countExpulsados; j++) {
	                if (dorsales[i] == expulsados[j]) {
	                    encontrado = true;
	                    break;
	                }
	            }
	            if (!encontrado) {
	                dorsales[newCountDorsales++] = dorsales[i];
	            }
	        }
	        countDorsales = newCountDorsales;

	        System.out.println("Introduce los dorsales de los corredores que no han pagado la inscripción (-1 para finalizar):");
	        int dorsalNoPagado;
	        do {
	            dorsalNoPagado = scanner.nextInt();
	            boolean existe = false;
	            for (int i = 0; i < countDorsales; i++) {
	                if (dorsales[i] == dorsalNoPagado) {
	                    existe = true;
	                    break;
	                }
	            }
	            if (existe) {
	                noPagados[countNoPagados++] = dorsalNoPagado;
	            } else if (dorsalNoPagado != -1) {
	                System.out.println("El dorsal " + dorsalNoPagado + " no existe en la lista de llegados a meta.");
	            }
	        } while (dorsalNoPagado != -1);
	        for (int i = 0; i < countNoPagados; i++) {
	            for (int j = 0; j < countDorsales; j++) {
	                if (dorsales[j] == noPagados[i]) {
	                    for (int k = j; k < countDorsales - 1; k++) {
	                        dorsales[k] = dorsales[k + 1];
	                    }
	                    dorsales[countDorsales - 1] = noPagados[i];
	                    break;
	                }
	            }
	        }
	        
	        if (countDorsales>=3) {
				System.out.println("Medalla de oro:" + " " + dorsales[0]);
				System.out.println("Medalla de plata:" + " " + dorsales[1]);
				System.out.println("Medalla de bronce:" + " " + dorsales[2]);
	        	}
	        scanner.close();
	    	}
		}