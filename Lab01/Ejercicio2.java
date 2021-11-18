package Lab01;
/*Escribir una función que tenga como parámetro de entrada un array y retorne un array en orden
inverso */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

		int[] array = llenarArray();
		printArray(array);
		reverseArray(array);		
	}
	
	static int[] llenarArray() {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros a ingresar: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Ingrese un numero: ");
			int ingreso = sc.nextInt();
			a[i] = ingreso;
		}
        sc.close();
		return a;
		
	}
	
	static void printArray(int[] a) {
		
		System.out.print("[ ");
		for(int i:a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
	}

    static void reverseArray(int[] a) {
		
		System.out.print("Reverse [ ");
		for(int i = a.length-1; i >=0 ; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		
	}
}
