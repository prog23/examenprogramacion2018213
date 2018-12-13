package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'mostrarVector' que
	 * reciba mediante un parámetro formal un vector de números enteros y lo muestre por
	 * pantalla en una única línea con el formato siguiente:
	 * 
	 * 				[num1, num2, num3, ...., numN]
	 * 
	 * donde num1, num2, num3, ..., numN son los números almacenados en el vector.
	 */
	
	public static int[] mostrarVector(int [] vector) {
		
		
		System.out.print("[");
		for (int i=0; i<vector.length; i++) 		
			System.out.print("n" + vector[i] + (i == vector.length - 1 ? "" : ", "));
		System.out.print("]");	
		
		return vector;	
				
		
	}
	
	
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, la vesión sobrecargada del método anterior que
	 * muestre por pantalla un vector de caracteres con el formato siguiente:
	 * 
	 * 				['c1', 'c2', 'c3', ...., 'cN']
	 * 
	 * donde 'c1', 'c2', 'c3', ...., 'cN' son los caracteres almacenados en el vector.
	 */

	public static boolean Sobrecarga (String [] vector, String cadena) {		
		
		int i = 0;
		while (i < vector.length && !cadena.equals(vector[i])) 		{	
			i++;
		}
		System.out.print("[");	
			System.out.print(vector[i]);
		System.out.print("]");
		return i < vector.length;
					
		}

	
	public static void main(String[] args) {
		
		int [] vector = {1, 2, 3, 4, 5, 6};
		mostrarVector(vector);
		
		System.out.println();
		
		String [] d = {"C1", "C2", "C3", "C4", "C5"};	
		
		System.out.println(Sobrecarga(d, "C1"));
		System.out.println(Sobrecarga(d, "C2"));
		System.out.println(Sobrecarga(d, "C3"));
		System.out.println(Sobrecarga(d, "C4"));
		System.out.println(Sobrecarga(d, "C5"));


	}

	
}

