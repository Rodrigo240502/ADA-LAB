package Lab11;
import java.util.Scanner;
import java.lang.String;

public class SpellingBee {

    public static Boolean isValid(String word, String givenLetters) {
        // Inicializamos la variable para saber si contiene un char especifico
        boolean containsSpecifcCharacter = false;

		// Guardamos el char dado como param
		char startingLetter = givenLetters.charAt(0);

		// Verificamos si la palabra tiene el largo minimo
		if(word.length() < 4)
			return false;

		// Convertimos la palabra a un array de Chars
		char[] wd = word.toCharArray();

		// Iteramos los char del array 
		for(char c : wd) {
			// Revisamos si esta dentro de los 7 char dados
			if(givenLetters.indexOf(c) == -1)
				return false;

			//Si conntiene un char cambiamos la bandera a true
			if(!containsSpecifcCharacter && c == startingLetter)
				containsSpecifcCharacter = true;
		}

		return containsSpecifcCharacter;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String givenLetters = sc.nextLine(), word;
		int inputSize = Integer.valueOf(sc.nextLine());

		// Ingreso de palabras
		for(int i = 0; i < inputSize; i++) {
			word = sc.nextLine();

			// Verificamos si es valida
			if(isValid(word, givenLetters))
				System.out.println(word);
		}

		// Cerramos el scanner
		sc.close();
	}
}