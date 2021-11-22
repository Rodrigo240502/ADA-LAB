package Lab05;

public class Q12 {
    public static void main(String[] args) {
        nLogn(5);
        nLogn(20);
        nLogn(40);
        nLogn(1000);
    }
    static void nLogn(int n){
        for(int i = 0; i < n; i++) {
            //Este ciclo for es de O(n)
			for(int j = 1; j < n; j = j * 2) {
                //Este otro for es de log2(n)
                    System.out.println();
			}		
		}
        //Al ser un for anidado se deben multiplicar las complejidades
        //y quedaria como O(n*log2(n))
    }
}
