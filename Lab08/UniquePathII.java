
/*A robot is located at the top-left corner of a m x n obstacleGrid (marked 'Start' in the diagram below).
The robot can only move either down or right at any point in time. The robot is trying to reach 
the bottom-right corner of the obstacleGrid (marked 'Finish' in the diagram below).Now consider if some 
obstacles are added to the grids. How many unique paths would there be?
An obstacle and space is marked as 1 and 0 respectively in the obstacleGrid. */

public class UniquePathII {

    public static void main(String[] args) {
        int[][] camino = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(camino));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		// Metodo que recibe la matriz
		
		System.out.println("Filas: " + obstacleGrid.length + ", Columnas: " + obstacleGrid[0].length);
		

        if(obstacleGrid[0][0]==1){
            // Verificamos que la posicion del robot no este obstaculisada
            return 0;
        }
        // En caso de no ser 1 que es obstaculo, sería 0 tenemos que establecerlo en 1
        // y seguimos adelante.
        obstacleGrid[0][0] = 1;

        // Ahora llenaremos la primera columna con 1 ya que son caminos que podemos
        // usar solo si la columna es 0 y no haya obstaculo.
        for(int i=1;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1){
                obstacleGrid[i][0]=1;
            }
            else obstacleGrid[i][0] = 0;
        }

        // Ahora llenaremos la primera fila con 1 ya que son caminos que podemos
        // usar solo si la fila es 0 y no haya obstaculo.
        for(int i=1;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i]==0 && obstacleGrid[0][i-1]==1){
                obstacleGrid[0][i]=1;
            }
            else obstacleGrid[0][i] = 0;
        }

        // Una vez sabiendo los caminos iniciales procederemos a sumar los valores
        // de arriba e izquierda respectivamente
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==0){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
                else{
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        // Finalmente retornamos el valor de la ultima celda que contiene la suma
        // de los posibles caminos 
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
