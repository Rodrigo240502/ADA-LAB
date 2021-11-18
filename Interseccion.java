import java.util.*;
public class Interseccion {

    public static void main(String[] args) {

        int[] a = { 2, 4, 5, 1, 8, 9 };
        int[] b = { 1, 2, 4, 6, 7 };
        System.out.println(intersect(a,b));
    }
    public static ArrayList<Integer> intersect(int[]a, int[]b){
        int iterar = a.length*b.length;
        int j=0;
        int k=0;
        ArrayList<Integer> repetidos = new ArrayList<Integer>();
        for(int i=0;i<iterar;i++){
            if(j<a.length && k<b.length){
                if(a[j]==b[k]){
                    repetidos.add(a[j]);
                    j++;
                }
                k++;
            }
        }
        return repetidos;
    }

}
