package Lab06;

public class SearchBig {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 5, 9, 10};
        System.out.println(searchBig(array,5));
        System.out.println(searchBig(array,11));

    }
    public static String searchBig(int[] a, int search) {
		
		int izq = 0;
		int der = a.length - 1;
		int medio = 0;
        int mayor = 0;
		
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
			mayor = -1;
		}
        if(mayor == -1 && medio +1 < a.length){
            return "No se encontro el elemento "+search+" pero se encontro "+ 
           "el primer mayor que es  "+a[medio+1] ;
        }
        return "No se encontro el elemento y no presenta un mayor inmediato";
	}
}
