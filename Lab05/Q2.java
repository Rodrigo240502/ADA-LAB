package Lab05;

public class Q2 {
    public static void main(String[] args) {
        timeLineal(5);
        timeLineal(20);
        timeLineal(40);
    }
    static void timeLineal(int n){
        for(int i=n; i > 0; i--){
            //Statement
            System.out.println(i+",");
        }
        System.out.println(n);
        //En este caso al ser un for que depende de n su complejidad es O(n)
    }
}
