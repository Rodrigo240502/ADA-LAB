package Lab05;

public class Q9 {
    public static void main(String[] args) {
        root2(5);
        root2(20);
        root2(40);
        root2(1000);
    }
    static void root2(int n){
        for (int i = 1; i*i < n; i++) {
            System.out.println(i+", ");
        }
        /*Aqui vemos que el ciclo se ejecutara cuando i^2 sea menor 
        que n cosa que pasando al otro miembro seria sqrt(n) */
    }
}
