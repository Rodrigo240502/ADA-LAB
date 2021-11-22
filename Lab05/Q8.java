package Lab05;

public class Q8 {
    public static void main(String[] args) {
        log2LinealDiv(5);
        log2LinealDiv(20);
        log2LinealDiv(40);
        log2LinealDiv(1000);
    }
    static void log2LinealDiv(int n){
        for (int i = n; i >= 1; i /= 2) {
            System.out.println(i+", ");
        }
        /*Al igual que el caso anterior pero en vez de multiplicar
        es division, seria O(log2(n)) */
    }
}
