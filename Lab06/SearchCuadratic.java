package Lab06;

public class SearchCuadratic{
    public static void main(String[] args) {
        System.out.println(cuadraticSearch(16));
        System.out.println(cuadraticSearch(20));

    }
    public static String cuadraticSearch(int search) {
		
		int izq = 0;
		int der = search;
		int mitad;
		
		while(izq <= der) {
						
			mitad = izq + (der - izq)/2;			
			
			if(mitad*mitad == search) {
				return "El elemento "+search+" es un cuadrado";
                //Si la multiplicacion de la mitad consigo mismo es el
                //numero se devolvera
			} 
            else if (mitad*mitad < search) {
				//Comparamos si la multiplicacion de la mitad consigo mismo es menor
                //que la busqueda en caso lo sea aumentamos el indice izquierdo
				izq = mitad + 1;
			} 
            else {		
				//En caso no ser ni igual ni menor seria mayor en ese caso
				//reducimos el indice derecho 
				der = mitad - 1;
			}
			
		}
		return "El elemento "+ search +" no es un cuadrado";	
	}
}