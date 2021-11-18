package Lab02;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] array = { 2, 4, 5, 1, 8, 9, 6, 7 };
        printArray(array);
        insertionSort(array);
        //Ordenando Arreglo
        printArray(array);

    }
    static void insertionSort(int[] a) {
		
		int pos, temp;
		for(int i = 0; i < a.length; i++) {
			pos = i;
			temp = a[i];
			while((pos > 0) && (a[pos - 1] > temp)) {
				a[pos] = a[pos - 1];
				pos--;
			}
			a[pos] = temp;
		}
		
	}

    static void printArray(int[] a) {
		
		System.out.print("[ ");
		for(int i:a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
	}
}
