import java.util.*;

public class RectangleCuttingCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(cutting(a, b));
    }
    static int cutting(int a, int b){
        int[][] array = new int[500][500];
        int minHor = Integer.MAX_VALUE;
        int minVer = Integer.MAX_VALUE;

        if(a == b){
            return 1;
        }
        if (array[a][b] != 0){
            return array[a][b];
        }
        for (int i = 1; i < a/2; i++) {
            minHor = Math.min(cutting(i,b)+cutting(a-i,b),minHor);
        }
        for (int j = 1; j < b/2; j++) {
            minVer = Math.min(cutting(a, j)+cutting(a, b-j), minVer);
        }
        array[a][b] = Math.min(minHor,minVer);
        return array[a][b];
    }
}
