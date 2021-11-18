package Lab01;
import java.util.*;
/* Escribir una función que reciba 3 números y retorne un array con los números en orden
ascendente */
public class Ejercicio4 {
    public static void main(String[] args) {

		int[] array = llenarArray();
		printArray(array);
        printArray(burbuja(array));
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

    public static int[] burbuja(int[] a)
    {
      int auxiliar;
      int[] arrayOrder;
      for(int i = 2; i < a.length; i++)
      {
        for(int j = 0;j < a.length-i;j++)
        {
          if(a[j] > a[j+1])
          {
            auxiliar = a[j];
            a[j] = a[j+1];
            a[j+1] = auxiliar;
          }   
        }
      }
      arrayOrder = a;
      return arrayOrder;
    }
}
