package Lab06;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 5, 9, 10};
        System.out.println(binarySearch(array, 6));
        System.out.println(binarySearch(array, 15));
    }
    public static String binarySearch(int[] a, int search) {
		
		int izq = 0;
		int der = a.length - 1;
		int medio;
		
		while(izq <= der) {
						
			medio = izq + (der - izq)/2;			
			
			if(a[medio] == search) {
				return "Se encontro el elemento "+a[medio]+ " en la posicion "+medio;
                //Si la busqueda esta justo en ese nodo se retorna
			} 
            else if (a[medio] < search) {
				//Comparamos si el nodo actual osea el del medio es menor
                //que la busqueda en caso lo sea aumentamos el indice izquierdo
				izq = medio + 1;
			} 
            else {		
				//En caso no ser ni igual ni menor seria mayor en ese caso
				//reducimos el indice derecho 
				der = medio - 1;
			}
			
		}
		return "No se encotro el elemento: -1";	
	}
}
