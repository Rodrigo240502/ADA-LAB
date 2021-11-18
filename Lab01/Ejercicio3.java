package Lab01;
import java.util.*;

/* Escribir una función que tenga como parámetro de entrada un array y retorne dos arrays con los
números separados pares e impares. */
public class Ejercicio3 {
    public static void main(String[] args) {

		int[] array = llenarArray();
		printArray(array);
        separar(array);

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

    static void separar(int[] a){

        int[]pares = new int[a.length];
        int numPares = 0;
        int[]impares = new int[a.length];
        int numImpares = 0;
        for(int i:a){
            if(i%2==0){
                pares[numPares] = i;
            }
            else{
                impares[numImpares] = i;
            }
        }
        printArray(pares);
        printArray(impares);

    }
}
