package es.sypbl2.ac1;

import java.util.Scanner;

public class Actividad1 {

	/**
	 * asignamos valores por argumentos o par�metros
	 * @param args si hay tres args validamos que nos sirvan, sino se pedir�n por par�metro
	 */
	public static void main(String[] args) {
		int procesos, s1, s2, parcial, parcial2;
		int total = 0;
		Scanner teclado = new Scanner(System.in);
		if (args.length == 3) {
			s1 = Integer.parseInt(args[0]);
			s2 = Integer.parseInt(args[1]);
			procesos = Integer.parseInt(args[2]);
		} else {
			System.out.print("Introduce valor 1: ");
			s1 = teclado.nextInt();
			System.out.print("Introduce valor 2: ");
			s2 = teclado.nextInt();
			System.out.print("�En cu�ntos procesos quieres realizarlo? ");
			procesos = teclado.nextInt();
		}

		parcial = s2 / procesos;
		
		/**
		 * lanzamos tantos procesos como se haya indicado
		 */
		for (int i = 1; i <= procesos; i++) {
			parcial2 = parcial * i;
			total += Suma(s1, parcial2);
			System.out.println("Suma parcial " + i + ": " + Suma(s1, parcial2));
			s1 = parcial2 + 1;

		}
		System.out.println("Total: " + total);
		teclado.close();

	}
	
	/**
	 * m�todo para devolver la suma
	 * 
	 * @param s1 argumento 1
	 * @param s2 argumento 2
	 * @return devuelve la suma
	 */
	public static int Suma(int s1, int s2) {
		int total = 0;
		for (int i = s1; s1 <= s2; i++) {
			total = total + i;
			s1++;
		}

		return total;
	}

}
