package Lab11;
import java.util.Scanner;

public class FindingBorders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Leemos el imput dado y lo convertimos en un array de chars
        char[] chars = sc.nextLine().toCharArray();
        // Longitud de array
        int n = chars.length;
        // Array para longitudes de los bordes
        int[] longsBorde = new int[n];

        // Indice izquierdo y derecho 
        int l = 0;
        int r = 0;

        for (int i = 1; i < n; i++) {
            // Si la long del borde de esa posicion es menor a la del borde derecho - indice 
            if(longsBorde[i-l]<r-i){
                longsBorde[i] = longsBorde[i-l];
            }
            else{
                // En caso no fuera menor redefinimos al indice izquierdo como el indice actual
                l = i;

                // Comparamos si el indice derecho es menor al izquierdo
                // en caso lo fuera lo redefinimos 
                if (r < l){
                    r = l;
                }

                // Mientras que el indice derecho sea menor al tamaño del array
                // y el char actual y el del borde sean iguales aumentamos el 
                // indice derecho
                while (r < n && chars[r] == chars[r - l]){
                    r++;
                }

                // Finalmente damos valor a la longitud de borde como la resta
                // entre ambos indices
                longsBorde[i] = r - l;
            }
        }

        // Imprimimos el arreglo de longitudes a la inversa siempre que la long sea 
        // diferente de 0 e igual a la longitud menos el iterador i que inicialmente es n-1
        for (int i = n - 1; i > 0; i--){
            if (longsBorde[i] == n - i)
                System.out.println(longsBorde[i] + " ");
        }

        sc.close();
    }
    
}
