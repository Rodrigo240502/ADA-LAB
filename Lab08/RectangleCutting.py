def cutting(m, n):

    # Creamos un arreglo bidimensional para guardar los valores
    # como la pagina dice maximo 500
    aux = []
    for i in range(500):
        aux.append([])
        for j in range(500):
            aux[i].append(0)

    # Definimos los valores minimos como maximos
    minHor = 100000000 # No contamos como Java con un Int Maximo
    minVer = 100000000 # No contamos como Java con un Int Maximo

    # Primero comparamos si son iguales ya que serian un cuadrado
    if m==n:
        return 1

    # En caso el valor ya haya sido calculado anteriormente
    if aux[m][n] !=0:
        return aux[m][n]
    
    # Recorremos de manera recursiva hallando el minimo Horizontal entre
    #  si mismo y la suma de 
    for i in range(1,(m//2)+1):
        minHor = min(cutting(i,n)+cutting(m-i,n),minHor)

    # Recorremos de manera recursiva hallando el minimo Vertical entre
    # si mismo y la suma de 
    for j in range(1,(n//2)+1):
        minVer = min(cutting(m,j)+cutting(m,n-j),minVer)
    
    aux[m][n] = min(minHor,minVer)
    return aux[m][n]

print(cutting(5,3))