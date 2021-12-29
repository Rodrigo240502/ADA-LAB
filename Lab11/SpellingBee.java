package Lab11;
import java.util.Scanner;

public class SpellingBee {

    public static Boolean isValid(String word, String charsDados) {
        // Inicializamos la variable para saber si contiene un char especifico
        boolean contieneChar = false;

		// Guardamos el primer char dado en el parametro charsDados
		char primerChar = charsDados.charAt(0);

		// Verificamos si la palabra tiene el largo minimo
		if(word.length() < 4)
			return false;

		// Convertimos la palabra a un array de Chars
		char[] wordChars = word.toCharArray();

		// Iteramos los char del array 
		for(char c : wordChars) {
			// Revisamos si esta dentro de los 7 char dados
			if(charsDados.indexOf(c) == -1)
				return false;

			//Si conntiene un char cambiamos la bandera a true
			if(!contieneChar && c == primerChar)
				contieneChar = true;
		}

		return contieneChar;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String charsDados = sc.nextLine(), word;
		int inputSize = Integer.valueOf(sc.nextLine());

		// Ingreso de palabras
		for(int i = 0; i < inputSize; i++) {
			word = sc.nextLine();

			// Verificamos si es valida en los chars dados
			if(isValid(word, charsDados))
				System.out.println(word);
		}

		// Cerramos el scanner
		sc.close();
	}
}