def longestIncreasingSubSequence(arr):
    n = len(arr)
  
    # Inicializamos el arreglo auxiliar con 1
    auxArr = [1]*n
  
    # En el primer for recorremos los elementos desde el de posicion 1 hasta n-1
    for i in range (1, n):
        # En el segundo for recorremos desde el elemento 0 hasta i que depende de n 
        for j in range(0, i):
            # Compararemos si el elemento de posicion i es mayor al de posicion j que
            # sabemos es i-1, osea comparamos con el anterior, y comparamos el elemento
            # de auxArr[i] sea menor al de auxArr[j]+1 en el caso inicial todos serian 1
            if arr[i] > arr[j] and auxArr[i]< auxArr[j] + 1 :
                # Definiremos a auxArr[i] como el anterior mas uno que significa que hay
                # una secuencia creciente
                auxArr[i] = auxArr[j]+1
                
    # Esta sera la variable que guarde la maxima longitud
    maxNum = 0
  
    # Aseguramos que el numero que retornaremos es el maximo
    for i in range(n):
        maxNum = max(maxNum, auxArr[i])
  
    return maxNum

arr = [ 10, 9, 2, 5, 3, 7, 101, 18 ]
print(longestIncreasingSubSequence(arr))