package Lab05;

public class Q7 {
    public static void main(String[] args) {
        log2Lineal(5);
        log2Lineal(20);
        log2Lineal(40);
        log2Lineal(1000);
    }
    static void log2Lineal(int n){
        for (int i = 1; i < n; i*=2) {
            System.out.println(i+", ");
        }
        /* Vemos que depende de n y este a la vez de i que varia de doble
         en doble cosa que seria 2^n que al pasar al otro miembro seria como log2n*/
    }
}
