package Lab05;

public class Q10 {
    public static void main(String[] args) {
        twoLoopsLineal(5);
        twoLoopsLineal(20);
        twoLoopsLineal(40);
        twoLoopsLineal(1000);
    }
    static void twoLoopsLineal(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("i: "+i+", ");
        }
        //Este for seria de O(n)
        for (int j = 0; j < n; j++) {
            System.out.println("ij: "+j+", ");
        }
        //Este otro for igual seria O(n)
        //Al juntar los 2 for dominaria el de mayor complejidad
        //Pero al ser iguales solo se toma O(n)
    }
}
