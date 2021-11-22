package Lab05;

public class Q4 {
    public static void main(String[] args) {
        timeLineal(5);
        timeLineal(20);
        timeLineal(40);
    }
    static void timeLineal(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.println((i+j)+", ");
            }
        }
        System.out.println(n);
        
        /*En este caso vemos dos ciclos for, el primero depende de n y
         el de adentro tambien depende de n como esta dentro del primero
         seria n de n por lo tanto O(n^2) */
    }
}
