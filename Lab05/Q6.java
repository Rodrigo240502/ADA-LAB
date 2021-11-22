package Lab05;

public class Q6 {
    public static void main(String[] args) {
        linealP(5);
        linealP(20);
        linealP(40);
        linealP(1000);
    }
    static void linealP(int n){
        int p = 0;
        for (int i = 0; p <= n; i++) {
            p += i;
            System.out.println(p+", ");
        }
        //Vemos que depende de la variable p y esta a la vez de i
        //pero vemos que p varia en numeros de la sumatoria de n que
        //al final generaria un O(n^(1/2))
    }
}
