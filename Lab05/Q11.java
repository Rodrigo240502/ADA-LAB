package Lab05;

public class Q11 {
    public static void main(String[] args) {
        twoLoopsLog2(5);
        twoLoopsLog2(20);
        twoLoopsLog2(40);
        twoLoopsLog2(1000);
    }
    static void twoLoopsLog2(int n){
        int p = 0;
		
		for(int i = 1; i < n; i = i * 2) { 
			p++;		
		}
		// Este ciclo for lo vimos anteriormente y es de O(log2(n))		
		for(int j = 1; j < p; j = j * 2) { 
			
		}
        //Este otro depende de p y seria O(log2(p))
        //Pero p al depender del otro for en general seria
        //O(log2(log2(n)))
    }
}
