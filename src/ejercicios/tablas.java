package ejercicios;

public class tablas {

	public static void main (String[]args) {
	int enteros[] = new int[5];
	double dobles [] = new double[5];
	boolean booleano[] = new boolean[5];
	
	System.out.println("La referencia de los enteros es" + " " + enteros);
	System.out.println("La referencia de los dobles es" + " " + dobles);
	System.out.println("La referencia de los booleanos es" + " " + booleano);
	direccionMemoria();
	}


public static void direccionMemoria() {
	int a[], b[], c[];
	a = new int [10];
	b = a;
	c = a;
System.out.println("Las referencias de a, b y c son" + " " + a + " " + b + " " + c);	
}
}