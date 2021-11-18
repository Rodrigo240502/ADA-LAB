package Lab02;
import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		int[] array = { 2, 4, 5, 1, 8, 9, 6, 7 };
		System.out.print("Ingresar el numero a buscar: ");
		int searchNum = scan.nextInt();
		printArray(array);
		if(busquedaLineal(array, searchNum)){
            System.out.println("Se encontro el numero "+searchNum);
        }
        else {
            System.out.println("No se encontro el numero "+searchNum);
        }
		scan.close();
		
	}

    static void printArray(int[] a) {
		
		System.out.print("[ ");
		for(int i:a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
	}
	
	static boolean busquedaLineal(int[] a, int searchNum) {
		
		boolean search = false;
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] == searchNum) {
				search = true;
				break;
			}
		}
		return search;

	}
}
