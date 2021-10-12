package es.sypbl2.ac1;

public class Sumador {

	/**
	 * método para devolver la suma
	 * 
	 * @param s1 argumento 1
	 * @param s2 argumento 2
	 * @return devuelve la suma
	 */
	public int Suma(int s1, int s2) {
		int total = 0;
		for (int i = s1; s1 <= s2; i++) {
			total = total + i;
			s1++;
		}

		return total;
	}
}
