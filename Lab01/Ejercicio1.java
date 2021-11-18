package Lab01;
/*Escribir una función que tenga como parámetro de entrada un array y retorne la suma de los
mismos*/
import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main(String[] args) {

		int[] array = llenarArray();
		printArray(array);
		System.out.println("Suma del Array: " + sumArray(array));
		
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
	
	static int sumArray(int[] a) {
		
		int sum = 0;
		for(int i:a) {
			sum += a[i];
		}
		return sum;
	
	}
	
	static void printArray(int[] a) {
		
		System.out.print("[ ");
		for(int i:a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
	}
	
}

