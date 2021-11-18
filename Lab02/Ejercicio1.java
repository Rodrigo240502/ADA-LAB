package Lab02;
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de datos del arreglo : ");
        int n = sc.nextInt();
        int[]array = llenarArray(n);
        System.out.print("Ingrese el numero a validar divisibilidad : ");
        int k = sc.nextInt();
        int contDiv = divisibles(array, k);
        sc.close();
        System.out.println(array.toString());
        System.out.println(contDiv+" numeros divisibles entre "+k);
    }
    static int[] llenarArray(int n) {
		
		int[] array = new int[n];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			System.out.print("Ingresar un numero: ");
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
		
	}
	
	static int divisibles(int[] a, int k) {
		
		int cont = 0;
		for(int i:a) {
			if(i % k == 0) {
				cont++;
			}
		}
		return cont;
		
	}
}
