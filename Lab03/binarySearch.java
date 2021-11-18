package Lab03;

public class binarySearch {
    public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 6, 7, 8, 10, 13, 15, 16, 17 };
		busquedaBinaria(array, 11);
		System.out.println();
		busquedaBinaria(array, 5);
		
	}
	
	public static void busquedaBinaria(int[] a, int searchNum) {
		
		int inferior = 0;
        int medio;
        int superior = a.length;
        boolean aux = false;
        
        //Comparamos mientras que el limite inferio sea menor o igual que el superior
		while(inferior <= superior) {
			medio = (inferior + superior) / 2;
			if(a[medio] == searchNum) {
                //Comparamos el valor a buscar con el elemento del medio y en caso sean
                //iguales lo devolvemos
				System.out.println(searchNum + " esta en la posición: " + medio);
                aux = true;
				break;
			}
			else if(searchNum < a[medio]) {
                //En caso de ser menor en un arbol bajamos a la izquierda, aqui
                //reducimos el superior en el valor de medio 
                //cosa que el medio se actuliza
				superior = medio - 1;
			}
			else {
                //En caso de ser mayor lo mismo pero con el inferior
				inferior = medio + 1;
			}
		}
        //Usamos un aux boolean para saber si se encontro o no
		if(!aux){
            // En caso de no encontrar el numero imprimimos
		    System.out.println(searchNum+" no se encontro en el arreglo");
        }
	}
}
