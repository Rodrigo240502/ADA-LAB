package Lab05;

public class Q3 {
    public static void main(String[] args) {
        timeLineal(5);
        timeLineal(20);
        timeLineal(40);
    }
    static void timeLineal(int n){
        for(int i=0; i < n; i+=2){
            //Statement
            System.out.println(i+",");
        }
        System.out.println(n);
        
        /*En este caso al ser un for que depende de n su complejidad 
        deberia ser O(n) pero en este caso i que va a iterar en n varia
        de 2 en 2 cosa que seria la mitad del recorrido total por lo tanto 
        seria de complejidad O(n/2) */
    }
}
